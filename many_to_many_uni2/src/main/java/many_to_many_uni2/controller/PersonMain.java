package many_to_many_uni2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni2.dto.Language;
import many_to_many_uni2.dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Akash");
		person1.setId(1);
		person1.setPhone(9854623);
		person1.setAddress("hassan");
		
		Person person2 = new Person();
		person2.setName("Aman");
		person2.setId(2);
		person2.setPhone(98554623);
		person2.setAddress("banglore");
		
		Person person3 = new Person();
		person3.setName("Aksay");
		person3.setId(3);
		person3.setPhone(63454623);
		person3.setAddress("mysore");
		
		Language language1 = new Language();
		language1.setId(1);
		language1.setName("Kannada");
		language1.setOrigini("karnataka");
		language1.setCountry("India");
		
		Language language2 = new Language();
		language2.setId(2);
		language2.setName("Hindi");
		language2.setOrigini("north India");
		language2.setCountry("India");
		
		Language language3 = new Language();
		language3.setId(3);
		language3.setName("English");
		language3.setOrigini("Washington");
		language3.setCountry("USA");
		
		List<Language> list1 = new ArrayList<Language>();
		list1.add(language1);
		list1.add(language2);
		
		List<Language> list2 = new ArrayList<Language>();
		list2.add(language2);
		list2.add(language3);
		
		person1.setList(list1);
		person2.setList(list2);
		person3.setList(list1);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(language1);
		entityManager.persist(language2);
		entityManager.persist(language3);
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		entityTransaction.commit();
	}
}
