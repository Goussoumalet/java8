package InterfacePredefinie;

import java.util.function.UnaryOperator;

//UnaryOperator
public class Facture {

	private String numero;
	
	public Facture(String num) {
		this.numero = num;
	}
	// application de unaryOperator
	public void increment(UnaryOperator<String> inc) {
		numero = inc.apply(numero); // type de parametre = type de retour
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
