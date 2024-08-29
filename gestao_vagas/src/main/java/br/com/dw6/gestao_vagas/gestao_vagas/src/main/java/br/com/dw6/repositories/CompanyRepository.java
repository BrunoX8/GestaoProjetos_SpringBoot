package br.com.dw6.repositories;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dw6.gestao_vagas.model.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID>
{
    Optional<CompanyEntity> findyByUsernameOrEmail(String username, String email);
}
