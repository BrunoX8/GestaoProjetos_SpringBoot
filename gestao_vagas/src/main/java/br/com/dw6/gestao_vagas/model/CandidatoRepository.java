package br.com.dw6.gestao_vagas.model;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<CandidatoEntity, UUID> {
    
}
