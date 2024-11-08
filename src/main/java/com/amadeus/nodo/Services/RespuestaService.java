package com.amadeus.nodo.Services;

import com.amadeus.nodo.Models.RespuestasEntity;
import com.amadeus.nodo.Repositories.RespuestasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RespuestaService {
    @Autowired
    private RespuestasRepository respuestaRepository;

    public RespuestasEntity create(RespuestasEntity respuesta){
        return respuestaRepository.save(respuesta);
    }

    public List<RespuestasEntity> findAll() {
        return respuestaRepository.findAll();
        }

    public Optional<RespuestasEntity> findById(Integer id) {
        return respuestaRepository.findById(id);
        }

    public void deleteById(Integer id) {
        respuestaRepository.deleteById(id);
    }
}
