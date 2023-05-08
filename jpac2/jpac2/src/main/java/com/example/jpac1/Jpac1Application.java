package com.example.jpac1;


import com.example.jpac1.entites.Event;
import com.example.jpac1.entites.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Jpac1Application {

	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em1 = emf.createEntityManager();

		/*Product product = new Product();
		product.setName("Beer");


		em1.getTransaction().begin();
		em1.persist(product);
		em1.getTransaction().commit();
		em1.close();*/

		Event e1 = new Event();
		e1.setDescription("ABCD");
		em1.getTransaction().begin();
		em1.persist(e1);
		em1.getTransaction().commit();
		em1.close();
	}

}
