/**
 * 
 */
package config;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;

/**
 * @author ETY8
 *
 */
@Configuration
@ComponentScan({ "fr.pizzeria.dao.impl", "fr.pizzeria.ihm", "fr.pizzeria.console"})
public class Config {

	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}

	@Bean
	public Logger logger() {
		return LoggerFactory.getLogger(PizzeriaAdminConsoleApp.class);
	}
}
