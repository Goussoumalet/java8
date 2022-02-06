package streamParallel;

public class Facture {

	private String numero;
	private double total;
	
	public Facture(String numero, double total) {
		this.numero = numero;
		this.total = total;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public double getTotal() {
		return total;
	}
	
	@Override
	public String toString() {
		return "numero" +numero+ " total" +total;
	}
}
