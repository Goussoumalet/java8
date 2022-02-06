package streamParallel;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	
	
	public static void main(String[] args) {
		
//     List<String> maListe = new ArrayList<>();
//     for (int i = 0; i<10; i++) {
//    	 maListe.add("" +i);     
//     
//	}
//	 maListe.stream().forEach(System.out:: println);

	List<Facture> fact = new ArrayList<>();
	fact.add(new Facture("2016-01-01", 234.45));
	fact.add(new Facture("2015-02-04", 545.25));
	fact.add(new Facture("2016-07-04", 842.12));
	fact.add(new Facture("2016-06-06", 645.58));
		
	
	String resultat1 = fact.stream()
			.filter(f -> f.getTotal() > 100)
			.map(Facture::getNumero)
			.collect(Collectors.joining(":"));
	System.out.println("votre resultat n°1"+ " " +resultat1);
	
	// traitement en parallèle
	String resultat2 = fact.parallelStream()
			.filter(f -> f.getTotal() > 100)
			.map(Facture::getNumero)
			.collect(Collectors.joining(":"));
	System.out.println("votre resultat n°2"+ " " +resultat2);
	
	}
}