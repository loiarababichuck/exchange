package com.example.exchange.repository;


import com.example.exchange.entity.Cryptomoeda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptomoedaRepository extends JpaRepository<Cryptomoeda, Long> {

}
