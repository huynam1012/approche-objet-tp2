package geometrique;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjetGeometrique[] objetsGeometriques = new ObjetGeometrique[2];

		objetsGeometriques[0] = new Cercle(5.3);
		objetsGeometriques[1] = new Rectangle(8.2, 9.3);

		for (int i = 0; i < objetsGeometriques.length; i++) {
			ObjetGeometrique objetGeometriqueActuel = objetsGeometriques[i];

			System.out.println("perimetre = " + objetGeometriqueActuel.perimetre() + "; surface = "
					+ objetGeometriqueActuel.surface());
		}

	}

}
