package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveOrder {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		AmazonOrder amazonOrder = new AmazonOrder() ;
		amazonOrder.setName("nuthan");
		amazonOrder.setAddress("jp nagar");
		amazonOrder.setStatus("Approved");
		
		Item item1 = new Item() ;
		item1.setName("Old monk");
		item1.setPrice(1500.0);
		item1.setQuantity(1);
		item1.setAmazonOrder(amazonOrder);
		
		Item item2 = new Item() ;
		item2.setName("RS");
		item2.setPrice(1600.0);
		item2.setQuantity(1);
		item2.setAmazonOrder(amazonOrder);
		
		Item item3 = new Item() ;
		item3.setName("Raja whisky");
		item3.setPrice(160.0);
		item3.setQuantity(1);
		item3.setAmazonOrder(amazonOrder);
		
		
		entityTransaction.begin();
		
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityManager.persist(amazonOrder);
		
		entityTransaction.commit();
		
		

	}

}
