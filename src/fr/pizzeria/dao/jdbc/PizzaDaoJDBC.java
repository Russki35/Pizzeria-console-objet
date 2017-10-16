/**
 * 
 */
package fr.pizzeria.dao.jdbc;

import java.sql.Statement;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

/**
 * @author ETY8
 *
 */
public class PizzaDaoJDBC implements IPizzaDao {

	Connection conn;
	Statement statement;

	public PizzaDaoJDBC() {

		try {
			Class.forName("org.mariadb.jcdb.Driver");
		} catch (ClassNotFoundException e) {

			throw new RuntimeException("Driver not found: " + e.getMessage());
		}

		String url = "jcdb:mariadb://localhost:3306/pizzeria";

		try {
			conn = DriverManager.getConnection("jcdb:mariadb://localhost:3306/pizzeria", "root", "");
		} catch (SQLException e) {

			throw new RuntimeException("Impossible de se connecter à la base de données: " + url);
		}

	}

	@Override
	public ArrayList<Pizza> findAllPizzas() {
		try {

			statement = conn.createStatement();
			ResultSet resultat = statement.executeQuery("SELECT * FROM pizzas");
			
			while(resultat.next()){
				Integer id = resultat.getInt("id");
				String nom = resultat.getString("nom");
				BigDecimal prix = resultat.getBigDecimal("prix");
			}
			
			resultat.close();
			
		} catch (SQLException e) {

			e.getMessage();
		}
		return null;
	}

	@Override
	public boolean saveNewPizza(Pizza pizza) {

		try {

			statement = conn.createStatement();
			int nbPizzasSave = statement
					.executeUpdate("INSERT INTO pizzas(code, nom, prix) "
							+ "VALUES ('" + pizza.getCode() 
                            + "', '" + pizza.getNom() 
                            + "', " + pizza.getPrix());
                            

		} catch (SQLException e) {

			return false;
		}
		return false;
	}

	@Override
	public boolean updatePizza(String codePizza, Pizza pizza) {
		
		try {

			statement = conn.createStatement();
			int nbPizzasUpdate = statement
					.executeUpdate("UPDATE pizzas SET code = '" + pizza.getCode()
													+ " , nom = '" + pizza.getNom() 
													+ " , prix = '" + pizza.getPrix());
							

		} catch (SQLException e) {

			return false;
		}
		return false;
	}

	@Override
	public boolean deletePizza(String codePizza) {
		try {

			statement = conn.createStatement();
			int nbPizzasSuppr = statement.executeUpdate("DELETE FROM pizzas");

		} catch (SQLException e) {

			return false;
		}
		return false;
	}

}
