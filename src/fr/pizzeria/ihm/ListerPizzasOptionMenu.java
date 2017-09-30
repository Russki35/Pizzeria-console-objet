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
		 
		 ArrayList<Pizza> pizza = dao.findAllPizzas();
		 
		 for(int i = 0; i < pizza.size(); i++){
			 
			 if (pizza != null) {

					System.out.println(pizza.get(i));
			 }
					
					
		 }
		 
		 
	 }
	 
}
