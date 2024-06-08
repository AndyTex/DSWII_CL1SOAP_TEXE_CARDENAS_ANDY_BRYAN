package pe.edu.cibertec.api_soap_pubs_examen.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.api_soap_pubs_examen.exception.NotFoundException;
import pe.edu.cibertec.api_soap_pubs_examen.service.MedicoService;
import pe.edu.cibertec.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class MedicoEndPoint {

    private MedicoService medicoService;
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMedicosRequest")
    @ResponsePayload
    public GetMedicosResponse getMedicos(@RequestPayload
                                         GetMedicosRequest request){
        GetMedicosResponse response = new GetMedicosResponse();
        response.getMedicos().addAll(medicoService.listarMedicos());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMedicoRequest")
    @ResponsePayload
    public GetMedicoResponse getMedico(@RequestPayload
                                             GetMedicoRequest request){
        GetMedicoResponse response = new GetMedicoResponse();
        Medicows medicows = medicoService.obtenerMedicoxId(request.getId());
        if(medicows == null)
            throw new NotFoundException("El medico con el ID " + request.getId()+" no existe!");
        response.setMedico(medicows);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postmedicoRequest")
    @ResponsePayload
    public PostMedicoResponse saveMedico(@RequestPayload
                                               PostmedicoRequest request){
        PostMedicoResponse response = new PostMedicoResponse();
        response.setMedico(medicoService.registrarActualizarMedico(
                request.getMedico()));
        return response;
    }
}
