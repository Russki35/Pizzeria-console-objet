package fr.pizzeria.ihm;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.dao.PizzeriaDaoTableau;
import fr.pizzeria.model.Pizza;

public class SupprimerPizzasOptionMenu extends OptionMenu {
	
	PizzeriaDaoTableau dao;
	Scanner sc;

	public SupprimerPizzasOptionMenu(PizzeriaDaoTableau dao, Scanner sc){
		
		this.dao = dao;
		this.sc = sc;
		
	}
	
	
	public void execute() {
		
		PizzeriaDaoTableau supprimerPizza = new PizzeriaDaoTableau();
		
		ArrayList<Pizza> pizza = dao.findAllPizzas();
		
		for(int i = 0; i < pizza.size(); i++){
			
			if(pizza != null){
				
				System.out.println(pizza.get(i));
			}
			
		}
		
		
		
	}

}
