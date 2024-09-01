package com.github.viniciuscardosocsilva.ms_proposta.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_proposta")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "valor_solicitado")
    private Double valor;

    @Column(name = "prazo_pagamento")
    private Integer prazo;

    @Column(name = "data_solicitacao")
    private String dataSolicitacao;

    @Column(name = "aprovado")
    private Boolean aprovado;
}
