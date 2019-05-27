package org.telco.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operateur implements Serializable {
	@Id
	@GeneratedValue
	private Long idOperateur;
	private String nomOperateur;
	@OneToMany(mappedBy="operateur")
	private Collection<Abonne>abonnes;

}
