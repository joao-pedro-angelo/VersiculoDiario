package com.abibliadigital.consumir.api.controllers;

import com.abibliadigital.consumir.api.models.versiculos.VersiculoDTO;
import com.abibliadigital.consumir.api.services.VersiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/versiculos")
public class VersiculoController {

    @Autowired
    private VersiculoService service;

    @GetMapping
    public ResponseEntity<VersiculoDTO> getVersiculo(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.service.versiculo());
    }

    @PostMapping("/{phoneNumber}")
    public ResponseEntity<Object> sendVersiculo(@PathVariable String phoneNumber){
        this.service.enviarVersiculoParaUsuario(phoneNumber);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
