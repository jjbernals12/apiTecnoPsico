package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "admon_pais")
public class AdmonPais {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 3)
    private String codigo;
    @Column(nullable = false, length = 20)
    private String pais;

    public void setId(Long id) {
        this.id = id;
    }
}
