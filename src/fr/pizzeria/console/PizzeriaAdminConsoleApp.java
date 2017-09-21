package fr.pizzeria.console;

import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Scanner questionUser = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Liste des pizzas");

		Pizza[] pizzas = new Pizza[50];
		pizzas[0] = new Pizza("PEP", "Pépéroni", 12.5);
		pizzas[1] = new Pizza("MAR", "Margarita", 14);
		pizzas[2] = new Pizza("REI", "La Reine", 11.5);
		pizzas[3] = new Pizza("FRO", "La Quatre Fromages", 12);
		pizzas[4] = new Pizza("CAN", "La Cannibale", 12.5);
		pizzas[5] = new Pizza("SAV", "La Savoyarde", 13);
		pizzas[6] = new Pizza("ORI", "L'Orientale", 13.5);
		pizzas[7] = new Pizza("IND", "L'indienne", 14);

		for (int i = 0; i < pizzas.length; i++) {

			if (pizzas[i] != null) {

				System.out.println(pizzas[i]);

			}

		}

		String code;
		String nom;
		double prix;

		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Ajoutez le code d'une pizza");

		code = questionUser.next();
		System.out.println("Ajoutez le nom d'une pizza");
		nom = questionUser.next();
		System.out.println("Ajoutez le prix d'une pizza");
		prix = questionUser.nextDouble();

		pizzas[8] = new Pizza(code, nom, prix);

		for (int i = 0; i < pizzas.length; i++) {

			if (pizzas[i] != null) {

				System.out.println(pizzas[i]);

			}

		}

	}

}
