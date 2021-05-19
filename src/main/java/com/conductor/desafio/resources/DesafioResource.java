package com.conductor.desafio.resources;

import com.conductor.desafio.models.Terminal;
import com.conductor.desafio.repository.DesafioRepository;
import com.conductor.desafio.services.ConverterToJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1")
@Api(value = "API REST TERMINAIS")
@CrossOrigin(origins = "*")
public class DesafioResource {
    @Autowired
    DesafioRepository desafioRepository;

    final static Logger LOGGER = LoggerFactory.getLogger(DesafioResource.class);

    @GetMapping("/terminal/{logic}")
    @ApiOperation(value = "Retorna um terminal unico")
    public Terminal Terminal(@PathVariable(value = "logic") Integer logic) {
        Terminal result =  desafioRepository.findByLogic(logic);
        return desafioRepository.findByLogic(logic);
    }

    @PutMapping("/terminal")
    @ApiOperation(value = "Atualiza um terminal unico passando parametro 'logic' ")
    public Terminal atualizaTerminal(@RequestBody Terminal terminal) {
        String json = terminal.toString();
        LOGGER.info("Terminal object: {}", json);
        return desafioRepository.save(terminal);
    }

    @PostMapping(value = "/terminal", consumes = MediaType.TEXT_HTML_VALUE)
    @ApiOperation(value = "Salva um terminal unico")
    public String salvaTerminal(@RequestBody String terminalpost) {
            Terminal terminal = ConverterToJson.convertStringTerminal(terminalpost);
            if (terminal != null) {
                String json = terminal.toString();
                LOGGER.info("Terminal object: {}", json);
                desafioRepository.save(terminal);
                return (json);
            } else {
                return ("Erro ao fazer conversao de entrada ");
            }
    }
}

