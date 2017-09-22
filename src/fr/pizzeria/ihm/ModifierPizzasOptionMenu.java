package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class ModifierPizzasOptionMenu extends OptionMenu {

	Pizza[] pizzas;
	Scanner sc;

	public ModifierPizzasOptionMenu(Pizza[] pizzas, Scanner sc) {

		this.pizzas = pizzas;
		this.sc = sc;
	}

	public void execute() {

		String codeAModifier;
		String code;
		String nom;
		double prix;

		System.out.println("Modifier une pizza");
		System.out.println("Saisissez le code de la pizza à modifier");
		codeAModifier = sc.next();
		System.out.println("Saisissez le nouveau code");
		code = sc.next();
		System.out.println("Saisissez le nom d'une pizza");
		nom = sc.next();
		System.out.println("Saisissez le prix d'une pizza");
		prix = sc.nextDouble();
		
		for (int i = 0; i < pizzas.length; i++) {

			if (pizzas[i] != null) {
				if (pizzas[i].getCode().equals(codeAModifier)) {

					pizzas[i].setCode(code);
					pizzas[i].setNom(nom);
					pizzas[i].setPrix(prix);

					break;

				}

			}
			
			
		}

	}

}
