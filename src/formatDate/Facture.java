package formatDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Facture {
	private String numero;
	private LocalDate date;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
    //créer sa propre format de date time 
	private DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder()
    		.appendLiteral("Le" +" ")
    		.appendValue(ChronoField.DAY_OF_MONTH)
    		.appendLiteral( " du mois n°" +" ")
    		.appendValue(ChronoField.MONTH_OF_YEAR)
    		.appendLiteral(" de l'an" + " ")
    		.appendValue(ChronoField.YEAR);
	
	public Facture(String num) {
		this.numero = num;
		this.date = LocalDate.now();
	}
	
	public String toString() {
	   dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
		return "Numéro Facture :" + " " +numero+ ", "+"date :"+" " +date.format(dtfb.toFormatter());
	}
	
	public void accept(String str) {
		date = LocalDate.parse(str, dtf);
	}
}
