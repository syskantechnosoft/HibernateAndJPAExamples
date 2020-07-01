package com.lcipl.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lcipl.bean.Region;

public class Starter {

	private static final String PERSISTENCE_UNIT_NAME = "JPADemo";
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}

	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}

	public static void insertEntity() {
		EntityManager entityManager = Starter.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Region region = new Region(5, "Australia");
		entityManager.persist(region);
		entityManager.getTransaction().commit();
		System.out.println("Inserted");
		entityManager.close();
	}

	public static void findEntity() {
		EntityManager entityManager = Starter.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Region region = entityManager.find(Region.class, 1);
		System.out.println("Region id :: " + region.getRegionId());
		System.out.println("Region Name :: " + region.getRegionName());
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static void updateEntity() {
		EntityManager entityManager = Starter.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		Region region = entityManager.find(Region.class, 4);
		System.out.println("Region id :: " + region.getRegionId());
		System.out.println("Region Name :: " + region.getRegionName());

		// The entity object is physically updated in the database when the transaction
		// is committed
		region.setRegionName("Africa");
		entityManager.getTransaction().commit();
		System.out.println("Updated");
		entityManager.close();
	}

	public static void removeEntity() {
		EntityManager entityManager = Starter.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		Region region = entityManager.find(Region.class, 5);
		entityManager.remove(region);
		entityManager.getTransaction().commit();
		System.out.println("Removed");
		entityManager.close();
	}

	public static void main(String[] args) {
		Starter.findEntity();
	}

}
