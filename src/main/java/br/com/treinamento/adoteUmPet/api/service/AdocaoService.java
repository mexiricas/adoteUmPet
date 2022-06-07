package br.com.treinamento.adoteUmPet.api.service;

import br.com.treinamento.adoteUmPet.api.dtos.AdocaoResponse;
import br.com.treinamento.adoteUmPet.api.dtos.AdocaoResquest;
import br.com.treinamento.adoteUmPet.api.mappers.AdocaoMapper;
import br.com.treinamento.adoteUmPet.core.model.Adocao;
import br.com.treinamento.adoteUmPet.repositories.AdocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdocaoService {
    @Autowired
    private AdocaoRepository adocaoRepository;
    @Autowired
    private AdocaoMapper adocaoMapper;

    public List<AdocaoResponse> listAll (){
        var adocoes =  adocaoRepository.findAll();
        return adocoes
                .stream()
                .map(p -> adocaoMapper.toAResponse(p))
                .collect(Collectors.toList());
    }
    public AdocaoResponse create(AdocaoResquest adocaoResquest){
        var adocaoCreate  = adocaoMapper.toAdocaoModel(adocaoResquest);
        var save = adocaoRepository.save(adocaoCreate);
        return adocaoMapper.toAResponse(save);
    }
}
