package interfaceSupplier;

public class Entier {

	static int [] suite = {1,2,3,5,8,13,21,24,55};
	static int i = 0;
	
	public static int getAsInt() {
		return suite[i++];
	}
}
