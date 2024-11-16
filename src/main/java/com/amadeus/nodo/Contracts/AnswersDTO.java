package com.amadeus.nodo.Contracts;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswersDTO {

    @Valid
    private UserDTO userDTO;

    @NotEmpty(message = "destination is required")
    private String destination;

    @NotEmpty(message = "weather is required")
    private String weather;

    @NotEmpty(message = "activity is required")
    private String activity;

    @NotEmpty(message = "hosting is required")
    private String hosting;

    @NotEmpty(message = "travel is required")
    private String travel;

    @NotEmpty(message = "age is required")
    private String age;

}
