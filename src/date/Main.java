package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//la notion de temps local
		 LocalDateTime tp = LocalDateTime.now();
		 LocalTime lt = LocalTime.of(12, 12);
		 
		 tp.minusMinutes(12);
		 
		 //la notion de zone
		 ZoneId zid = ZoneId.of("Europe/Paris");
		 ZonedDateTime zd = ZonedDateTime.of(tp, zid);
		 
		 //la notion de durée
		 Period p = Period.of(2021, 10, 0);
		  
		 LocalDate ld = LocalDate.now();
		 ld.plus(p);
		 
		 // la notion de chronologie
		 Chronology dt = Chronology.ofLocale(Locale.FRENCH);
		 ChronoLocalDate cld = dt.dateNow();
		 int annee = cld.get(ChronoField.YEAR);
		 

}
	
}
