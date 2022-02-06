package interfaceSupplier;

import java.util.function.IntSupplier;

public class Main {

	public static void main(String[] args) {
		
		parcours(Entier :: getAsInt);
	}

	
	public static void parcours(IntSupplier f) {
		for(int i =0; i<5; i++) {
			System.out.println("Suivant :" +Entier.getAsInt());
		}
		
	}
	
}
