package pe.edu.cibertec.api_soap_pubs_examen.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.api_soap_pubs_examen.repository.PromedioRepository;
import pe.edu.cibertec.ws.promedio.Promedio;
import pe.edu.cibertec.ws.promedio.PromedioRequest;
import pe.edu.cibertec.ws.promedio.PromedioResponse;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Endpoint
public class PromedioEndPoint {
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/promedio";
    private final PromedioRepository promedioRepository;
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "PromedioRequest")
    @ResponsePayload
    public PromedioResponse calcularPromedio(@RequestPayload PromedioRequest request) {
        Promedio promedio = promedioRepository.calcularNotas(
                request.getNota1(), request.getNota2(), request.getNota3(), request.getNota4());

        PromedioResponse response = new PromedioResponse();
        response.setNotaminima(promedio.getNotaminima());
        response.setPromedio(promedio.getPromedio());

        return response;
    }
}
