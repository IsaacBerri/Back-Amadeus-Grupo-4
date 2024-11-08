package com.amadeus.nodo.Controllers;

import com.amadeus.nodo.Models.RespuestasEntity;
import com.amadeus.nodo.Services.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class RespuestaController {

    @Autowired
    private RespuestaService respuestaService;

    @GetMapping("/respuestas")
    public List<RespuestasEntity> findAll() {return respuestaService.findAll();}

    @GetMapping("/respuesta/{id}")
        public RespuestasEntity getById(@PathVariable Integer id) {
        Optional<RespuestasEntity> respuesta = respuestaService.findById(id);
        return respuesta.orElse(null);
    }

    @PostMapping("/respuesta")
        public RespuestasEntity create(@RequestBody RespuestasEntity respuesta) {
        return respuestaService.create(respuesta);
    }
    @DeleteMapping("/respuesta/{id}")
        public void delete(@PathVariable Integer id) {
        respuestaService.deleteById(id);
    }

}
