package com.ocean.cleanup.model;

import javax.persistence.*;

@Entity
public class Lixo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private double peso;

    @ManyToOne
    @JoinColumn(name = "barco_id")
    private Barco barco;

    // Getters e Setters
}
