package com.ocean.cleanup.model;

import javax.persistence.*;

@Entity
public class Barco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double capacidadeMaxima;
    private double capacidadeAtual;

    // Getters e Setters
}
