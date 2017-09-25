package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public class PizzeriaDaoTableau implements IPizzaDao {
	
	Pizza[] pizzas = new Pizza[50];
	
	public PizzeriaDaoTableau() {
		
		
		pizzas[0] = new Pizza("PEP", "Pépéroni", 12.5);
		pizzas[1] = new Pizza("MAR", "Margarita", 14);
		pizzas[2] = new Pizza("REI", "La Reine", 11.5);
		pizzas[3] = new Pizza("FRO", "La Quatre Fromages", 12);
		pizzas[4] = new Pizza("CAN", "La Cannibale", 12.5);
		pizzas[5] = new Pizza("SAV", "La Savoyarde", 13);
		pizzas[6] = new Pizza("ORI", "L'Orientale", 13.5);
		pizzas[7] = new Pizza("IND", "L'indienne", 14);

	
	}
	
	@Override
	public Pizza[] findAllPizzas() {
		// TODO Auto-generated method stub
		return this.pizzas;
	}

	@Override
	public boolean saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		for(int i = 0; i<pizzas.length; i++){
			
			if (pizzas[i] != null) {

				pizzas[i] = pizza;
				
				
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
