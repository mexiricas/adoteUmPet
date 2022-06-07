package br.com.treinamento.adoteUmPet.api.controler;

import br.com.treinamento.adoteUmPet.api.dtos.AdocaoResponse;
import br.com.treinamento.adoteUmPet.api.dtos.AdocaoResquest;
import br.com.treinamento.adoteUmPet.api.service.AdocaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AdocaoControler {
    @Autowired
    private AdocaoService adocaoService;

    @GetMapping("/adocoes")
    public List<AdocaoResponse> listAll (){
        return adocaoService.listAll();
    }
    @PostMapping("/adocoes")
    public AdocaoResponse  create(@RequestBody @Valid  AdocaoResquest adocaoResquest){
        return adocaoService.create(adocaoResquest) ;
    }

}
