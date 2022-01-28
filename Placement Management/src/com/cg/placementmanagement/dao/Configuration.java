package com.cg.placementmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configuration {
	private static EntityManager entityManager;
	private static EntityManagerFactory entityManagerFactory;
	static {
		entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntityManager() {
		entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
}
