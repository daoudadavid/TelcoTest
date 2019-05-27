package org.telco.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telco.entities.Abonne;



@Repository
public interface AbonneRepository  extends JpaRepository<Abonne, Long>{

}
