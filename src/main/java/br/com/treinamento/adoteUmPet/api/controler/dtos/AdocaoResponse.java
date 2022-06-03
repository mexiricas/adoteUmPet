package br.com.treinamento.adoteUmPet.api.controler.dtos;

import br.com.treinamento.adoteUmPet.core.model.Pet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdocaoResponse {


    private Long id;
    private String email;
    private BigDecimal valor;
    private PetResponse pet;

}
