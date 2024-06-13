package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "faseaten")
public class Faseaten {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 4)
    private String codfase;
    @Column(nullable = false, length = 70)
    private String nomfase;
    @Column(nullable = false, length = 2)
    private String codgrup;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
