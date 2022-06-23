package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder();
		long debut = System.currentTimeMillis(); 
		for(int i = 1;i< 100_000;i++) {
			builder.append(i);
		}
		long fin = System.currentTimeMillis();
		System.out.println(builder.toString());
		System.out.println("Temps écoulé en millisecondes : " + (fin - debut));
		System.out.println("------------");
		System.out.println(builder);

	}

}
