package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "salud_motivocan")
public class SaludMotivocan {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 2)
    private String codigo;

    @Column(nullable = false, length = 50)
    private String motivo;

    public void setId(Long id) {
        this.id = id;
    }
}
