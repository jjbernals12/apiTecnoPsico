package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "admon_conceconts")
public class AdmonConceconts {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 2)
    private String codigo;

    @Column(nullable = false, length = 40)
    private String concepto;

    @Column(name = "cta_debe", length = 14)
    private String ctaDebe;

    @Column(name = "cta_haber", length = 14)
    private String ctaHaber;

    @Column(name = "cta_iva", length = 14)
    private String ctaIva;

    @Column(name = "cta_riva", length = 14)
    private String ctaRiva;

    @Column(name = "cta_dscto", length = 14)
    private String ctaDscto;

    @Column(name = "cta_inven", length = 14)
    private String ctaInven;

    @Column(name = "tipo_mov", nullable = false, length = 1)
    private String tipoMov;

    @Column(name = "cta_costo", length = 14)
    private String ctaCosto;

    @Column(nullable = false, length = 2)
    private String proyec;

    @Column(name = "cta_almac", length = 14)
    private String ctaAlmac;

    @Column(length = 14)
    private String ivalmac;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
