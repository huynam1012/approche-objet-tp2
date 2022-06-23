package maps;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		HashMap<String, Pays> mapPays = new HashMap<>();
		mapPays.put("France", new Pays("France", 65_000_000, "Europe"));
		mapPays.put("Allemagne", new Pays("Allemagne", 80_000_0000, "Europe"));
		mapPays.put("Belgique", new Pays("Belgique", 10_000_000, "Europe"));
		mapPays.put("Russie", new Pays("Russie", 150_000_000, "Asie"));
		mapPays.put("Chine", new Pays("Chine", 1_300_000_000, "Asie"));
		mapPays.put("Indonésie", new Pays("Indonésie", 220_000_000, "Océanie"));
		mapPays.put("Australie", new Pays("Australie", 20_000_000, "Océanie"));

		// HashMap pour réaliser un comptage du nombre de pays par continent
		HashMap<String, Integer> comptage = new HashMap<>();

		Iterator<Pays> iterPays = mapPays.values().iterator();
		while (iterPays.hasNext()) {
			Pays pays = iterPays.next();

			String continent = pays.getContinent();
			Integer compteur = comptage.get(continent);

			if (compteur == null) {
				comptage.put(continent, 1);
			} else {
				compteur++;
				comptage.put(continent, compteur);
			}
		}

		System.out.println("Nombre de pays par continent : " + comptage);

		System.out.println("----------------------------------------------------");

		ArrayList<Pays> paysArrayList = new ArrayList<>();
		paysArrayList.add(new Pays("France", 65, "Europe"));
		paysArrayList.add(new Pays("Allemagne", 80, "Europe"));
		paysArrayList.add(new Pays("Belgique", 10, "Europe"));
		paysArrayList.add(new Pays("Russie", 150, "Asie"));
		paysArrayList.add(new Pays("Chine", 1400000000, "Asie"));
		paysArrayList.add(new Pays("Indonesie", 220, "Oceanie"));
		paysArrayList.add(new Pays("Australie", 20, "Oceanie"));

		HashMap<String, Integer> paysParContinentMap = new HashMap<>();
		for (Pays pays : paysArrayList) {
			if (paysParContinentMap.containsKey(pays.getContinent()))
				paysParContinentMap.put(pays.getContinent(), paysParContinentMap.get(pays.getContinent()) + 1);
			else {
				paysParContinentMap.put(pays.getContinent(), 1);
			}
		}

		for (Map.Entry<String, Integer> stringIntegerEntry : paysParContinentMap.entrySet()) {
			System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
		}

	}

}