package org.telco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telco.entities.Operateur;

@Repository
public interface OperateurRepository extends JpaRepository<Operateur, Long> {

}
