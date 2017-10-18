/**
 * 
 */
package fr.pizzeria.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

/**
 * @author ETY8
 *
 */
public class PizzaDaoJpa implements IPizzaDao {

	private EntityManagerFactory entityManagerFactory;

	public PizzaDaoJpa() {
		entityManagerFactory = Persistence.createEntityManagerFactory("pizzeria");
	}

	@Override
	public List<Pizza> findAllPizzas() throws SQLException {
		EntityManager em = entityManagerFactory.createEntityManager();

		Query query = em.createQuery("FROM pizzas");
		Pizza p = (Pizza) query.getResultList().get(0);

		em.close();
		return null;
	}

	@Override
	public boolean saveNewPizza(Pizza pizza) {

		EntityManager em = entityManagerFactory.createEntityManager();
		em.persist(pizza);
		em.close();
		return false;
	}

	@Override
	public boolean updatePizza(String codePizza, Pizza pizza) {

		EntityManager em = entityManagerFactory.createEntityManager();

		Query query = em.createQuery("select p from pizzas where p.code='" + codePizza + "'");
		Pizza pizza1 = (Pizza) query.getSingleResult();

		if (pizza1 != null) {
			Pizza pizza2 = new Pizza();
			pizza2.setCode(pizza1.getCode());
			pizza2.setNom(pizza1.getNom());
			pizza2.setPrix(pizza1.getPrix());
			em.merge(pizza2);
		}

		return false;
	}

	@Override
	public boolean deletePizza(String codePizza) {

		EntityManager em = entityManagerFactory.createEntityManager();

		Query query = em.createQuery("select p from pizzas where p.code='" + codePizza + "'");
		Pizza pizza1 = (Pizza) query.getSingleResult();

		if (pizza1 != null) {
			em.remove(pizza1);

		}

		return false;

	}

}
