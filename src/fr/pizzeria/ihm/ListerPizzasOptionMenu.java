package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu {
	
	
	 Pizza[] pizzas;
	 Scanner sc;
	
	 public ListerPizzasOptionMenu(Pizza[] pizzas, Scanner sc) {// Méthode constructeur
		
		 this.pizzas = pizzas;
		 this.sc = sc;
		 
	 }
	 

	 
	 public void execute(){
		 

		 for (int i = 0; i < pizzas.length; i++) {
				if (pizzas[i] != null) {
					System.out.println(pizzas[i]);

				}
			}
		 
	 }

}
