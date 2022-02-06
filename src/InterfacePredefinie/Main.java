package InterfacePredefinie;

public class Main {

	public static void main(String[] args) {
		//interface Function <T,R>
		Client monClient1 = new Client("Gous", "Tanguy");
		Client monClient2 = new Client("Gous", "Jason");
		Client monClient3 = new Client("Decaix", "Cindy");
		
		// creation d'un objet client qui fait appel a la fonction rendre
		String str1 = monClient1.rendre((Client c1) -> {return c1.getNom()+" " +c1.getPrenom();});
		String str2 = monClient2.rendre((Client c2) -> {return c2.getNom()+" " +c2.getPrenom();});
		String str3 = monClient3.rendre((Client c3) -> {return c3.getNom()+" " +c3.getPrenom();});
		
		
		//creation d'un objet facture
		Facture fact = new Facture("2021-10");
		System.out.println("Facture initiale : " +fact.getNumero());
		fact.increment(s -> {return s+"1";});

		//affichage des nom des clients
		System.out.println("Affichage de noms des clients");
		System.out.println("client n°1 :"  +str1);
		System.out.println("client n°2 :"  +str2);
		System.out.println("client n°3 :"  +str3);
		
		
		monClient1.setFacture(fact);
 		monClient2.setFacture(fact);
		monClient3.setFacture(fact);
		
		String result1 = monClient1.lier((Client c1, Facture f1) ->{return
				c1.getNom()+ " " + c1.getPrenom()+" " + f1.getNumero();});
		String result2 = monClient2.lier((Client c2, Facture f2) ->{return
				c2.getNom()+ " " + c2.getPrenom()+" " + f2.getNumero();});
		String result3 = monClient3.lier((Client c3, Facture f3) ->{return
				c3.getNom()+ " " + c3.getPrenom()+" " + f3.getNumero();});
		
		//affichage du client avec le numéro de facture
		System.out.println("Affichage des clients avec le numero de facture");
		System.out.println("client n°1" + " " +result1 );
		System.out.println("client n°2" + " " +result2 );
		System.out.println("client n°3" + " " +result3 );
		}
}
