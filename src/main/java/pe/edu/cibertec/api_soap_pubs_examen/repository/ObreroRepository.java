package pe.edu.cibertec.api_soap_pubs_examen.repository;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.obrero.Obrero;

import java.util.HashMap;
import java.util.Map;

@Component
public class ObreroRepository {
    private Map<String, Obrero> obreros = new HashMap<>();

    public Obrero calcularSalario(int horasxTrabajadas) {
        Obrero obrero = new Obrero();
        obrero.setHoras(horasxTrabajadas);
        int horasxLimite = 40;
        int horasExtra = 0;
        double salarioxHora = 16;
        double salarioHoraextra = 20;
        double salarioxFinal;

        if (horasxTrabajadas <= horasxLimite) {
            salarioxFinal = salarioxHora * horasxTrabajadas;
        } else {
            horasExtra = horasxTrabajadas - horasxLimite;
            salarioxFinal = (salarioxHora * horasxLimite) + (salarioHoraextra * horasExtra);
            obrero.setHorasxextra(horasExtra);
            obrero.setSalarioxhoraextra(salarioHoraextra * horasExtra);
        }
        obrero.setSalarioxfinal(salarioxFinal);
        return obrero;
    }




}
