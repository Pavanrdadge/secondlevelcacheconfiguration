package com.ty.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Pen;

public class PenFetchDriver {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em1 = emf.createEntityManager();

		Pen pen = em1.find(Pen.class, 1);

		System.out.println("id: " + pen.getId());
		System.out.println("cost: " + pen.getCost());
		System.out.println("price: " + pen.getCost());

		Pen pen2 = em1.find(Pen.class, 1);
		System.out.println("id: " + pen2.getId());
		System.out.println("cost: " + pen2.getCost());
		System.out.println("price: " + pen2.getCost());

		EntityManager em2 = emf.createEntityManager();

		Pen pen3 = em2.find(Pen.class, 1);

		System.out.println("id: " + pen3.getId());
		System.out.println("cost: " + pen3.getCost());
		System.out.println("price: " + pen3.getCost());

	}
}
