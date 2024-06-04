package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "maestra_documens")
public class MaestraDocumens {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 2)
    private String docu;

    @Column(nullable = false, length = 4)
    private String serdoc;

    @Column(nullable = false, length = 30)
    private String nombre;

    @Column(name = "no_ini")
    private Integer noIni;

    @Column(name = "no_fin")
    private Integer noFin;

    @Column(name = "no_actual")
    private Integer noActual;

    @Column
    private Boolean manual;

    @Column
    private Boolean predeter;

    @Column
    private Boolean facele;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
