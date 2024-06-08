package pe.edu.cibertec.api_soap_pubs_examen.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.numbers.SumNumbersRequest;
import pe.edu.cibertec.ws.numbers.SumNumbersResponse;

@Endpoint
public class NumeroEndPoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/numbers";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SumNumbersRequest")
    @ResponsePayload
    public SumNumbersResponse sumNumbers(@RequestPayload SumNumbersRequest request) {
        int limit = request.getLimit();
        int sum = (limit * (limit + 1)) / 2; // Calcula la suma de los números hasta el límite usando la fórmula de la suma de enteros consecutivos.

        SumNumbersResponse response = new SumNumbersResponse();
        response.setSum(sum);
        return response;
    }
}
