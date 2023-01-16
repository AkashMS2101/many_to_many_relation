package many_to_many_uni1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni1.dto.Course;
import many_to_many_uni1.dto.Student;

public class StudentMain {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction  = entityManager.getTransaction();
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Akash");
		student1.setPhone(9854623);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Adi");
		student2.setPhone(6325423);
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Dushyanth");
		student3.setPhone(952436);
		
		Course course = new Course();
		course.setC_duration(2);
		course.setC_fee(10000);
		course.setC_id(101);
		course.setC_name("java");
		
		Course course2 = new Course();
		course2.setC_duration(1);
		course2.setC_fee(10500);
		course2.setC_id(102);
		course2.setC_name("adv java");
		
		Course course3 = new Course();
		course3.setC_duration(1);
		course3.setC_fee(7000);
		course3.setC_id(103);
		course3.setC_name("sql");
		
		List<Course> list1 = new ArrayList<Course>();
		list1.add(course);
		list1.add(course2);
		
		List<Course> list2 = new ArrayList<Course>();
		list2.add(course2);
		list2.add(course3);
		
		student1.setList(list1);
		student2.setList(list1);
		student3.setList(list2);
		
		entityTransaction.begin();
		entityManager.persist(course);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityTransaction.commit();
	}
}
