/**
 * 
 */
package fr.pizzeria.dao.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ETY8
 *
 */

@Entity
@Table(name="pizzas")

public class Pizza {
	
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(name="code")
		private String code;
		
		@Column(name="nom")
		private String nom;
		
		@Column(name="prix")
		private double prix;
		
		public Pizza(){
			
		}
		
		@Override
		public String toString() {
			return "Pizza [id=" + id + ", code=" + code + ", nom=" + nom + ", prix=" + prix + "]";
		}
		
		
		
		
		
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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



		
		
		
		
		
		
}
