package org.telco.metier;

import java.util.List;

import org.telco.entities.Abonne;



public interface AbonneMetier {
	public Abonne SaveAbonne(Abonne a);
	public Abonne getOne(Long id);
	public List<Abonne>listAbonnes();
	public Abonne modifierAbonne(Long id);
	public void supprimerAbonne(Long id);

}
