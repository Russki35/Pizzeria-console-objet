package fr.pizzeria.dao;

import java.sql.SQLException;
import java.util.List;

import fr.pizzeria.model.Pizza;

public interface IPizzaDao {

	List<Pizza> findAllPizzas() throws SQLException;
	boolean saveNewPizza(Pizza pizza);
	boolean updatePizza(String codePizza, Pizza pizza);
	boolean deletePizza(String codePizza);
	
	
}
