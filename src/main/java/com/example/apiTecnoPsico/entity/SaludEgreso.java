package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "salud_egreso")
public class SaludEgreso {

    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dctoegr", length = 2)
    private String dctoegr;

    @Column(name = "seregr", length = 4)
    private String seregr;

    @Column(name = "numegr", precision = 9, scale = 0)
    private BigDecimal numegr;

    @Column(name = "dcto", length = 2)
    private String dcto;

    @Column(name = "serdoc", length = 4)
    private String serdoc;

    @Column(name = "documen", precision = 9, scale = 0)
    private BigDecimal documen;

    @Column(name = "no_histo", precision = 11, scale = 0)
    private BigDecimal noHisto;

    @Column(name = "no_identi", length = 15)
    private String noIdenti;

    @Column(name = "nomhisto", length = 120)
    private String nomhisto;

    @Column(name = "dctoadm", length = 2)
    private String dctoadm;

    @Column(name = "seradm", length = 4)
    private String seradm;

    @Column(name = "numadm", precision = 9, scale = 0)
    private BigDecimal numadm;

    @Column(name = "eps", length = 6)
    private String eps;

    @Column(name = "feching")
    private LocalDateTime feching;

    @Column(name = "horaing", length = 5)
    private String horaing;

    @Column(name = "fechegr")
    private LocalDateTime fechegr;

    @Column(name = "horaegr", length = 5)
    private String horaegr;

    @Column(name = "diasest", precision = 4, scale = 0)
    private BigDecimal diasest;

    @Column(name = "meditra", length = 5)
    private String meditra;

    @Column(name = "valorfac", precision = 12, scale = 2)
    private BigDecimal valorfac;

    @Column(name = "dctofra", length = 2)
    private String dctofra;

    @Column(name = "serdocfra", length = 4)
    private String serdocfra;

    @Column(name = "documfra", precision = 9, scale = 0)
    private BigDecimal documfra;

    @Column(name = "servegr", length = 2)
    private String servegr;

    @Column(name = "diagprin", length = 4)
    private String diagprin;

    @Column(name = "diagsal1", length = 4)
    private String diagsal1;

    @Column(name = "diagsal2", length = 4)
    private String diagsal2;

    @Column(name = "diagsal3", length = 4)
    private String diagsal3;

    @Column(name = "condigen", columnDefinition = "LONGTEXT")
    private String condigen;

    @Column(name = "planambu", columnDefinition = "LONGTEXT")
    private String planambu;

    @Column(name = "diaging", length = 4)
    private String diaging;

    @Column(name = "cama", length = 4)
    private String cama;

    @Column(name = "anula", columnDefinition = "TINYINT(1)")
    private Boolean anula;

    @Column(name = "estsal", length = 1)
    private String estsal;

    @Column(name = "diagcomp", length = 4)
    private String diagcomp;

    @Column(name = "usuario", length = 30)
    private String usuario;

    @Column(name = "fechreg")
    private LocalDateTime fechreg;

    @Column(name = "horareg", length = 8)
    private String horareg;

    @Column(name = "tipodiag", length = 1)
    private String tipodiag;

    @Column(name = "diagmuer", length = 4)
    private String diagmuer;

    @Column(name = "codserv", length = 6)
    private String codserv;
}