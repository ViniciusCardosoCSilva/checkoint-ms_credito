package com.github.viniciuscardosocsilva.ms_proposta.controllers;

import com.github.viniciuscardosocsilva.ms_proposta.dto.PropostaDTO;
import com.github.viniciuscardosocsilva.ms_proposta.services.PropostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propostas")
public class PropostaController {
    @Autowired
    private PropostaService propostaService;

    @GetMapping
    public List<PropostaDTO> findAll() {
        return propostaService.findAll();
    }

    @GetMapping("/{id}")
    public PropostaDTO findById(@PathVariable Long id) {
        return propostaService.findById(id).orElseThrow();
    }

    @PostMapping
    public PropostaDTO insert(@RequestBody PropostaDTO propostaDTO) {
        return propostaService.save(propostaDTO);
    }
}
