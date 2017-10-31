package fr.pizzeria.ihm;

import java.util.Scanner;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.impl.PizzeriaDaoTableau;
import fr.pizzeria.model.Pizza;

public class ModifierPizzasOptionMenu extends OptionMenu {

	/**
	 * 
	 */
	@Autowired
	public ModifierPizzasOptionMenu(Scanner sc, Logger LOG, IPizzaDao dao) {
		super(sc, LOG, dao);
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

		Pizza pizza = new Pizza(code, nom, prix);
		dao.updatePizza(codeAModifier, pizza);

	}

}
