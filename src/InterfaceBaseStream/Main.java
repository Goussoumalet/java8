package InterfaceBaseStream;

import java.util.*;
import java.util.stream.Stream;

public class Main {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		List<String> maListe = new ArrayList<>();
		maListe.add("Tanguy");
		maListe.add("Jason");
		maListe.add("Georgina");
		 
		maListe.stream()
		       .filter(s ->s.length() <=8 )
               .forEach(System.out :: println);	
		
		Stream str = maListe.stream();
		str.forEach(System.out :: println);
		Stream.of("Tanguy", "Jason", "Georgina").forEach(System.out::println);
		
		Stream.Builder b = Stream.builder();
		 b.accept("Tanguy");
		 b.accept("Jason");
		 b.accept("Georgina");
		 b.build().forEach(System.out::println);

 }
	
}
