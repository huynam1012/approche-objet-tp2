package maps;

import java.util.HashMap;

import java.util.Iterator;

public class MapVilles {

	public static void main(String[] args) {
		
		HashMap<String, Ville> mapVilles = new HashMap<>();
		mapVilles.put("Lille", new Ville("Lille", 232_741, "59"));
		mapVilles.put("Lyon", new Ville("Lyon", 484_000, "69"));
		mapVilles.put("Bordeaux", new Ville("Bordeaux", 249_712 , "33"));
		
		Iterator<String> keysIte = mapVilles.keySet().iterator();
		while(keysIte.hasNext()) {
			String key = keysIte.next();
			System.out.println(key);
		}
		
		Iterator<Ville> inteVille = mapVilles.values().iterator();
		while(inteVille.hasNext()) {
			Ville v = inteVille.next();
			System.out.println(v);
		}
		
		System.out.println("-------------------------------------");
		
		Iterator<Ville> iterVilles = mapVilles.values().iterator();
		
		int nbHabMin = Integer.MAX_VALUE;
		Ville selected = null;
		while (iterVilles.hasNext()) {
			Ville ville = iterVilles.next();
			if (ville.getNbHabitants() < nbHabMin) {
				nbHabMin = ville.getNbHabitants();
				selected = ville;
			}
		}
		System.out.println("Ville qui a le moins d'habitants est "+selected);
		
		// Suppression à partir de la clé de stockage
		mapVilles.remove(selected.getNom());
		
		// Affichage des villes restantes
		for (Ville ville : mapVilles.values()) {
			System.out.println(ville);
		}
		
		System.out.println("-------------------------------------");
		
		System.out.print("HashMap mapVilles : [".toUpperCase());
		Iterator<String> iterNomVilles = mapVilles.keySet().iterator();
		while (iterNomVilles.hasNext()) {
			String v = iterNomVilles.next();
			if (iterNomVilles.hasNext()) {
				System.out.print(mapVilles.get(v) + ", ");
			} else {
				System.out.println(mapVilles.get(v) + "]");
			}
		}

	}

}