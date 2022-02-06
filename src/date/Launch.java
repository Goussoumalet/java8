package date;

public class Launch {

	public static void main(String[] args) {
		
		Facture fact1 = new Facture("2021-01");
		Facture fact2 = new Facture("2021-02");
		
		System.out.println(" " +fact1);
		
		System.out.println("reste aujourd'hui " +fact1.resteAvantEcheance() +" "+"jours");
		
		System.out.println(" " +fact2);
		System.out.println("reste aujourd'hui " +fact2.resteAvantEcheance() +" "+"jours");
	}

}
