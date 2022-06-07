package br.com.treinamento.adoteUmPet.api.dtos;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.class)
public class AdocaoResquest {

    @Email
    @NotEmpty
    @Size(max = 255)
    private String     email;

    @NotEmpty
    @Min(10)
    @Max(100)
    private BigDecimal valor;

    @NotEmpty
    @Positive
    private Long       petId;
}
