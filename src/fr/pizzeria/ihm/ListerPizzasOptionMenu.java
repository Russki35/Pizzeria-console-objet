package fr.pizzeria.ihm;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.dao.PizzeriaDaoTableau;
import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu {

	PizzeriaDaoTableau dao;
	Scanner sc;

	public ListerPizzasOptionMenu(PizzeriaDaoTableau dao, Scanner sc) {

		this.dao = dao;
		this.sc = sc;

	}

	public void execute(){
		 
		 ArrayList<Pizza> pizzas = dao.findAllPizzas();
		 
		 for(int i = 0; i < pizzas.size(); i++){
			 
			 if (pizzas != null) {

					System.out.println(pizzas.get(i));
			 }
					
					
		 }
		 
		 
	 }
	 
}
