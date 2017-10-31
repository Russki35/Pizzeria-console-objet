package fr.pizzeria.ihm;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu {



	

	public void execute(){
		 
		try {
			List<Pizza> pizza = dao.findAllPizzas();
			for (int i = 0; i < pizza.size(); i++) {

				if (pizza != null) {

					System.out.println(pizza.get(i));
				}

			} 
		} catch (Exception e) {
			
		}
		 
		 
	 }
	 
}
