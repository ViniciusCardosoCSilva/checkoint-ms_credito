package com.github.viniciuscardosocsilva.ms_proposta.dto;

import lombok.Data;

@Data
public class PropostaDTO {

    private Long id;
    private Long userId;
    private Double valorSolicitado;
    private Integer prazoPagamento;
    private Boolean aprovado;

}
