package com.example.demospringbootapi.controller;

import com.example.demospringbootapi.model.Equipo;
import com.example.demospringbootapi.repositories.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

// Al poner RestController en vez de Controller,
// ya no tenemos que usar la anotacion ResponseBody
@RestController
@CrossOrigin
@EnableAutoConfiguration
public class Controller {
    @Autowired
    EquipoRepository equipoRepository;

    // Welcome de nuestra API
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html")
    public String get() {
        String cadena = "<h1 style='text-align: center; background-color: #0000c0; color: #C0C0FF;'>Welcome to Futbol Api with SpringBoot - Alon</h1>";
        cadena +="<table border='1' style='width: 40%;margin: 0 auto; background-color: #C0C0FF; color:#0000c0;'>";
        cadena +="<tr style='background-color: #0000c0; color: #C0C0FF;'><th>Method</th><th>Url</th><th>Description</th></tr>";
        cadena +="<tr><td>get</td><td>/equipos</td><td>Lista de equipos</td></tr>";
        cadena +="<tr><td>get</td><td>/equipo/{equipo}</td><td>Equipo</td></tr>";
        cadena +="</table>";
        return cadena;
    }

    // Get lista con todos los equipos
    @RequestMapping(value = "equipos", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getEquipos() {
        try {
            Iterable<Equipo> equipos = equipoRepository.findAll();
            return new ResponseEntity<>(equipos, HttpStatus.OK);

        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    // Get equipo indicando el código de equipo en la url
    @RequestMapping(value = "equipo/{equipo}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getEquipos(@PathVariable(value = "equipo") BigInteger equipo) {
        try {
            Equipo equipoResponse = equipoRepository.findById(equipo).orElse(null);
            return new ResponseEntity<>(equipoResponse, HttpStatus.OK);

        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}

