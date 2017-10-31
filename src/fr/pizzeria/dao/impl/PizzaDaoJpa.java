/**
 * 
 */
package fr.pizzeria.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

/**
 * @author ETY8
 *
 */
@Controller
public class PizzaDaoJpa implements IPizzaDao {

	private EntityManagerFactory entityManagerFactory;

	public PizzaDaoJpa() {
		entityManagerFactory = Persistence.createEntityManagerFactory("pizzeria");
	}

	@Override
	public List<Pizza> findAllPizzas() throws SQLException {
		EntityManager em = entityManagerFactory.createEntityManager();

		Query query = em.createQuery("FROM Pizza");
		Pizza p = (Pizza) query.getResultList().get(0);

		em.close();
		return null;
	}

	@Override
	public boolean saveNewPizza(Pizza pizza) {

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Query query = em.createQuery("select p from Pizza p where p.code='" + pizza.getCode() + "'");
		List resultList = query.getResultList();
		if (resultList.size()==0){
			em.persist(pizza);
			et.commit();
		}
		
		em.close();
		return false;
	}

	@Override
	public boolean updatePizza(String codePizza, Pizza pizzaFromSaisie) {

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Query query = em.createQuery("select p from Pizza p where p.code='" + codePizza + "'");
		Pizza pizzaFromBase = (Pizza) query.getSingleResult();

		if (pizzaFromBase != null) {
			pizzaFromBase.setCode(pizzaFromSaisie.getCode());
			pizzaFromBase.setNom(pizzaFromSaisie.getNom());
			pizzaFromBase.setPrix(pizzaFromSaisie.getPrix());
			em.merge(pizzaFromBase);
		}
		
		et.commit();
		em.close();
		
		return false;
	}

	@Override
	public boolean deletePizza(String codePizza) {

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		Query query = em.createQuery("select p from Pizza p where p.code='" + codePizza + "'");
		Pizza pizza1 = (Pizza) query.getSingleResult();

		if (pizza1 != null) {
			em.remove(pizza1);

		}
		
		et.commit();
		em.close();

		return false;

	}

}
