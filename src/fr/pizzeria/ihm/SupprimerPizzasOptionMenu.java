package fr.pizzeria.ihm;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzeriaDaoTableau;
import fr.pizzeria.model.Pizza;

public class SupprimerPizzasOptionMenu extends OptionMenu {
	
	IPizzaDao dao;
	Scanner sc;

	public SupprimerPizzasOptionMenu(IPizzaDao dao, Scanner sc){
		
		this.dao = dao;
		this.sc = sc;
		
	}
	
	
	public void execute() {
		
		
		String codePizza;
		
		PizzeriaDaoTableau supprimerPizza = new PizzeriaDaoTableau();
		
		List<Pizza> pizza = dao.findAllPizzas();
		
		for(int i = 0; i < pizza.size(); i++){
			
			if(pizza != null){
				
				System.out.println(pizza.get(i));
			}
			
		}
		
		System.out.println("Supprimer une pizza");
		System.out.println("Choisissez une pizza � supprimer");
		codePizza = sc.next();
		
		dao.deletePizza(codePizza);
		
		
		
		
	}

}
