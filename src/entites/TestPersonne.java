package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale adr1 = new AdressePostale(12, "rue Steve Jobs", 34780, "Palo Alto");
				
		AdressePostale adr2 = new AdressePostale(22, "rue des Lilas", 44000, "Nantes");
		
		Personne pers1 = new Personne("MARTIN", "Paul", adr1);
				
		Personne pers2 = new Personne("DUPONT", "Anne", adr2);
		
		pers1.AfficherNomPrenom();
		pers1.ModifiedNom("Tran"); //add new name
		pers1.GetNom();
		pers1.AfficherNomPrenom();
		pers1.GetAdresse();
		pers1.SetAdresse(adr1);
		
		pers2.AfficherNomPrenom();
		pers2.GetAdresse();
		
	}
}
