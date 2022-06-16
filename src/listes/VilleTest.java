package listes;

import java.util.ArrayList;
import java.util.List;

public class VilleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ville> villes = new ArrayList<Ville>();

        villes.add(new Ville("Nice", 343_000));
        villes.add(new Ville("Carcassonne", 47_800));
        villes.add(new Ville("Narbonne", 53_400));
        villes.add(new Ville("Lyon", 484_000));
        villes.add(new Ville("Foix", 9_700));
        villes.add(new Ville("Paux", 77_200));
        villes.add(new Ville("Marseille", 850_700));
        villes.add(new Ville("Tarbes", 40_600));

        System.out.println("Max nb habitants : " + mostPopulated(villes).getNom());

        villes = VilleTest.removeLeastPopulated(villes);
        villes = VilleTest.setCapBigCities(villes);

        System.out.println(villes.toString());
	}
	
    public static Ville mostPopulated(List<Ville> list) {
        Ville max = list.get(0);
        for (Ville ville : list) {
            if (ville.getNbHabitants() > max.getNbHabitants()) {
                max = ville;
            }
        }
        return max;
    }

    public static List<Ville> removeLeastPopulated(List<Ville> list) {
        List<Ville> listeCopy = new ArrayList<>(list);
        Ville min = listeCopy.get(0);
        for (Ville ville : listeCopy) {
            if (ville.getNbHabitants() < min.getNbHabitants()) {
                min = ville;
            }
        }
        listeCopy.remove(min);
        return listeCopy;
    }
    
    public static List<Ville> setCapBigCities(List<Ville> list) {
        List<Ville> listeCopy = new ArrayList<>(list);
        for (int i = 0; i < listeCopy.size(); i++) {
            Ville current = listeCopy.get(i);
            if (current.getNbHabitants() > 100_000) {
                current.setNom(current.getNom().toUpperCase());
            }
        }
        return listeCopy;
    }

}
