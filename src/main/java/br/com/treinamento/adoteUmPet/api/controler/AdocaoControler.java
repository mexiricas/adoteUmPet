package br.com.treinamento.adoteUmPet.api.controler;

import br.com.treinamento.adoteUmPet.api.controler.dtos.AdocaoResponse;
import br.com.treinamento.adoteUmPet.api.controler.dtos.AdocaoResquest;
import br.com.treinamento.adoteUmPet.api.controler.mappers.AdocaoMapper;
import br.com.treinamento.adoteUmPet.repositories.AdocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AdocaoControler {
    @Autowired
    private AdocaoRepository adocaoRepository;
    @Autowired
    private AdocaoMapper adocaoMapper;

    @GetMapping("/adocoes")
    public List<AdocaoResponse> listAll (){
        var adocoes =  adocaoRepository.findAll();
        List<AdocaoResponse> adocaoLista = adocoes
                .stream()
                .map(p -> adocaoMapper.toAResponse(p))
                .collect(Collectors.toList());
        return adocaoLista;
    }
    @PostMapping("/adocoes")
    public ResponseEntity<AdocaoResponse>  create(@RequestBody AdocaoResquest adocaoResquest){
        var adocao = adocaoMapper.toAdocaoModel(adocaoResquest);
        var createAdocao = adocaoRepository.save(adocao);
        return new ResponseEntity<>(adocaoMapper.toAResponse(createAdocao), HttpStatus.CREATED);
    }

}
