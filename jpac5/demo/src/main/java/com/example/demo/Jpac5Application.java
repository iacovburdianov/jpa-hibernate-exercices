package com.example.demo;

import com.example.demo.entities.Company;
import com.example.demo.entities.Detail;
import com.example.demo.entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Jpac5Application {

	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		/*Company c1 = new Company();
		c1.setName("XYZ");
		c1.setStreet("Street 1");
		c1.setNumber("A1");
		c1.setDetails("DETAILS");
		em.persist(c1);*/


		Product p = new Product();
		p.setName("Beer");
		p.setPrice(34.0);
		em.persist(p);

		Detail d = new Detail();
		d.setKcal(1234L);
		d.setProduct(p);
		p.setDetail(d);
		em.persist(d);

		em.getTransaction().commit();
		em.close();
	}

}
