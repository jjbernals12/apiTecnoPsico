package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "maestra_tipoaten")
public class MaestraTipoaten {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 2)
    private String codigo;
    @Column(nullable = false, length = 40)
    private String nomtipo;
    @Column(nullable = false, length = 1)
    private String rip;
    @Column(nullable = false, length = 3)
    private String bodega;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
