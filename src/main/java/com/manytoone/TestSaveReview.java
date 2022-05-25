package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveReview {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		
		Product product = new Product() ;
		product.setName("Samsung-m31s");
		product.setPrice(22000);
		
		Review review1 = new Review() ;
		review1.setName("ck");
		review1.setStar("*****");
		review1.setFeedback("Best in segement");
		review1.setProduct(product);
		
		Review review2 = new Review() ;
		review2.setName("nuthan");
		review2.setStar("****");
		review2.setFeedback("worth for money");
		review2.setProduct(product);
		
		Review review3 = new Review() ;
		review3.setName("varun");
		review3.setStar("****");
		review3.setFeedback("i liked it most");
		review3.setProduct(product);
		
		entityTransaction.begin();
		
		entityManager.persist(review1);
		entityManager.persist(review2);
		entityManager.persist(review3);
		entityManager.persist(product);
		
		entityTransaction.commit();
		
	}

}
