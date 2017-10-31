package fr.pizzeria.ihm;

import java.util.Scanner;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import fr.pizzeria.dao.IPizzaDao;

public abstract class OptionMenu {
	
	protected Scanner sc;
	
	protected Logger LOG;
	
	protected IPizzaDao dao;
	
	public abstract void execute();
	
	/**
	 * 
	 */
	public OptionMenu(Scanner sc, Logger LOG, IPizzaDao dao) {
		this.sc=sc;
		this.LOG=LOG;
		this.dao=dao;
	}

}
