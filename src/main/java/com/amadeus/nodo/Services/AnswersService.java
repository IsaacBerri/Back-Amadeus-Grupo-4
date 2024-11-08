package com.amadeus.nodo.Services;

import com.amadeus.nodo.Models.AnswersEntity;
import com.amadeus.nodo.Repositories.AnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AnswersService {
    @Autowired
    private AnswersRepository AnswerRepository;

    public AnswersEntity create(AnswersEntity answer){
        return AnswerRepository.save(answer);
    }

    public List<AnswersEntity> findAll() {
        return AnswerRepository.findAll();
        }

    public Optional<AnswersEntity> findById(Integer id) {
        return AnswerRepository.findById(id);
        }

    public void deleteById(Integer id) {
        AnswerRepository.deleteById(id);
    }
}
