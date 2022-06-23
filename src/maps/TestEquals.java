package maps;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville ville1 = new Ville("Nice", 343000, "Alpes-Maritimes");
		Ville ville2 = new Ville("Beziers", 7000, "Herault");
		Ville ville3 = new Ville("Paris", 500000, "Paris");
		Ville ville4 = new Ville("Paris", 500000, "Paris");

		System.out.println("Test equals1 : " + ville1.equals(ville3) + "\n");
		System.out.println("Test equals2 : " + ville1.equals(ville2) + "\n");
		System.out.println("Test equals2 : " + ville3.equals(ville4) + "\n");
		
		System.out.println("Test == 1 : " + (ville1 == ville2) + "\n");
		System.out.println("Test == 2 : " + (ville1 == ville3) + "\n");
		System.out.println("Test == 3 : " + (ville4 == ville3) + "\n");
	}

}
