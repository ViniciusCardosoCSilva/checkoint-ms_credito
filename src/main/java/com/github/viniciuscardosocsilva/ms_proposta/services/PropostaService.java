package com.github.viniciuscardosocsilva.ms_proposta.services;

import com.github.viniciuscardosocsilva.ms_proposta.dto.PropostaDTO;
import com.github.viniciuscardosocsilva.ms_proposta.model.Proposta;
import com.github.viniciuscardosocsilva.ms_proposta.repositories.PropostaRepository;
import com.github.viniciuscardosocsilva.ms_proposta.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PropostaService {
    @Autowired
    private PropostaRepository propostaRepository;

    @Autowired
    private UserRepository userRepository;

    public List<PropostaDTO> findAll() {
        return propostaRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<PropostaDTO> findById(Long id) {
        return propostaRepository.findById(id).map(this::convertToDTO);
    }

    public PropostaDTO save(PropostaDTO propostaDTO) {
        Proposta proposta = convertToEntity(propostaDTO);
        return convertToDTO(propostaRepository.save(proposta));
    }

    private PropostaDTO convertToDTO(Proposta proposta) {
        PropostaDTO dto = new PropostaDTO();
        dto.setId(proposta.getId());
        dto.setUserId(proposta.getUserId());
        dto.setValorSolicitado(proposta.getValor());
        dto.setPrazoPagamento(proposta.getPrazo());
        dto.setAprovado(proposta.getAprovado());
        return dto;
    }

    private Proposta convertToEntity(PropostaDTO dto) {
        Proposta proposta = new Proposta();
        proposta.setValor(dto.getValorSolicitado());
        proposta.setPrazo(dto.getPrazoPagamento());
        proposta.setAprovado(dto.getAprovado());
        proposta.setUserId(dto.getUserId());
        return proposta;
    }
}
