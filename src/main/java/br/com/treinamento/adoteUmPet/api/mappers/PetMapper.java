package br.com.treinamento.adoteUmPet.api.mappers;

import br.com.treinamento.adoteUmPet.api.dtos.PetResponse;
import br.com.treinamento.adoteUmPet.core.model.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetMapper {
    public PetResponse toPetResponse(Pet pet){
/*        var petResponse = new PetResponse();
        petResponse.setId(pet.getId() );
        petResponse.setNome(pet.getNome());
        petResponse.setHistoria(pet.getHistoria());
        petResponse.setFoto(pet.getFoto());
        return petResponse;*/
        return PetResponse.builder()
                .id(pet.getId())
                .nome(pet.getNome())
                .historia(pet.getHistoria())
                .foto(pet.getFoto())
                .build();
    }
}
