package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "salud_ripcons")
public class SaludRipcons {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 2)
    private String dctofra;
    @Column(nullable = false, length = 4)
    private String serdocfra;
    @Column(name = "documfra", precision = 9, scale = 0)
    private BigDecimal documfra;
    @Column(nullable = false, length = 2)
    private String dctoadm;
    @Column(nullable = false, length = 4)
    private String seradm;
    @Column(name = "numadm", precision = 9, scale = 0)
    private BigDecimal numadm;
    @Column(name = "fechcons")
    private LocalDateTime fechcons;
    @Column(nullable = false, length = 12)
    private String codpres;
    @Column(nullable = false, length = 15)
    private String autoriz;
    @Column(nullable = false, length = 2)
    private String tipoiden;
    @Column(name = "no_histo", precision = 11, scale = 0)
    private BigDecimal nohisto;
    @Column(name = "no_identi",nullable = false, length = 15)
    private String noidenti;
    @Column(nullable = false, length = 6)
    private String cupscons;
    @Column(nullable = false, length = 2)
    private String finacons;
    @Column(nullable = false, length = 2)
    private String causaext;
    @Column(nullable = false, length = 4)
    private String diagprin;
    @Column(nullable = false, length = 4)
    private String diagsal1;
    @Column(nullable = false, length = 4)
    private String diagsal2;
    @Column(nullable = false, length = 4)
    private String diagsal3;
    @Column(nullable = false, length = 1)
    private String tipodiag;
    @Column(name = "vlrcons", precision = 12, scale = 2)
    private BigDecimal vlrcons;
    @Column(name = "vlrcopa", precision = 12, scale = 2)
    private BigDecimal vlrcopa;
    @Column(name = "netocons", precision = 12, scale = 2)
    private BigDecimal netocons;
    @Column(nullable = false, length = 6)
    private String eps;
    @Column(nullable = false, length = 5)
    private String medico;
    @Column(name = "reghd", precision = 9, scale = 0)
    private BigDecimal reghd;

    public void setId(Long id) {
        this.id = id;
    }
}
