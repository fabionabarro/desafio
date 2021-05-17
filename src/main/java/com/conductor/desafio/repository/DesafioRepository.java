package com.conductor.desafio.repository;

import com.conductor.desafio.models.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DesafioRepository extends JpaRepository<Terminal, Integer>{

    Optional<Terminal> findById(Integer logic);

}