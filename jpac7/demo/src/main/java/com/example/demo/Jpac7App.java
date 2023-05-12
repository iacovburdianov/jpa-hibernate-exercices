package com.example.demo;

import com.example.demo.entities.Profesor;
import com.example.demo.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;


public class Jpac7App {

	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Profesor p1 = new Profesor();
		p1.setName("Prof 1");

		Student s1 = new Student();
		s1.setName("Stud 1");

		p1.setStudents(new ArrayList<>());
		p1.getStudents().add(s1);

		s1.setProfesors(new ArrayList<>());
		s1.getProfesors().add(p1);

		em.persist(p1);
		//em.persist(s1);


		em.getTransaction().commit();
		em.close();
	}

}
