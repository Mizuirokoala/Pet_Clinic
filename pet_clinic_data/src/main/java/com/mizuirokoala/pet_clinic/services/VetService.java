package com.mizuirokoala.pet_clinic.services;

import com.mizuirokoala.pet_clinic.model.Vet;

import java.util.Set;

public interface VetService {


    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
