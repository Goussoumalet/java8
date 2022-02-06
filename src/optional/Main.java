package optional;

import java.util.Optional;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		//int donnees = trouver("hello");
		
		Optional donnees = trouver("hello");
		 
		if(donnees.isPresent()) {
			System.out.println("data" +donnees.get());
		}
		else {
			System.out.println("absente");
		}

		
		 donnees = trouver("bonjour");
		 
		if(donnees.isPresent()) {
			System.out.println("data" +donnees.get());
		}
		else {
			System.out.println("absente");
		}
		
	}
	
	@SuppressWarnings("rawtypes")
	private static Optional trouver(String str) {
		 if(str == "bonjour") {
			//la fabrication  optional � r�tourner
				return Optional.of(1);
		 }
		 else {
			 //rien � retourner 
			 return Optional.empty();
		 }
		
	}

}
