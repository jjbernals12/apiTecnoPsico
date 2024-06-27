package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "admon_clientes")
public class AdmonClientes {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "no_identi", length = 15)
    private String noidenti;
    @Column(name = "tipo_iden", length = 2)
    private String tipoiden;
    @Column(length = 70)
    private String direccion;
    @Column(length = 15)
    private String telefono;
    @Column(length = 60)
    private String nomclien;
    @OneToOne
    @JoinColumn(name = "idciudad")
    private MaestraMunicipios idciudad;
    @Column(length = 1)
    private String zona;
    @Column(length = 70)
    private String email;
    @Column(length = 24)
    private String celular;
    @Column(name = "internor", precision = 6, scale = 2)
    private BigDecimal internor;
    @Column(name = "intermora", precision = 6, scale = 2)
    private BigDecimal intermora;
    @Column(length = 1)
    private String tipoper;
    @Column(length = 1)
    private String digiveri;
    @Column(length = 1)
    private String regimen;
    private Boolean autoret;
    private Boolean reteiva;
    private Boolean rtefte;
    @Column(name = "no_ideant", length = 15)
    private String noideant;
    private Boolean cliente;
    private Boolean provee;
    private Boolean otro;
    private Boolean eseps;
    @Column(length = 191)
    private String usuario;
    @Column(length = 20)
    private String nombre1;
    @Column(length = 20)
    private String nombre2;
    @Column(length = 20)
    private String apelli1;
    @Column(length = 20)
    private String apelli2;
    @Column(name = "diascre", length = 11)
    private Integer diascre;
    @Column(name = "cupocxc", precision = 14, scale = 2)
    private BigDecimal cupocxc;
    @Column(length = 20)
    private String idacteco;
    private Boolean escree;
    @Column(length = 150)
    private String rutarut;
    @Column(name = "porrte", precision = 6, scale = 2)
    private BigDecimal porrte;
    @Column(length = 60)
    private String nomcial;
    @Column(length = 10)
    private String nomatri;
    @Column(length = 20)
    private String idoblig;
    @Column(length = 20)
    private String idtipoimp;
    @Column(length = 2)
    private String regitrib;
    @Column(length = 20)
    private String idpostal;
    @Column(name = "fechreg")
    private LocalDateTime fechreg;
    @Column(length = 1)
    private String lista;
    private Boolean residen;

    public void setId(Long id) {
        this.id = id;
    }
}
