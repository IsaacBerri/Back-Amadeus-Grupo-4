package com.amadeus.nodo.Mappers;

import com.amadeus.nodo.Contracts.AnswersDTO;
import com.amadeus.nodo.Contracts.UserDTO;
import com.amadeus.nodo.Models.AnswersEntity;

public class AnswersMapper {
    public static AnswersDTO toDTO(AnswersEntity answersEntity){
        AnswersDTO answersDTO = new AnswersDTO();
        UserDTO userDTO = new UserDTO();
        userDTO.setName(answersEntity.getUser().getName());
        userDTO.setEmail(answersEntity.getUser().getEmail());
        answersDTO.setUserDTO(userDTO);
        answersDTO.setDestination(answersEntity.getDestination().getName());
        answersDTO.setWeather(answersEntity.getWeather().getName());
        answersDTO.setActivity(answersEntity.getActivity().getName());
        answersDTO.setHosting(answersEntity.getHosting().getName());
        answersDTO.setTravel(answersEntity.getTravel().getName());
        answersDTO.setAge(answersEntity.getAge().getName());
        return answersDTO;
    }

    public static AnswersEntity toEntity(AnswersDTO answersDTO){
        AnswersEntity answersEntity = new AnswersEntity();
        return answersEntity;
    }
}
