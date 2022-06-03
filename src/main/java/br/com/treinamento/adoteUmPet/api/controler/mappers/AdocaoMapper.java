package br.com.treinamento.adoteUmPet.api.controler.mappers;

import br.com.treinamento.adoteUmPet.api.controler.dtos.AdocaoResponse;
import br.com.treinamento.adoteUmPet.api.controler.dtos.AdocaoResquest;
import br.com.treinamento.adoteUmPet.core.model.Adocao;
import br.com.treinamento.adoteUmPet.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdocaoMapper {
    @Autowired
    private PetRepository petRepository;
    @Autowired
    private PetMapper petMapper;

    public Adocao toAdocaoModel (AdocaoResquest adocaoResquest){
        var adocao = new Adocao();
        adocao.setEmail(adocaoResquest.getEmail());
        adocao.setValor(adocaoResquest.getValor());
        adocao.setPet(petRepository.findbyIdOrElsePet(adocaoResquest.getPetId()));
        return adocao;
    }

    public AdocaoResponse toAResponse(Adocao  adocao){
        var adocaoResponse = new AdocaoResponse();
        adocaoResponse.setId(adocao.getId());
        adocaoResponse.setEmail(adocao.getEmail());
        adocaoResponse.setValor(adocao.getValor());
        adocaoResponse.setPet(petMapper.toPetResponse(adocao.getPet()));
        return adocaoResponse;
    }
}
