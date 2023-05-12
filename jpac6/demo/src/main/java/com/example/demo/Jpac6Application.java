package com.example.demo;

import com.example.demo.entities.Department;
import com.example.demo.entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class Jpac6Application {

	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Employee e1 = new Employee();
        e1.setName("EMP 1");
		Employee e2 = new Employee();
		e2.setName("EMP 2");
		Employee e3 = new Employee();
        e3.setName("EMP 3");
		Employee e4 = new Employee();
		e4.setName("EMP 4");
		Employee e5 = new Employee();
		e5.setName("EMP 5");
		Employee e6 = new Employee();
		e6.setName("EMP 6");

        Department d1 = new Department();
        d1.setName("DEP 1");
		Department d2 = new Department();
		d2.setName("DEP 2");

        e1.setDepartment(d1);
		e2.setDepartment(d2);
		e3.setDepartment(d1);
		e4.setDepartment(d2);
		e5.setDepartment(d1);
		e6.setDepartment(d2);

		d1.getEmployees().add(e1);
		d1.getEmployees().add(e3);
		d1.getEmployees().add(e5);
		d2.getEmployees().add(e2);
		d2.getEmployees().add(e4);
		d2.getEmployees().add(e6);

		em.persist(d1);
		em.persist(d2);


		em.getTransaction().commit();
		em.close();
	}

}
