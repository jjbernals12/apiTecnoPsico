package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "salud_tarifas")
public class SaludTarifas {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "idmanual")
    private SaludManuales idmanual;
    @Column(nullable = false, length = 10)
    private String codigo;
    @Column(nullable = false, length = 191)
    private String nombre;
    @Column(name = "uvresp", precision = 14, scale = 2)
    private BigDecimal uvresp;
    @Column(name = "uvrgen", precision = 14, scale = 2)
    private BigDecimal uvrgen;
    @Column(name = "valuvr", precision = 14, scale = 2)
    private BigDecimal valuvr;
    @Column(name = "costo", precision = 14, scale = 2)
    private BigDecimal costo;
    @OneToOne
    @JoinColumn(name = "idcodcups")
    private SaludCups idcodcups;
    @Column(nullable = false, length = 2)
    private String grupquir;
    @Column(nullable = false, length = 1)
    private String sexo;
    @Column(name = "edadmin", length = 11)
    private Integer edadMin;

    @Column(name = "edadmax", length = 11)
    private Integer edadMax;
    @Column(nullable = false, length = 1)
    private String tipotar;
    @OneToOne
    @JoinColumn(name = "idconcecont")
    private AdmonConceconts idconcecont;
    private Boolean iva;
    @Column(name = "porciva", precision = 6, scale = 2)
    private BigDecimal porciva;
    @Column(nullable = false, length = 10)
    private String codrela;
    @Column(nullable = false, length = 1)
    private String tipocon;
    @Column(nullable = false, length = 10)
    private String codtar2;
    private Boolean excluido;
    @Column(nullable = false, length = 12)
    private String codatc;
    @Column(nullable = false, length = 191)
    private String usuario;

    public void setId(Long id) {
        this.id = id;
    }
}
