package fr.pizzeria.console;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


import fr.pizzeria.dao.PizzeriaDaoTableau;
import fr.pizzeria.ihm.OptionMenu;
import fr.pizzeria.ihm.AjouterPizzasOptionMenu;
import fr.pizzeria.ihm.ListerPizzasOptionMenu;
import fr.pizzeria.ihm.ModifierPizzasOptionMenu;
import fr.pizzeria.ihm.SupprimerPizzasOptionMenu;
import fr.pizzeria.model.Pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PizzeriaAdminConsoleApp {
	
	private static final Logger LOG = LoggerFactory.getLogger(PizzeriaAdminConsoleApp.class);
	
	public static void main(String[] args) {


		// Initialisation
		Scanner questionUser = new Scanner(System.in).useLocale(Locale.US);
		
		
		PizzeriaDaoTableau dao = new PizzeriaDaoTableau();
		
		// Affichage du menu
		Map<String, OptionMenu> options = new HashMap();
		options.put("1", new ListerPizzasOptionMenu(dao, questionUser));
		options.put("2", new AjouterPizzasOptionMenu(dao, questionUser));
		options.put("3", new ModifierPizzasOptionMenu(dao, questionUser));
		options.put("4", new SupprimerPizzasOptionMenu(dao, questionUser));
		
		
		boolean out = false;
		while(!out){
			
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");
			
			// Choix de l'utilisateur
			LOG.info("Choisissez une option de menu:");
			String choix = questionUser.next();
			if(choix.equals("99")){
				
				out = true;
				System.out.println("Bye !");
				
			}
			else 
				options.get(choix).execute();
			
			
			
		}
		
		
			
			
	}

		

}


