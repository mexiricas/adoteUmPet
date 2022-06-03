package br.com.treinamento.adoteUmPet.api.controler;

import br.com.treinamento.adoteUmPet.api.controler.dtos.PetResponse;
import br.com.treinamento.adoteUmPet.api.controler.mappers.PetMapper;
import br.com.treinamento.adoteUmPet.core.model.Pet;
import br.com.treinamento.adoteUmPet.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
public class PetControler {
    @Autowired
    private  PetRepository petRepository ;
    @Autowired
    private PetMapper petMapper;


    @GetMapping("/pets")
    public List<PetResponse> listAll (){
        var pets =  petRepository.findAll();
        List<PetResponse> petsLista = pets.stream()
                .map(p -> new PetResponse(p.getId(), p.getNome(),  p.getHistoria(), p.getFoto()))
                .collect(Collectors.toList());
        return petsLista;
    }



}
