package com.example.exchange.controller;

import com.example.exchange.dtos.CorretorRequestDTO;
import com.example.exchange.dtos.CorretorResponseDTO;
import com.example.exchange.entity.Corretor;
import com.example.exchange.service.CorretorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/corretores")

public class CorretorController {

    @Autowired
    private CorretorService corretorService;

    @PostMapping
    public CorretorResponseDTO criarCorretor(@RequestBody @Valid CorretorRequestDTO dto){
        return corretorService.save(dto);
    }

}
