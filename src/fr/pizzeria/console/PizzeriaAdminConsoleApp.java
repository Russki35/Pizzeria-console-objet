package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.impl.PizzaDaoJDBC;
import fr.pizzeria.dao.impl.PizzaDaoJpa;
import fr.pizzeria.dao.impl.PizzeriaDaoTableau;
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
	
	private static ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	public static void main(String[] args) {


		// Initialisation
		Scanner questionUser = new Scanner(System.in).useLocale(Locale.US);
		
		
		IPizzaDao dao = new PizzaDaoJpa();
		
		// Affichage du menu
		Map<String, OptionMenu> options = new HashMap();
		options.put("1", new ListerPizzasOptionMenu(dao, questionUser));
		options.put("2", new AjouterPizzasOptionMenu(dao, questionUser));
		options.put("3", new ModifierPizzasOptionMenu(dao, questionUser));
		options.put("4", new SupprimerPizzasOptionMenu(dao, questionUser));
		
		
		Pizza pizza0 = new Pizza("PEP", "Pépéroni", 12.5);
		pizzas.add(pizza0);
		Pizza pizza1 = new Pizza("MAR", "Margarita", 14);
		pizzas.add(pizza1);
		Pizza pizza2 = new Pizza("REI", "La Reine", 11.5);
		pizzas.add(pizza2);
		Pizza pizza3 = new Pizza("FRO", "La Quatre Fromages", 12);
		pizzas.add(pizza3);
		Pizza pizza4 = new Pizza("CAN", "La Cannibale", 12.5);
		pizzas.add(pizza4);
		Pizza pizza5 = new Pizza("SAV", "La Savoyarde", 13);
		pizzas.add(pizza5);
		Pizza pizza6 = new Pizza("ORI", "L'Orientale", 13.5);
		pizzas.add(pizza6);
		Pizza pizza7 = new Pizza("IND", "L'indienne", 14);
		pizzas.add(pizza7);
		
		for (Pizza pizza : pizzas) {
			
			dao.saveNewPizza(pizza);
		}
	
		
		boolean out = false;
		while(!out){
			
		
			
			LOG.info("***** Pizzeria Administration *****");
			LOG.info("1. Lister les pizzas");
			LOG.info("2. Ajouter une nouvelle pizza");
			LOG.info("3. Mettre à jour une pizza");
			LOG.info("4. Supprimer une pizza");
			LOG.info("99. Sortir");
			
			// Choix de l'utilisateur
			LOG.info("Choisissez une option de menu:");
			String choix = questionUser.next();
			if(choix.equals("99")){
				
				out = true;
				LOG.info("Bye !");
				
			}
			else 
				options.get(choix).execute();									
		}
								
	}

	
	
	
	
	
		
}


