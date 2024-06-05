package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "maestra_especial")
public class MaestraEspecial {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 3)
    private String codigo;

    @Column(nullable = false, length = 73)
    private String especiali;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
