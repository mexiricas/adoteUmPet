package br.com.treinamento.adoteUmPet.repositories;

import br.com.treinamento.adoteUmPet.core.exception.PetNotFoundException;
import br.com.treinamento.adoteUmPet.core.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
    default Pet findbyIdOrElsePet(Long id) {
/*        var petOptional = findById(id);
        if(petOptional.isPresent()) {
            return petOptional.get();
        }
        throw new PetNotFoundException() ;*/

        return findById(id)
                .orElseThrow(PetNotFoundException::new);

    }
}
