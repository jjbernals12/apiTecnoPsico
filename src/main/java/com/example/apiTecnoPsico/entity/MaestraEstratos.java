package com.example.apiTecnoPsico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "maestra_estratos")
public class MaestraEstratos {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 3)
    private String codigo;

    @Column(nullable = false, length = 40)
    private String estrato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
