package com.mizuirokoala.pet_clinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
