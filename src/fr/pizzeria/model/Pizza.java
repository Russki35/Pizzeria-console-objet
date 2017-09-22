package fr.pizzeria.model;

import java.util.Scanner;

public class Pizza {

	int id;
	String code;
	String nom;
	double prix;
	
	public Pizza(String code, String nom, double prix) {
		
		setCode(code);
		setNom(nom);
		setPrix(prix);
		
	}
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	@Override
//	public String toString() {
//		return "Pizza [code=" + code + ", nom=" + nom + ", prix=" + prix + "]";
//	}
	
	public String toString() {
		
		return this.code+"-> "+this.nom+" "+this.prix;
	}
	 
	
	
	

}
