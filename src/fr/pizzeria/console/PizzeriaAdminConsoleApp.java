package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import config.Config;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.impl.PizzaDaoJpa;
import fr.pizzeria.ihm.AjouterPizzasOptionMenu;
import fr.pizzeria.ihm.ListerPizzasOptionMenu;
import fr.pizzeria.ihm.ModifierPizzasOptionMenu;
import fr.pizzeria.ihm.OptionMenu;
import fr.pizzeria.ihm.SupprimerPizzasOptionMenu;
import fr.pizzeria.model.Pizza;

@Service
public class PizzeriaAdminConsoleApp {
	
	@Autowired
	private Logger LOG;
	
	private static ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private IPizzaDao dao;
	
	@Autowired
	private Scanner questionUser;
	
	private Map<String, OptionMenu> options;
	
	@PostConstruct
	public void init(){
		options = context.getBeansOfType(OptionMenu.class);
		mettrePizzaBase();
		execute();
	}
	
	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)){
			context.getBean(PizzeriaAdminConsoleApp.class);
		}
								
	}

	/**
	 * 
	 */
	private void execute() {
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

	/**
	 * 
	 */
	private void mettrePizzaBase() {
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
	}

	
	
	
	
	
		
}


