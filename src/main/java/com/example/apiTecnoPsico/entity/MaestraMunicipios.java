package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "maestra_municipios")
public class MaestraMunicipios {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 5)
    private String codigo;
    @Column(length = 20)
    private String codpais;
    @Column(length = 32)
    private String ciudad;
    @Column(length = 3)
    private String cod_muni;
    @ManyToOne
    @JoinColumn(name = "iddpto")
    private MaestraDepartams iddpto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCod_muni() {
        return cod_muni;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setIddpto(MaestraDepartams iddpto) {
        this.iddpto = iddpto;
    }
}
