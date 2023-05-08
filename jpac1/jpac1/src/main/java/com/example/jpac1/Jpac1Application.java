package com.example.jpac1;


import com.example.jpac1.entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Jpac1Application {

	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("my-persistence-unit");

		EntityManager em = emf.createEntityManager();
		Product p = new Product();
		p.setId(100L);
		p.setName("Beer");
		p.setPrice(10.4);
		p.setExpirationDate(LocalDate.now());

		em.getTransaction().begin();
		em.persist(p);// adding the instance in the context
		em.getTransaction().commit();
	}

}
