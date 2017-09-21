package fr.pizzeria.model;

import java.util.Scanner;

public class Pizza {

	int id;
	String code;
	String nom;
	double prix;
	
	public Pizza(String code, String nom, double prix) {
		
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		
	}
	
	String getCode(){
		
		return code;
	}
	
	String getNom(){
		
		return nom;
	}
	
	double getPrix(){
		
		return prix;
	}

	@Override
//	public String toString() {
//		return "Pizza [code=" + code + ", nom=" + nom + ", prix=" + prix + "]";
//	}
	
	public String toString() {
		
		return this.code+"-> "+this.nom+" "+this.prix;
	}
	 
	
	
	

}
