package com.conductor.desafio.repository;

import com.conductor.desafio.models.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesafioRepository extends JpaRepository<Terminal, Integer>{

    Terminal findByLogic (Integer logic);
}