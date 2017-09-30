package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.dao.PizzeriaDaoTableau;

public class SupprimerPizzasOptionMenu extends OptionMenu {
	
	PizzeriaDaoTableau dao;
	Scanner sc;

	public SupprimerPizzasOptionMenu(PizzeriaDaoTableau dao, Scanner sc){
		
		this.dao = dao;
		this.sc = sc;
		
	}
	
	
	protected void execute() {
		
		
		
	}

}
