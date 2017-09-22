package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class AjouterPizzasOptionMenu {

	Pizza[] pizzas;
	Scanner sc;

	public AjouterPizzasOptionMenu(Pizza[] pizzas, Scanner sc) {

		this.pizzas = pizzas;
		this.sc = sc;

	}

	public void execute() {

		String code;
		String nom;
		double prix;

		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Ajoutez le code d'une pizza");

		code = sc.next();
		System.out.println("Ajoutez le nom d'une pizza");
		nom = sc.next();
		System.out.println("Ajoutez le prix d'une pizza");
		prix = sc.nextDouble();

		pizzas[8] = new Pizza(code, nom, prix);

		for (int i = 0; i < pizzas.length; i++) {

			if (pizzas[i] != null) {

				System.out.println(pizzas[i]);

			}

		}

	}

}
