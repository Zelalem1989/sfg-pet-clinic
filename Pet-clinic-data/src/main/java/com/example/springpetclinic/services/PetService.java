package com.example.springpetclinic.services;

import com.example.springpetclinic.model.Owner;
import com.example.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findbyLastName(String lastName);
    Pet findById(Long id);
    Pet save(Owner owner);
    Set<Pet> findAll();
}
