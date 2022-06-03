package br.com.treinamento.adoteUmPet.repositories;

import br.com.treinamento.adoteUmPet.core.model.Adocao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {

}
