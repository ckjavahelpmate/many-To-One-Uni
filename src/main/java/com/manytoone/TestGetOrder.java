package com.manytoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetOrder {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		Item item = entityManager.find(Item.class, 9) ;
		
		if(item != null ) {
			
			System.out.println("Item id: "+item.getId());
			System.out.println("Item name: "+item.getName());
			System.out.println("Item price: "+item.getPrice());
			System.out.println("Item quantity: "+item.getQuantity());
			System.out.println("Order Id: "+item.getAmazonOrder().getId());
			System.out.println("Order name: "+item.getAmazonOrder().getName());
			System.out.println("Order address: "+item.getAmazonOrder().getAddress());
		}
		else {
			System.out.println("Item not found");
		}
		

	}

}
