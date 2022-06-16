package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> liste = new ArrayList<Integer>();

		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);

		System.out.println("Elements de listes : " + liste);
		System.out.println("Taille de listes : " + liste.size());
		System.out.println("Le plus grand élément  : " + TestListeInt.max(liste));
		System.out.println(
				"Tous les éléments négatifs deviennent positifs : " + TestListeInt.inverseNegatives(liste).toString());

		if (liste.size() >= 1) {
			Integer min = Collections.min(liste);
			Integer max = Collections.max(liste);
			liste.remove(min);
		}
		System.out.println("Le résultat sans min valeur : " + liste);

	}

	private static Integer max(List<Integer> liste) {
		// TODO Auto-generated method stub
		return Collections.max(liste);
	}

	public static List<Integer> inverseNegatives(List<Integer> liste) {
		for (int i = 0; i < liste.size(); i++) {
			int current = liste.get(i);
			if (current < 0) {
				liste.set(i, Math.abs(current));
			}
		}
		return liste;
	}

}
