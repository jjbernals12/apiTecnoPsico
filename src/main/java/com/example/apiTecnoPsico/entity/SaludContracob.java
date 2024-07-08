package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "salud_contracob")
public class SaludContracob {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 2)
    private String codigo;
    @Column(nullable = false, length = 60)
    private String descrip;
}
