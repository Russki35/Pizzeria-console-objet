package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PizzeriaDaoTableau implements IPizzaDao {

	private ArrayList <Pizza> pizza = new ArrayList<Pizza>();


	public PizzeriaDaoTableau() {
		
		
		
		
		Pizza pizza0 = new Pizza("PEP", "Pépéroni", 12.5);
		pizza.add(pizza0);	
		Pizza pizza1 = new Pizza("MAR", "Margarita", 14);
		pizza.add(pizza1);
		Pizza pizza2 = new Pizza("REI", "La Reine", 11.5);
		pizza.add(pizza2);
		Pizza pizza3 = new Pizza("FRO", "La Quatre Fromages", 12);
		pizza.add(pizza3);
		Pizza pizza4 = new Pizza("CAN", "La Cannibale", 12.5);
		pizza.add(pizza4);
		Pizza pizza5 = new Pizza("SAV", "La Savoyarde", 13);    
		pizza.add(pizza5);
		Pizza pizza6 = new Pizza("ORI", "L'Orientale", 13.5);
		pizza.add(pizza6);
		Pizza pizza7 = new Pizza("IND", "L'indienne", 14);
		pizza.add(pizza7);
	}
	
	@Override
	public ArrayList<Pizza> findAllPizzas() {
		
		
		return this.pizza;
	}

	@Override
	public boolean saveNewPizza(Pizza pizza) {
		
		for(int i = 0; i < ((List<Pizza>) pizza).size(); i++){
			
			if (pizza != null) {

				
			return true;
				
			}
		}
		return false;
	}

	@Override
	public boolean updatePizza(String codePizza, Pizza pizza) {
		
		for (int i = 0; i < ((List<Pizza>) pizza).size(); i++) {

			if (pizza != null) {
				if (pizza.getCode().equals(codePizza)) {

					
					
					return true;

				}

			}
			
		}
		
		return false;
	}

	@Override
	public boolean deletePizza(String nom, Pizza pizza) {
		
		for (int i = 0; i < ((List<Pizza>) pizza).size(); i++) {

			if (pizza != null) {
				
			}
				if (pizza.getClass().equals(nom)) {

					
					
					return true;

				}

			}
		
		return false;
	}

	


}
