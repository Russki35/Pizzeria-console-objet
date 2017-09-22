package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class AjouterPizzasOptionMenu extends OptionMenu {

	Pizza[] pizzas;
	Scanner sc;

	public AjouterPizzasOptionMenu(Pizza[] pizzas, Scanner sc) {

		this.pizzas = pizzas;
		this.sc = sc;

	}

	public void execute() {

		

		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Ajoutez le code d'une pizza");

		String code = sc.next();
		System.out.println("Ajoutez le nom d'une pizza");
		String nom = sc.next();
		System.out.println("Ajoutez le prix d'une pizza");
		double prix = sc.nextDouble();

		
		boolean added = false;
		
		for (int i = 0; i < pizzas.length; i++) {
			
			
			if (pizzas[i] != null && added == false) {

				pizzas[i] = new Pizza(code, nom, prix);
				System.out.println(pizzas[i]);
				added = true;

			}

		}

	}

}
