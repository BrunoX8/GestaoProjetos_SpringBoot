package br.com.dw6.gestao_vagas.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dw6.gestao_vagas.model.CompanyEntity;
import br.com.dw6.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;
    
    private void execute(CompanyEntity companyEntity)
    {
        this.companyRepository.save(companyEntity);
    }
}
