package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.dao.PizzeriaDaoTableau;
import fr.pizzeria.model.Pizza;

public class AjouterPizzasOptionMenu extends OptionMenu {

	PizzeriaDaoTableau dao;
	Scanner sc;

	public AjouterPizzasOptionMenu(PizzeriaDaoTableau dao, Scanner sc) {

		this.dao = dao;
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

		
		Pizza pizza = new Pizza(code, nom, prix);
		
		PizzeriaDaoTableau ajoutPizza = new PizzeriaDaoTableau();
		ajoutPizza.saveNewPizza(pizza);

		}

	}


