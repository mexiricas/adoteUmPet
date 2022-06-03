package br.com.treinamento.adoteUmPet;

import br.com.treinamento.adoteUmPet.core.model.Pet;
import br.com.treinamento.adoteUmPet.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdoteUmPetApplication  implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;
	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("Jubileu");
		pet.setHistoria("Coitadinho da rua");
		pet.setFoto("https://f.i.uol.com.br/fotografia/2022/05/31/1654036263629697277c4ac_1654036263_3x2_md.jpg");
		petRepository.save(pet);
	}
}
