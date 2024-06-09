package pe.edu.cibertec.api_soap_pubs_examen.endpoint;


import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.obrero.CalcularSalarioRequest;
import pe.edu.cibertec.ws.obrero.CalcularSalarioResponse;

import pe.edu.cibertec.ws.obrero.ObreroResponse;

@AllArgsConstructor
@Endpoint
public class ObreroEndPoint {
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/obrero";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "calcularSalarioRequest")
    @ResponsePayload
    public CalcularSalarioResponse calcularSalario(@RequestPayload CalcularSalarioRequest request){
        CalcularSalarioResponse response = new CalcularSalarioResponse();
        ObreroResponse obrero = new ObreroResponse();

        obrero.setSalarioFinal(calcularSalarioFinal(request.getHoras()));
        response.setObrero(obrero);
        return response;
    }

    private double calcularSalarioFinal(int horas) {

        return horas * 16.0;  
    }
}
