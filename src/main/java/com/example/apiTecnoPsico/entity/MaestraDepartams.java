package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "maestra_departams")
public class MaestraDepartams {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, length = 2, unique = true)
    public String codigo;

    @Column(nullable = false, length = 50)
    public String dpto;

    public String getCodigo() {
        return codigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
