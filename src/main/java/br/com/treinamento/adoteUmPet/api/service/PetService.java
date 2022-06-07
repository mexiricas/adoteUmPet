package br.com.treinamento.adoteUmPet.api.service;

import br.com.treinamento.adoteUmPet.api.dtos.PetResponse;
import br.com.treinamento.adoteUmPet.api.mappers.PetMapper;
import br.com.treinamento.adoteUmPet.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;
    @Autowired
    private PetMapper petMapper;
    public List<PetResponse> findAll(){
        /*        var pets =  petRepository.findAll();
        List<PetResponse> petsLista = pets
                .stream()
                .map(p -> new PetResponse(p.getId() , p.getNome(),  p.getHistoria(), p.getFoto()))
                .collect(Collectors.toList());
        return petsLista;*/
        return petRepository.findAll().
                stream()
                .map(petMapper::toPetResponse)
                .collect(Collectors.toList());
    }
}
