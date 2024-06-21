package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "sieparams")
public class Sieparams {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String empresa;

    @Column(length = 120)
    private String direccion;

    @Column(length = 25)
    private String telefono;

    @Column(length = 15)
    private String rut;

    @Column(length = 25)
    private String ciudad;

    @Column(name = "sie_contab", nullable = false)
    private Boolean sieContab;

    @Column(nullable = false, length = 20)
    private String licen;

    @Column(name = "numemp")
    private Integer numEmp;

    @Column(name = "serialdd", nullable = false, length = 20)
    private String serialDd;

    @Column(nullable = false, length = 100)
    private String logo;

    @Column(nullable = false, length = 12)
    private String codpres;

    @Column
    private Double iva;

    @Column(name = "ctacopa", nullable = false, length = 14)
    private String ctaCopa;

    @Column(name = "ctacopcxc", nullable = false, length = 14)
    private String ctaCopcxc;

    @Column(name = "horatemp", nullable = false, length = 5)
    private String horaTemp;

    @Column(name = "horinidis", nullable = false, length = 5)
    private String horIniDis;

    @Column(name = "horfindis", nullable = false, length = 5)
    private String horFinDis;

    @Column(name = "ctacxcglo", nullable = false, length = 14)
    private String ctaCxcglo;

    @Column(name = "ctagasglo", nullable = false, length = 14)
    private String ctaGasglo;

    @Column(name = "ctacopgas", nullable = false, length = 14)
    private String ctaCopgas;

    @Column(name = "tipoemp", length = 1)
    private String tipoEmp;

    @Column(nullable = false)
    private Boolean contproy;

    @Column(nullable = false)
    private Boolean proveefac;

    @Column(nullable = false)
    private Boolean redondea;

    @Column(nullable = false, length = 100)
    private String fotodef;

    @Column(nullable = false)
    private Boolean hisocup;

    @Column(nullable = false)
    private Boolean histera;

    @Column(nullable = false)
    private Boolean hispsic;

    @Column(nullable = false)
    private Boolean hiscons;

    @Column(nullable = false)
    private Boolean hisimag;

    @Column(nullable = false)
    private Boolean hisaudi;

    @Column(nullable = false)
    private Boolean hisespi;

    @Column(nullable = false)
    private Boolean hisopto;

    @Column(nullable = false)
    private Boolean sicree;

    @Column
    private Double porcree;

    @Column(name = "debecree", nullable = false, length = 14)
    private String debeCree;

    @Column(name = "habecree", nullable = false, length = 14)
    private String habeCree;

    @Column(nullable = false)
    private Boolean cboespe;

    @Column(name = "ctamod", nullable = false, length = 14)
    private String ctaMod;

    @Column(nullable = false)
    private Boolean copaest;

    @Column(nullable = false)
    private Boolean bloqcon;

    @Column(nullable = false)
    private Boolean costodet;

    @Column(nullable = false)
    private Boolean hisocup1;

    @Column(nullable = false)
    private Boolean hislabo;

    @Column(nullable = false)
    private Boolean siica;

    @Column
    private Double tasaica;

    @Column(name = "debeica", nullable = false, length = 14)
    private String debeIca;

    @Column(name = "habeica", nullable = false, length = 14)
    private String habeIca;

    @Column(nullable = false)
    private Boolean sibom;

    @Column
    private Double porcbom;

    @Column(name = "debebom", nullable = false, length = 14)
    private String debeBom;

    @Column(name = "habebom", nullable = false, length = 14)
    private String habeBom;

    @Column(nullable = false)
    private Boolean sirtefte;

    @Column
    private Double porrte;

    @Column(name = "deberte", nullable = false, length = 14)
    private String debeRte;

    @Column(nullable = false, length = 1)
    private String costinv;

    @Column(nullable = false, length = 100)
    private String rutagem;

    @Column(nullable = false)
    private Boolean sikit;

    @Column(nullable = false, length = 1)
    private String tipoliq;

    @Column(nullable = false, length = 1)
    private String regimen;

    @Column(nullable = false, length = 1)
    private String hispeq;

    @Column(nullable = false)
    private Boolean covid19;

    @Column(nullable = false, length = 10)
    private String ushispol;

    @Column(nullable = false, length = 10)
    private String ushisoxi;

    @Column(nullable = false, length = 10)
    private String ushispre;

    @Column(nullable = false, length = 3)
    private String usbod;

    @Column(nullable = false, length = 15)
    private String usprovee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
