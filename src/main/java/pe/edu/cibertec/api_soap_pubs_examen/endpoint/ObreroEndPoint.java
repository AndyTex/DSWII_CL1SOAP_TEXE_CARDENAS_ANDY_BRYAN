package pe.edu.cibertec.api_soap_pubs_examen.endpoint;


import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.api_soap_pubs_examen.repository.ObreroRepository;
import pe.edu.cibertec.ws.obrero.CalcularSalarioRequest;
import pe.edu.cibertec.ws.obrero.CalcularSalarioResponse;
import pe.edu.cibertec.ws.obrero.Obrero;

@AllArgsConstructor
@Endpoint
public class ObreroEndPoint {

    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/obrero";
    private ObreroRepository obreroRepository;

    @PayloadRoot(namespace = NAMESPACE_URL,
            localPart = "calcularSalarioRequest")
    @ResponsePayload
    public CalcularSalarioResponse getSalary(@RequestPayload CalcularSalarioRequest request){
        CalcularSalarioResponse response = new CalcularSalarioResponse();
        Obrero obrero = obreroRepository.calcularSalario(request.getHoras());
        response.setObrero(obrero);
        return response;
    }
}
