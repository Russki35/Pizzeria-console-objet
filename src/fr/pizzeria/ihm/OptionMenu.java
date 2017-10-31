package fr.pizzeria.ihm;

import java.util.Scanner;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import fr.pizzeria.dao.IPizzaDao;

public abstract class OptionMenu {
	@Autowired
	protected Scanner sc;
	
	@Autowired
	protected Logger LOG;
	
	@Autowired
	protected IPizzaDao dao;
	
	public abstract void execute();

}
