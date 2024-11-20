package com.amadeus.nodo.Controllers;

import com.amadeus.nodo.Contracts.AnswersDTO;
import com.amadeus.nodo.Contracts.Mongo.DestinationsDTO;
import com.amadeus.nodo.Services.AnswersService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class AnswersController {

    @Autowired
    private AnswersService answersService;

    @GetMapping("/answers")
    public  ResponseEntity<List<AnswersDTO>> findAll()
    {
        return ResponseEntity.ok(answersService.findAll());
    }

    @GetMapping("/answer/{id}")
        public ResponseEntity<Optional<AnswersDTO>> getById(@PathVariable Integer id) {
        Optional<AnswersDTO> answer = answersService.findById(id);
        return ResponseEntity.ok(answer);
    }

    @PostMapping("/answer")
        public ResponseEntity<DestinationsDTO> create(@RequestBody @Valid AnswersDTO answersDTO) {
        return ResponseEntity.ok(answersService.create(answersDTO)) ;
    }
    @DeleteMapping("/answer/{id}")
        public ResponseEntity<String> delete(@PathVariable Integer id) {
        answersService.deleteById(id);
        return ResponseEntity.ok("The person has been successfully deleted");
    }

}
