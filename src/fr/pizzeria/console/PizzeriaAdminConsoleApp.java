package fr.pizzeria.console;

import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.ihm.AjouterPizzasOptionMenu;
import fr.pizzeria.ihm.ListerPizzasOptionMenu;
import fr.pizzeria.ihm.ModifierPizzasOptionMenu;
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
		
		boolean out = false;
		while(!out){
			
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
				
				ListerPizzasOptionMenu listerPizzas = new ListerPizzasOptionMenu(pizzas, questionUser);
				listerPizzas.execute();
			}
			
			else if (choix.equals("2")){
				
				
				AjouterPizzasOptionMenu ajouterPizza = new AjouterPizzasOptionMenu(pizzas, questionUser);
				ajouterPizza.execute();

				
			}

			else if (choix.equals("3")){
				
				
				
				
				ModifierPizzasOptionMenu modifierPizzas = new ModifierPizzasOptionMenu(pizzas, questionUser);
				modifierPizzas.execute();
					

			}
			
			else if(choix.equals("99")){
				
				out = true;
				System.out.println("Bye !");
				
			}
			
		}
		
		
			
			
	}

		

}


