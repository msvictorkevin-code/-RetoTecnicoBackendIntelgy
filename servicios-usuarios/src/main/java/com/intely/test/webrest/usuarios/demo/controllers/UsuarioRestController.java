package com.intely.test.webrest.usuarios.demo.controllers;

import com.intely.test.webrest.usuarios.demo.dto.UsuarioDTORequest;
import com.intely.test.webrest.usuarios.demo.services.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("api")
public class UsuarioRestController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UsuarioRestController.class);
    @Autowired
    private UsuarioService service;

    @CrossOrigin(origins = "*", methods = RequestMethod.POST)
    @PostMapping("/usuarios")
    public ResponseEntity<UsuarioDTORequest> getUsuarioAll() {
        UsuarioDTORequest response = service.getUsuarioAll();
        if (Objects.isNull(response)) {
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }
        LOGGER.info("response => " + response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
