package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestVille {
	
public static void main(String[] args) {
		
		List<Ville> liste =new ArrayList<>();
		
		liste.add(new Ville ("Nice",343_000));
		liste.add(new Ville ("Carcassonne", 47_800 ));
		liste.add(new Ville ("Narbonne", 53_400));
		liste.add(new Ville ("Lyon", 484_000));
		liste.add(new Ville ("Foix", 9_700));
		liste.add(new Ville ("Pau", 77_200));
		liste.add(new Ville ("Marseille", 850_700));
		liste.add(new Ville ("Tarbes", 40_600));
		
		Collections.sort(liste, new ComparatorNom());

		for (Ville v:liste) {       
			System.out.println(v);
		}
		
		System.out.println("--------------------");
		
		Collections.sort(liste, new ComparatorHabitant());

		for (Ville v:liste) {       
			System.out.println(v);
		}
	
	}
}
