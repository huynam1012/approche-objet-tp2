package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale adr1 = new AdressePostale(12, "rue Steve Jobs", 34780, "Palo Alto");
				
		AdressePostale adr2 = new AdressePostale(22, "rue des Lilas", 44000, "Nantes");
		
		Personne pers1 = new Personne("MARTIN", "Paul", adr1);
				
		Personne pers2 = new Personne("DUPONT", "Anne", adr2);

	}

}
