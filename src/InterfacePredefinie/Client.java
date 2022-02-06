package InterfacePredefinie;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Client {
	
	private String nom;
	private String prenom;
	private Facture facture;
	
	public Client(String nom, String prenom) {
		this.setNom(nom);
		this.setPrenom(prenom);
	}
	
	public String rendre(Function<Client, String> rendu) {
		return rendu.apply(this);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	 public void setFacture(Facture f) {
		 this.facture = f;
	 }

	//application de Bifunction
	public String lier(BiFunction<Client, Facture, String> liaison) {
		return liaison.apply(this, facture);
		
	}
	
	
}
