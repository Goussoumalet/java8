package consumer;

import java.util.*;
import java.util.function.Consumer;

public class Repertoire {
	
    private String nom;
	private List<Fichier> enfants = new ArrayList<>();
	List<Fichier> getEnfant () { return enfants;}
	
	public Repertoire(String nom){
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	 public void affiche (Consumer<Repertoire> sortie) {
		   sortie.accept(this);
	 }
	  public void ajoute(Fichier f1) {
		  enfants.add(f1);
	  }
}
