package model;

import java.util.*;
import javax.persistence.*;

public class StudentDAO {
	public static List<Student> getALLStudent() {
		List<Student> data = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mvjpa20230320");
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Student> query = manager.createQuery("select s from Student s", Student.class);
		data = query.getResultList();
		return data;
	}

	public static void insert(Student s) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mvjpa20230320");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(s);
		manager.getTransaction().commit();
	}
	
	public static void update(int sid,String name,int age) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mvjpa20230320");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Student rem=manager.find(Student.class, sid);
		rem.setSname(name);
		rem.setAge(age);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public static void delete(int sid) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mvjpa20230320");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Student rem=manager.find(Student.class, sid);
		manager.remove(rem);
		manager.getTransaction().commit();
		manager.close();
	}
}
