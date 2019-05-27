package org.telco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telco.metier.AbonneMetier;

@SpringBootApplication
public class TelcoTestApplication implements CommandLineRunner{

	

	
	public static void main(String[] args) {
		SpringApplication.run(TelcoTestApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
