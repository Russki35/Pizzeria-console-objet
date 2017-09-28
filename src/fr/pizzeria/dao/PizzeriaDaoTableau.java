package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PizzeriaDaoTableau implements IPizzaDao {
	

	private ArrayList <Pizza> pizzas = new ArrayList<Pizza>();


	public PizzeriaDaoTableau() {
		
		
		
		
		Pizza pizza0 = new Pizza("PEP", "Pépéroni", 12.5);
		pizzas.add(pizza0);	
		Pizza pizza1 = new Pizza("MAR", "Margarita", 14);
		pizzas.add(pizza1);
		Pizza pizza2 = new Pizza("REI", "La Reine", 11.5);
		pizzas.add(pizza2);
		Pizza pizza3 = new Pizza("FRO", "La Quatre Fromages", 12);
		pizzas.add(pizza3);
		Pizza pizza4 = new Pizza("CAN", "La Cannibale", 12.5);
		pizzas.add(pizza4);
		Pizza pizza5 = new Pizza("SAV", "La Savoyarde", 13);    
		pizzas.add(pizza5);
		Pizza pizza6 = new Pizza("ORI", "L'Orientale", 13.5);
		pizzas.add(pizza6);
		Pizza pizza7 = new Pizza("IND", "L'indienne", 14);
		pizzas.add(pizza7);
	}
	
	@Override
	public ArrayList<Pizza> findAllPizzas() {
		// TODO Auto-generated method stub
		
		return this.pizzas;
	}

	@Override
	public boolean saveNewPizza(Pizza pizzas) {
		// TODO Auto-generated method stub
		for(int i = 0; i<pizzas.size(); i++){
			
			if (pizzas != null) {

				pizzas = pizza;
				
				
				return true;
				
			}
		}
		return false;
	}

	@Override
	public boolean updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		for (int i = 0; i < pizzas.length; i++) {

			if (pizzas[i] != null) {
				if (pizzas[i].getCode().equals(codePizza)) {

					pizzas[i] = pizza;
					
					return true;

				}

			}
			
		}
		
		return false;
	}

	@Override
	public boolean deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}

}
