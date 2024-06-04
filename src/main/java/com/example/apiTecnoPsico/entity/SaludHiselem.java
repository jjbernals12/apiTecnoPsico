package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "salud_hiselem")
public class SaludHiselem {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 3)
    private String codele;

    @Column(nullable = false, length = 50)
    private String elemento;

    @Column(name = "cm_nom")
    private String cmNom;

    @Column(name = "cm_tipo")
    private String cmTipo;

    @Column(name = "cm_ancho")
    private Double cmAncho;

    @Column(name = "cm_deci")
    private Double cmDeci;

    @Column
    private String tipo;

    @Column
    private String comando;

    @Column
    private Boolean predeter;

    @Column
    private String planti;

    @Column
    private String explica;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
