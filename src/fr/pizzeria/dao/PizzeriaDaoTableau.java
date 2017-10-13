package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PizzeriaDaoTableau implements IPizzaDao {

	private ArrayList<Pizza> listPizza = new ArrayList<Pizza>();

	public PizzeriaDaoTableau() {

		Pizza pizza0 = new Pizza("PEP", "Pépéroni", 12.5);
		listPizza.add(pizza0);
		Pizza pizza1 = new Pizza("MAR", "Margarita", 14);
		listPizza.add(pizza1);
		Pizza pizza2 = new Pizza("REI", "La Reine", 11.5);
		listPizza.add(pizza2);
		Pizza pizza3 = new Pizza("FRO", "La Quatre Fromages", 12);
		listPizza.add(pizza3);
		Pizza pizza4 = new Pizza("CAN", "La Cannibale", 12.5);
		listPizza.add(pizza4);
		Pizza pizza5 = new Pizza("SAV", "La Savoyarde", 13);
		listPizza.add(pizza5);
		Pizza pizza6 = new Pizza("ORI", "L'Orientale", 13.5);
		listPizza.add(pizza6);
		Pizza pizza7 = new Pizza("IND", "L'indienne", 14);
		listPizza.add(pizza7);
	}

	@Override
	public ArrayList<Pizza> findAllPizzas() {

		return this.listPizza;
	}

	@Override
	public boolean saveNewPizza(Pizza pizza) {

		listPizza.add(pizza);
		return false;
	}

	@Override
	public boolean updatePizza(String codePizza, Pizza pizzaAMettreAJour) {

		for (Pizza pizzaCourante : listPizza) {

			if (pizzaCourante.getCode().equals(codePizza)) {

				// pizza trouvé
				pizzaCourante.setCode(pizzaAMettreAJour.getCode());
				pizzaCourante.setNom(pizzaAMettreAJour.getNom());
				pizzaCourante.setPrix(pizzaAMettreAJour.getPrix());

				return true;

			}

		}

		return false;
	}

	@Override
	public boolean deletePizza(String codePizza) {

		// etape 1 - trouver la pizza dans la liste qui a le code codePizza
		Pizza pizzaASupprimer = null;

		for (Pizza pizzaCourante : listPizza) {
			if (pizzaCourante.getCode().equals(codePizza)) {
				pizzaASupprimer = pizzaCourante;
			}
		}

		// etape 2 - suppression
		if (pizzaASupprimer != null) {
			listPizza.remove(pizzaASupprimer);
			return true;
		}

		return false;
	}

}
