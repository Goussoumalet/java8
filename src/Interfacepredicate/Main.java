package Interfacepredicate;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Catalogue cat = new Catalogue();
		cat.ajoute(new Articles("Bouteille", 10));
		cat.ajoute(new Articles("Sandwich", 5));
		cat.ajoute(new Articles("Kebab", 6));
		cat.ajoute(new Articles("Jus", 2));
		cat.ajoute(new Articles("Sardine", 10));
		
	//retourne les articles avec un prix inférieur à 6
		
		List<Articles> result = cat.rechercheArticlePrix((a) ->
		   {return a.getPrix() >= 6 ;});
		
		
	     for(Articles i : result) {
	    	 System.out.println("Articles :" + " " +i.getNom());
	     }
		
	}

}
