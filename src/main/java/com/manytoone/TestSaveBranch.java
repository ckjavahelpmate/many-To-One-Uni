package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Hospital hospital = new Hospital() ;
		hospital.setName("CK");
		hospital.setWeb("www.begahusargthiya.com");
		
		Branch branch1 = new Branch() ;
		branch1.setName("RR-CK");
		branch1.setState("Karnataka");
		branch1.setCountry("India");
		branch1.setPhone(223344);
		branch1.setHospital(hospital);
		
		Branch branch2 = new Branch() ;
		branch2.setName("UK-CK");
		branch2.setState("kiya-piya");
		branch2.setCountry("Irland");
		branch2.setPhone(100200300);
		branch2.setHospital(hospital);
		
		Branch branch3 = new Branch() ;
		branch3.setName("US-CK");
		branch3.setState("Washinton");
		branch3.setCountry("US");
		branch3.setPhone(885522);
		branch3.setHospital(hospital);
		
		entityTransaction.begin();
		
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(hospital);
		
		entityTransaction.commit();
		

	}

}
