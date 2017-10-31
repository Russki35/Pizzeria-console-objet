package fr.pizzeria.ihm;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.impl.PizzeriaDaoTableau;
import fr.pizzeria.model.Pizza;

public class SupprimerPizzasOptionMenu extends OptionMenu {
	
	
	
	
	public void execute() {
		
		
		String codePizza;
		
		PizzeriaDaoTableau supprimerPizza = new PizzeriaDaoTableau();
		
		try {
			List<Pizza> pizza = dao.findAllPizzas();
			for (int i = 0; i < pizza.size(); i++) {

				if (pizza != null) {

					System.out.println(pizza.get(i));
				}

			} 
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Supprimer une pizza");
		System.out.println("Choisissez une pizza � supprimer");
		codePizza = sc.next();
		
		dao.deletePizza(codePizza);
		
		
		
		
	}

}
