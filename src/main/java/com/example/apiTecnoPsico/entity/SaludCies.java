package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "salud_cies")
public class SaludCies {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 4)
    private String codigo;

    @Column(nullable = false, length = 150)
    private String nombre;

    @Column(length = 1)
    private String sexo;

    @Column(name = "edadmin")
    private Integer edadMin;

    @Column(name = "edadmax")
    private Integer edadMax;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
