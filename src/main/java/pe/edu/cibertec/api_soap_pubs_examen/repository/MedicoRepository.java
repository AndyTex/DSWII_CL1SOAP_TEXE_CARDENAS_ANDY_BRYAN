package pe.edu.cibertec.api_soap_pubs_examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_soap_pubs_examen.model.Medico;

@Repository
public interface MedicoRepository  extends JpaRepository<Medico, Integer> {
}
