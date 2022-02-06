package functionalInterface;

public class Main {

	public static void main(String[] args) {
		// expression lambda
		declencherExecution(()-> System.out.println("Execution"));
		//variable qui pointe vers fonction
		MonInterface maFonction =  ()-> System.out.println("Execution retardée");
		maFonction.execute();
	
	//difficile a réalisé en java 7
		Maclasse monObjet = new Maclasse(); //on crée un objet particulié
		maFonction = monObjet :: execute;  // l'interface fonctionnel pointe vers l'objet
		maFonction.execute();
 
	  //adresse de fonction
	  declencherExecution(monObjet:: execute);
	}

	private static void declencherExecution(MonInterface i) {
		i.execute();
		
	}

}
