package pe.edu.cibertec.api_soap_pubs_examen.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.api_soap_pubs_examen.model.Medico;
import pe.edu.cibertec.ws.objects.Medicows;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Component
public class MedicoConvert {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public Medico convertMedicowsToMedico(Medicows medicows){
        Medico medico = new Medico();
        medico.setIdmedico(medicows.getIdmedico());
        medico.setNommedico(medicows.getNommedico());
        medico.setApemedico(medicows.getApemedico());
        if (medicows.getFechnacmedico() != null) {
            medico.setFechnacmedico(medicows.getFechnacmedico().toGregorianCalendar().getTime());
        }
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
        medicows.setIdmedico(medico.getIdmedico());
        medicows.setNommedico(medico.getNommedico());
        medicows.setApemedico(medico.getApemedico());
        if (medico.getFechnacmedico() != null) {
            medicows.setFechnacmedico(convertDateToXMLGregorianCalendar(medico.getFechnacmedico()));
        }
        return medicows;
    }
    public List<Medicows> convertMedicoToMedicoWs(List<Medico> medico){
        List<Medicows> medicoList = new ArrayList<>();
        medico.forEach(med ->{
            medicoList.add(convertMedicoToMedicoWs(med));
        });
        return medicoList;
    }

    private XMLGregorianCalendar convertDateToXMLGregorianCalendar(Date date) {
        try {
            GregorianCalendar gCalendar = new GregorianCalendar();
            gCalendar.setTime(date);
            XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
            // Establecer correctamente los campos de la fecha
            xmlGregorianCalendar.setYear(gCalendar.get(GregorianCalendar.YEAR));
            xmlGregorianCalendar.setMonth(gCalendar.get(GregorianCalendar.MONTH) + 1); // XMLGregorianCalendar es 1-based para el mes.
            xmlGregorianCalendar.setDay(gCalendar.get(GregorianCalendar.DAY_OF_MONTH));
            xmlGregorianCalendar.setHour(DatatypeConstants.FIELD_UNDEFINED);
            xmlGregorianCalendar.setMinute(DatatypeConstants.FIELD_UNDEFINED);
            xmlGregorianCalendar.setSecond(DatatypeConstants.FIELD_UNDEFINED);
            xmlGregorianCalendar.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
            xmlGregorianCalendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
            return xmlGregorianCalendar;
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException("Error al convertir la fecha", e);
        }
    }

}
