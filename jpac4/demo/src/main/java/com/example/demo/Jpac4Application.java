package com.example.demo;

import com.example.demo.entities.Building;
import com.example.demo.entities.Company;
import com.example.demo.entities.Department;
import com.example.demo.entities.embeddables.Address;
import com.example.demo.entities.embeddables.BuildingPK;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Jpac4Application {

	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		/*Company c = new Company();
		c.setName("C1");
		c.setAddress(new Address());
		c.getAddress().setCity("Chisinau");
		c.getAddress().setNo("23");
		c.getAddress().setStr("Deleanu");*/


		/*Department d = new Department();
		d.setName("DEP 1");
		d.setCode("ABC");
		d.setNumber(123L);*/

		Building b = new Building();
		b.setName("B1");
		b.setId(new BuildingPK());
		b.getId().setCode("ABC");
		b.getId().setNumber(123L);
		em.persist(b);
		em.getTransaction().commit();
		em.close();
	}

}
