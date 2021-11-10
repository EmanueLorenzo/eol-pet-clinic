package emanuel.springframework.eolpetclinic.services;


import emanuel.springframework.eolpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
