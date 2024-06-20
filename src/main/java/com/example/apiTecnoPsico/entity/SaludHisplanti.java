package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "salud_hisplanti")
public class SaludHisplanti {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 3)
    private String codplanti;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column
    private String planti;

    @Column(name = "tipoexa", length = 1)
    private String tipoExa;

    @Column(name = "edadmin", length = 11)
    private Integer edadMin;

    @Column(name = "edadmax", length = 11)
    private Integer edadMax;

    @Column(name = "sexo",length = 1)
    private String sexo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
