package org.telco.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telco.dao.AbonneRepository;
import org.telco.entities.Abonne;

@Service
public class AbonneMetierImpl implements AbonneMetier{
 
	@Autowired
	private AbonneRepository abonneRepository;
	@Override
	public Abonne SaveAbonne(Abonne a) {
		
		return abonneRepository.save(a);
	}

	@Override
	public Abonne getOne(Long id) {
		
		return abonneRepository.findOne(id);
	}

	@Override
	public List<Abonne> listAbonnes() {
		
		return abonneRepository.findAll();
	}

	@Override
	public Abonne modifierAbonne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerAbonne(Long id) {
		// TODO Auto-generated method stub
		
	}

}
