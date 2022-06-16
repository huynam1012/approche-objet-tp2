package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		List<String> villes = new ArrayList<String>();

		villes.add("Nice");
		villes.add("Carcasonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");

		System.out.println("Le plus grand élément  : " + TestListeString.max(villes));

		System.out.println("Ville au nom le plus long : " + TestListeString.maxCharStr(villes));

		System.out.println("Tous majuscules : " + TestListeString.majuscules(villes).toString());

		System.out.println(
				"Les villes sans le nom commence par la lettre N: " + TestListeString.removeNCities(villes).toString());
	}

	private static String max(List<String> villes) {
		// TODO Auto-generated method stub
		return Collections.max(villes);
	}

	public static String maxCharStr(List<String> villes) {
		String maxStr = "";
		for (String str : villes) {
			if (str.length() > maxStr.length()) {
				maxStr = str;
			}
		}
		return maxStr;
	}

	public static List<String> majuscules(List<String> villes) {
		List<String> listCopy = new ArrayList<>(villes);

		for (int i = 0; i < listCopy.size(); i++) {
			listCopy.set(i, listCopy.get(i).toUpperCase());
		}
		return listCopy;
	}

	public static List<String> removeNCities(List<String> list) {
		List<String> listCopy2 = new ArrayList<>(list);

		Iterator<String> iterator = listCopy2.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().charAt(0) == 'N') {
				iterator.remove();
			}
		}

		return listCopy2;

	}

}
