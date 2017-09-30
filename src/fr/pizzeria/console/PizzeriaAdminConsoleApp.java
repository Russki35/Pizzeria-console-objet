package fr.pizzeria.console;

import java.util.Locale;
import java.util.Scanner;


import fr.pizzeria.dao.PizzeriaDaoTableau;
import fr.pizzeria.ihm.AjouterPizzasOptionMenu;
import fr.pizzeria.ihm.ListerPizzasOptionMenu;
import fr.pizzeria.ihm.ModifierPizzasOptionMenu;
import fr.pizzeria.ihm.SupprimerPizzasOptionMenu;
import fr.pizzeria.model.Pizza;



public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		// Initialisation
		Scanner questionUser = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Liste des pizzas");
		
		PizzeriaDaoTableau dao = new PizzeriaDaoTableau();
		
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
				
				ListerPizzasOptionMenu listerPizzas = new ListerPizzasOptionMenu(dao, questionUser);
				listerPizzas.execute();
			}
			
			else if (choix.equals("2")){
				
				
				AjouterPizzasOptionMenu ajouterPizza = new AjouterPizzasOptionMenu(dao, questionUser);
				ajouterPizza.execute();

				
			}

			else if (choix.equals("3")){
				
				
				
				
				ModifierPizzasOptionMenu modifierPizzas = new ModifierPizzasOptionMenu(dao, questionUser);
				modifierPizzas.execute();
					

			}
			
			else if (choix.equals("4")){
				
				SupprimerPizzasOptionMenu supprimerPizza = new SupprimerPizzasOptionMenu(dao, questionUser);
				supprimerPizza.execute();
			}
			
			else if(choix.equals("99")){
				
				out = true;
				System.out.println("Bye !");
				
			}
			
		}
		
		
			
			
	}

		

}


