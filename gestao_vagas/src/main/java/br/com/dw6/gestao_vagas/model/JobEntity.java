package br.com.dw6.gestao_vagas.model;

import java.util.UUID;

import jakarta.persistence.Entity;

@Entity(name = "job")
public class JobEntity {
    private UUID id;
    private String description;
    private String benefits;
    private String level;
}
