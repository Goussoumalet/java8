package tri;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		for(int max = 50000; max<100000; max*=10) {
			triParallele(max);
			System.out.print(" et ");
			triSequentiel(max);
			System.out.print(" ");
		}

	}

	// tri parallèle
	public static void triParallele(int max) {
		int [] donnees = new int[max];
		for(int i = 0; i<max; i++) {
			donnees[i] = (int)(Math.random()*50);
		}
		 long t0 = System.currentTimeMillis();
	     Arrays.parallelSort(donnees);
	     long t1 = System.currentTimeMillis();
	     
	     for(int i=0; i<20; i++) {
	    	 System.out.println(donnees[i]);
	     }
	     
	     System.out.print("tri parallèle sort en " +(t1-t0));
	}
	
	//tri sequentiel
	public static void triSequentiel(int max) {
		int [] donnees = new int[max];
		for(int i = 0; i<max; i++) {
			donnees[i] = (int)(Math.random()*50);
		}
		 long t0 = System.currentTimeMillis();
	     Arrays.sort(donnees);
	     long t1 = System.currentTimeMillis();
	     
	     for(int i=0; i<20; i++) {
	    	 System.out.println(donnees[i]);
	     }
	     
	     System.out.print(" tri sequentiel sort en " +(t1-t0));
	}
	
	
}
