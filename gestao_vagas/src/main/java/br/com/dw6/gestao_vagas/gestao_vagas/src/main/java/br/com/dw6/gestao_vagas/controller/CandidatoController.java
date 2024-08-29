package br.com.dw6.gestao_vagas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.dw6.gestao_vagas.exceptions.UserFoundException;
import br.com.dw6.gestao_vagas.model.CandidatoEntity;
import br.com.dw6.gestao_vagas.model.CandidatoRepository;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {
    @Autowired
    private CandidatoRepository candidatoRepository;
    
    @PostMapping("/")
    public CandidatoEntity createCandidadato(@Valid @RequestBody CandidatoEntity candidatoEntity) 
    {
        this.candidatoRepository.findByUsernameOrEail(candidatoEntity.getUsername(), candidatoEntity.getUserEmail())
        .ifPresent((user) -> {
            throw new UserFoundException();
        });
        return this.candidatoRepository.save(candidatoEntity);
    }
}
