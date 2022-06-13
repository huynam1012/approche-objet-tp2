package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "12";
		
		int nombre = java.lang.Integer.parseInt(chaine);
		
		System.out.println(nombre);
		
		int a = 5;
		int b = 6;
		
		System.out.println(Integer.compare(a, b));
		
		// affiche e nombre maximum
		System.out.println("le nombre maximum est " + Integer.max(a, b));
		
	}

}
