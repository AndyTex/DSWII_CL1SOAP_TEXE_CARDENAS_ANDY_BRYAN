package pe.edu.cibertec.api_soap_pubs_examen.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.cuadrado.CalculateResponse;

@Endpoint
public class CuadradoEndPoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/cuadrado";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CalculateRequest")
    @ResponsePayload
    public CalculateResponse calculateNumbers() {
        CalculateResponse response = new CalculateResponse();
        for (int i = 15; i <= 70; i++) {
            CalculateResponse.NumberDetail detail = new CalculateResponse.NumberDetail();
            detail.setNumber(i);
            detail.setSquare(i * i);
            detail.setHalf(i / 2.0);
            response.getNumberDetail().add(detail);
        }
        return response;
    }
}
