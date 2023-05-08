package com.example.demo;


import com.example.demo.entities.Employee;
import com.example.demo.entities.Event;
import com.example.demo.entities.Price;
import com.example.demo.entities.Product;
import com.example.demo.entities.enums.Currency;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Jpac3Application {

	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		/*Price p = new Price();
		p.setAmount(100);
		p.setCurrency(Currency.EUR);
		em.persist(p);*/

		/*Product p = new Product();
		p.setExpDate(LocalDate.now());
		em.persist(p);*/

		/*Event e = new Event();
		e.setEventTime(ZonedDateTime.now(ZoneId.of("Europe/London")));//zonedDateTime don`t show the specified time, it stores only the local hour
		em.persist(e);*/

		Employee e = new Employee();
		e.setEmpDate(new Date());
		em.persist(e);

		em.getTransaction().commit();
		em.close();
	}

}
