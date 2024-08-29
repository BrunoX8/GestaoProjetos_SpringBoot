package br.com.dw6.gestao_vagas.model;

import java.util.UUID;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "job")
public class JobEntity {
    private UUID id;
    private String description;
    private String benefits;
    private String level;

    @Column(name = "company_id", insertable = false, updatable = false)
    private UUID companyId;

    @ManyToOne()
    @JoinColumn(name = "company_id")
    private CompanyEntity companyEntity;

    @CreationTimestamp
    private LocalDateTime createdAt;

    //getters e setters
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getBenefits()
    {
        return benefits;
    }

    public String getLevel()
    {
        return level;
    }
}
