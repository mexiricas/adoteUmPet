package br.com.treinamento.adoteUmPet.api.controler.dtos;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.class)
public class AdocaoResquest {
    private String     email;
    private BigDecimal valor;
    private Long       petId;
}
