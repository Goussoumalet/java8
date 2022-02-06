package expressionLambda;

//création d'un interface
	interface MonInterface{
		void print(String s);
	}
	
	
public class Lambda {

	public static void affiche(MonInterface printer) {
		
		printer.print("Salut un essaie de l'expression lambda");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // expression 
		 affiche (x->System.out.println(x));
	}


}
