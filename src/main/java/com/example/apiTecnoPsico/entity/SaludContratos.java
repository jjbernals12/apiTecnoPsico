package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "salud_contratos")
public class SaludContratos {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 15)
    private String idcontra;
    @Column(nullable = false, length = 10)
    private String plan;
    @OneToOne
    @JoinColumn(name = "ideps")
    private MaestraEps ideps;
    @Column(nullable = false, length = 40)
    private String nombre;
    @Column(name = "fechaini")
    private LocalDateTime fechaini;
    @Column(length = 11)
    private Integer durac;
    @Column(name = "fechafin")
    private LocalDateTime fechafin;
    @Column(name = "fechafirma")
    private LocalDateTime fechafirma;
    @Column(length = 15)
    private String telconta;
    @Column
    private Boolean firmado;
    @OneToOne
    @JoinColumn(name = "idmanual")
    private SaludManuales idmanual;
    @Column(length = 2)
    private String tipo;
    @Column(name = "topemes", precision = 14, scale = 2)
    private BigDecimal topemes;
    @Column(name = "salmin", precision = 14, scale = 2)
    private BigDecimal salmin;
    @Column(length = 1)
    private String tipotar;
    @Column(name = "porcen", precision = 6, scale = 2)
    private BigDecimal porcen;
    @OneToOne
    @JoinColumn(name = "idusuario")
    private AdmonClientes idusuario;
    @OneToOne
    @JoinColumn(name = "idmanual1")
    private SaludManuales idmanual1;
}
