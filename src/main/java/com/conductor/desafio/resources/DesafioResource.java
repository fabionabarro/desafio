package com.conductor.desafio.resources;

import com.conductor.desafio.models.Terminal;
import com.conductor.desafio.repository.DesafioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/v1")
@Api(value="API REST TERMINAIS")
@CrossOrigin(origins = "*")
public class DesafioResource {
    @Autowired
    DesafioRepository desafioRepository;

    @GetMapping("/terminal")
    @ApiOperation(value="Retorna lista de terminais")
    public List<Terminal> listaTerminais(){
        return desafioRepository.findAll() ;
    }
    @GetMapping("/terminal/{logic}")
    @ApiOperation(value="Retorna um terminal unico")
    public Optional<Terminal> Terminal(@PathVariable(value = "logic")Integer logic){
        return desafioRepository.findById(logic) ;
    }
    @PostMapping("/terminal")
    @ApiOperation(value="Salva um terminal unico")
    public Terminal salvaTerminal(@RequestBody Terminal terminal){
        return desafioRepository.save(terminal);
    }
    @PutMapping("/terminal")
    @ApiOperation(value="Atualiza um terminal unico passando parametro 'logic' ")
    public Terminal atualizaTerminal(@RequestBody Terminal terminal){
        return desafioRepository.save(terminal);
    }
}
