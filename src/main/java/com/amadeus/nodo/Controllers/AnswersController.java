package com.amadeus.nodo.Controllers;

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
    public List<AnswersEntity> findAll() {return answersService.findAll();}

    @GetMapping("/answer/{id}")
        public AnswersEntity getById(@PathVariable Integer id) {
        Optional<AnswersEntity> answer = answersService.findById(id);
        return answer.orElse(null);
    }

    @PostMapping("/answer")
        public AnswersEntity create(@RequestBody AnswersEntity answer) {
        return answersService.create(answer);
    }
    @DeleteMapping("/answer/{id}")
        public void delete(@PathVariable Integer id) {
        answersService.deleteById(id);
    }

}
