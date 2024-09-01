package com.github.viniciuscardosocsilva.ms_proposta.repositories;

import com.github.viniciuscardosocsilva.ms_proposta.model.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {
}
