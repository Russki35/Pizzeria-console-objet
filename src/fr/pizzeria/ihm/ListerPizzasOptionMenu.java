package fr.pizzeria.ihm;

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
		 
		 Pizza[] pizzas = dao.findAllPizzas();
		 
		 for(int i = 0; i < pizzas.length; i++){
			 
			 if (pizzas[i] != null) {

					System.out.println(pizzas[i]);
			 }
					
					
		 }
		 
		 
	 }
	 
}
