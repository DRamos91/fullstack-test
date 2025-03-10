package com.daniel.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.back.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
    
}