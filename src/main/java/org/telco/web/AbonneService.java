package org.telco.web;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;
import org.telco.entities.Abonne;
import org.telco.metier.AbonneMetier;

@RestController
public class AbonneService {

	@Autowired
	private AbonneMetier abonneMetier;

	@PostMapping("/ajoutAbonne")
	public ResponseEntity<Object> enregistrer(@Valid @RequestBody Abonne a) {
		Abonne creer =  abonneMetier.SaveAbonne(a);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{idAbonne}")
				.buildAndExpand(creer.getIdAbonne())
				.toUri();
		return ResponseEntity.created(location).build();
	}
     @GetMapping("/abonne/{id}")
	public Abonne getOne(@PathVariable(name="id")long id) {
		return abonneMetier.getOne(id);
	}
     @GetMapping("/listAbonnes")
	public List<Abonne> listAbonnes() {
		return abonneMetier.listAbonnes();
	}
	
}
