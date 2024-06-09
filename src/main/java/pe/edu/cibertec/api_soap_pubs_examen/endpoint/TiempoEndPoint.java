package pe.edu.cibertec.api_soap_pubs_examen.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.tiempo.CalculateMinutesRequest;
import pe.edu.cibertec.ws.tiempo.CalculateMinutesResponse;

@Endpoint
public class TiempoEndPoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/tiempo";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CalculateMinutesRequest")
    @ResponsePayload
    public CalculateMinutesResponse calculateMinutes(@RequestPayload CalculateMinutesRequest request) {
        int seconds = request.getSeconds();
        int minutes = seconds / 60;

        CalculateMinutesResponse response = new CalculateMinutesResponse();
        response.setMinutes(minutes);
        return response;
    }



}
