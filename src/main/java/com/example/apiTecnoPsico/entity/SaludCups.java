package com.example.apiTecnoPsico.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "salud_cups")
public class SaludCups {

    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "aplicado", length = 9)
    private String aplicado;

    @Column(name = "seccio", length = 2)
    private String seccio;

    @Column(name = "capitulo", length = 2)
    private String capitulo;

    @Column(name = "grupo", length = 2)
    private String grupo;

    @Column(name = "subgrupo", length = 1)
    private String subgrupo;

    @Column(name = "categor", length = 1)
    private String categor;

    @Column(name = "subcate", length = 2)
    private String subcate;

    @Column(name = "nombre", length = 254)
    private String nombre;

    @Column(name = "codfase", length = 2)
    private String codfase;

    @Column(name = "codcups", length = 6)
    private String codcups;

    @Column(name = "incluye", length = 254)
    private String incluye;

    @Column(name = "excluye", length = 254)
    private String excluye;

    @Column(name = "simult", length = 254)
    private String simult;

    @Column(name = "idCapitulo")
    private Long idCapitulo;

    public void setId(Long id) {
        this.id = id;
    }
}
