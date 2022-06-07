package br.com.treinamento.adoteUmPet.api.controler;

import br.com.treinamento.adoteUmPet.api.dtos.PetResponse;
import br.com.treinamento.adoteUmPet.api.mappers.PetMapper;
import br.com.treinamento.adoteUmPet.api.service.PetService;
import br.com.treinamento.adoteUmPet.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
public class PetControler {
    @Autowired
    private PetService petService;


    @GetMapping("/pets")
    public List<PetResponse> listAll (){

        return petService.findAll();
    }



}
