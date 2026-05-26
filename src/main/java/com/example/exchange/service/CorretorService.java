package com.example.exchange.service;

import com.example.exchange.dtos.CorretorRequestDTO;
import com.example.exchange.dtos.CorretorResponseDTO;
import com.example.exchange.entity.Corretor;
import com.example.exchange.repository.CorretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorretorService {

    @Autowired
    private CorretorRepository corretorRepository;

    public CorretorResponseDTO save(CorretorRequestDTO dto){
        Corretor corretor = corretorRepository.save(CorretorRequestDTO.dtoToEntity(dto));
                return CorretorResponseDTO.entityToDto(corretor);
    }
}
