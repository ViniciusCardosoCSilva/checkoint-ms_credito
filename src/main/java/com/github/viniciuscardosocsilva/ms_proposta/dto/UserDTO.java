package com.github.viniciuscardosocsilva.ms_proposta.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;

}
