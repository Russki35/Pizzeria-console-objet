package fr.pizzeria.console;

import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		// Initialisation
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

		// Affichage du menu
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		
		// Choix de l'utilisateur
		System.out.println("Choisissez une option de menu:");
		String choix = questionUser.next();
		
		if (choix.equals("1")){
			for (int i = 0; i < pizzas.length; i++) {
				if (pizzas[i] != null) {
					System.out.println(pizzas[i]);

				}
			}
		}
		
		if (choix.equals("2")){
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

		if (choix.equals("3")){
			System.out.println("Modifier une pizza");
			
			String code;
			String nom;
			double prix;
			
			String codeAModifier;
			
			System.out.println("Saisissez le code de la pizza à modifier");
			codeAModifier = questionUser.next();
			System.out.println("Saisissez le nouveau code");
			code = questionUser.next();
			System.out.println("Saisissez le nom d'une pizza");
			nom = questionUser.next();
			System.out.println("Saisissez le prix d'une pizza");
			prix = questionUser.nextDouble();
			
			for (int i = 0; i < pizzas.length; i++) {

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
