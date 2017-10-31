package fr.pizzeria.ihm;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.impl.PizzeriaDaoTableau;
import fr.pizzeria.model.Pizza;

public class AjouterPizzasOptionMenu extends OptionMenu {

	

	public void execute() {

		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Ajoutez le code d'une pizza");

		String code = sc.next();
		System.out.println("Ajoutez le nom d'une pizza");
		String nom = sc.next();
		System.out.println("Ajoutez le prix d'une pizza");
		double prix = sc.nextDouble();

		Pizza pizza = new Pizza(code, nom, prix);

		dao.saveNewPizza(pizza);

	}

}
