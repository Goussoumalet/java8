package date;

import java.time.LocalDate;
import java.time.Period;
import static java.time.temporal.ChronoUnit.DAYS;


 public class Facture {

	private String numero;
	private LocalDate date;
	private LocalDate echeance;
    static private Period dureeMax = Period.of(0, 2, 0);
	
	public Facture (String numero) {
		this.numero = numero;
		date = LocalDate.now();
		echeance = date.plus(dureeMax);
	}
	
	 @Override
	public String toString() {
	 return "votre facture n°:" +" " + numero +" "+ "date édition" + " " 
	   + date.toString() +" échéance au " +echeance;
		
	}
	 
	 long resteAvantEcheance() {
		 return LocalDate.now().until(echeance, DAYS);
	 }
}
