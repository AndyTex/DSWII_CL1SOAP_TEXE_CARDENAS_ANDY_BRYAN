package pe.edu.cibertec.api_soap_pubs_examen.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.api_soap_pubs_examen.model.Medico;
import pe.edu.cibertec.ws.objects.Medicows;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

@Component
public class MedicoConvert {
    public Medico convertMedicowsToMedico(Medicows medicows){
        Medico medico = new Medico();
        medico.setIdmedico(medicows.getIdmedico());
        medico.setNommedico(medicows.getNommedico());
        medico.setApemedico(medicows.getApemedico());
        medico.setFechnacmedico(medicows.getFechnacmedico().toGregorianCalendar().getTime());
        return medico;

    }

    public List<Medico> convertMedicowsToMedico(List<Medicows> medicows){
        List<Medico> medicoList = new ArrayList<>();
        medicows.forEach(med ->{
            medicoList.add(convertMedicowsToMedico(med));
        });
        return medicoList;
    }
    public Medicows convertMedicoToMedicoWs(Medico medico){
        Medicows medicows = new Medicows();
        medico.setIdmedico(medicows.getIdmedico());
        medico.setNommedico(medicows.getNommedico());
        medico.setApemedico(medicows.getApemedico());
        medico.setFechnacmedico(medicows.getFechnacmedico().toGregorianCalendar().getTime());
        return medicows;
    }
    public List<Medicows> convertMedicoToMedicoWs(List<Medico> medico){
        List<Medicows> medicoList = new ArrayList<>();
        medico.forEach(med ->{
            medicoList.add(convertMedicoToMedicoWs(med));
        });
        return medicoList;
    }

    private XMLGregorianCalendar convertDateToXMLGregorianCalendar(java.util.Date date) {
        try {
            GregorianCalendar gCalendar = new GregorianCalendar();
            gCalendar.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException("Error al convertir fecha", e);
        }
    }
}
