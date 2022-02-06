package consumer;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		
		Repertoire r1 = new Repertoire("dir");
		Fichier f1 = new Fichier("data. txt");
		r1.ajoute(f1);

		r1.affiche((Repertoire r) ->{
			System.out.println("DOSSIER :" +r.getNom());
			
			for(Fichier f : r.getEnfant()) {
				f.affiche((e) -> System.out.println(f.getNom()));
			}
		});
		
	}

}
