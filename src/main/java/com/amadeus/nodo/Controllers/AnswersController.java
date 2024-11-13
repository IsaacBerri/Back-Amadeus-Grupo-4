package com.amadeus.nodo.Controllers;

import com.amadeus.nodo.Contracts.AnswersDTO;
import com.amadeus.nodo.Models.AnswersEntity;
import com.amadeus.nodo.Services.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class AnswersController {

    @Autowired
    private AnswersService answersService;

    @GetMapping("/answers")
    public List<AnswersDTO> findAll()
    {return answersService.findAll();}

    @GetMapping("/answer/{id}")
        public AnswersDTO getById(@PathVariable Integer id) {
        Optional<AnswersDTO> answer = answersService.findById(id);
        return answer.orElse(null);
    }

    @PostMapping("/answer")
        public String create(@RequestBody AnswersDTO answersDTO) {
        answersService.create(answersDTO);
        return "la persona ha sido creada exitosamente";
    }
    @DeleteMapping("/answer/{id}")
        public void delete(@PathVariable Integer id) {
        answersService.deleteById(id);
    }

}
