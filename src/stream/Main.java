 package stream;

import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		// création d'une liste de données 
		List<String> uneListe = new ArrayList<>();
		 uneListe.add("Tanguy");
		 uneListe.add("Jason");
		 uneListe.add("Brayanne");
		 uneListe.add("Bradley");
		 
	 //System.out.println("affiche liste:" + uneListe);
	 uneListe.stream()
	           .filter(s-> s.length() < 7)
	           .forEach(System.out::println);
	 
	 
	 Stream.of("Tanguy","Jason", "Brayanne","Bradley") // on va prendre un flux
	       .filter(s -> s.length() < 7) //oon va le filter
	       .map(String :: toUpperCase)  // on va le mapper 
	       .forEach(System.out :: println); // on va l'afficher.
	 
	 // calcul moi la longue d'une chaine de caractere
	 Optional somme = Stream.of("Tanguy", "Jason", "Brayanne", "Bradley")
	        .filter(s -> s.length() < 7)
	        .map(s -> s.length())
	        .reduce((l1,l2) -> l1+ l2);
		 
	        
	        System.out.println("La somme  des caractères: " +somme.get());
	}

}
