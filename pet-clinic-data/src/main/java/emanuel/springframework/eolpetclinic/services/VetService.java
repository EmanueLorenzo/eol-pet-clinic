package emanuel.springframework.eolpetclinic.services;

import emanuel.springframework.eolpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
