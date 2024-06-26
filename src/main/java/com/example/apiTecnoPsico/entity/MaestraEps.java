package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "maestra_eps")
public class MaestraEps {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 6)
    private String codigo;

    @Column(nullable = false, length = 78)
    private String entidad;

    @Column(name = "tipenti", length = 2)
    private String tipenti;

    @Column(name = "no_identi", length = 15)
    private String noIdenti;

    @OneToOne
    @JoinColumn(name = "idtercero")
    private AdmonClientes idTercero;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
