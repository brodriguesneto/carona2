package br.com.fiap.carona2.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	
	private static EntityManagerFactory fabric;
	
	private EntityManagerFactorySingleton() {

	}
	
	public static EntityManagerFactory getInstance() {
		
		if(fabric == null) {
			fabric = Persistence.createEntityManagerFactory("carona2");
		}
		return fabric;
		
	}

}
