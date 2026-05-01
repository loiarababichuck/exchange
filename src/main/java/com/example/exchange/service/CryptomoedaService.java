package com.example.exchange.service;


import com.example.exchange.controller.CryptomoedaController;
import com.example.exchange.entity.Cryptomoeda;
import com.example.exchange.repository.CryptomoedaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CryptomoedaService {

    @Autowired
    private CryptomoedaRepository cryptomoedaRepository;

    public Cryptomoeda salvarCryptomoeda(Cryptomoeda cryptomoeda){
        return cryptomoedaRepository.save(cryptomoeda);

    }
}