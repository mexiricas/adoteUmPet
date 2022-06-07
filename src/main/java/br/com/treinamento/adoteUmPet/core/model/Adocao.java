package br.com.treinamento.adoteUmPet.core.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Adocao {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;
    private String email;
    @ManyToOne(optional = true)
    private Pet pet;

}
