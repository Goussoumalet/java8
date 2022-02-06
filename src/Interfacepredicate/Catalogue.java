package Interfacepredicate;

import java.util.*;
import java.util.function.Predicate;

public class Catalogue {
	
	List<Articles> lesArticles = new ArrayList<Articles>();
	
	
	public void ajoute(Articles art) {
		lesArticles.add(art);
	}

	// les predicates
	List<Articles> rechercheArticlePrix(Predicate<Articles> f){
		List<Articles> retval = new ArrayList<Articles>();
		
		for(Articles a : lesArticles){
			if(f.test(a)) {
				retval.add(a);
			}
		}
		   return retval;
	}
}
