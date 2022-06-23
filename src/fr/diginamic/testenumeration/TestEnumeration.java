package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		Saison[] tabSaison = Saison.values();
		
		System.out.println("Liste des saisons : ");
		for (Saison saison : tabSaison) {
			System.out.println(saison.getNom() + " / " + saison.getNumero());
		}
		
		System.out.println("----------------------");
		
		String nom = "ETE";
		Saison saisonEte = Saison.valueOf(nom);
		System.out.println("String : " + nom + " / Saison :  " + saisonEte.getNom() + " / " + saisonEte.getNumero());
		
		System.out.println("----------------------");
		
		String libelle = "Hiver";
		Saison saisonHiver = Saison.valueOf(libelle);
		System.out.println("Libellé : " + libelle + " / Saison :  " + saisonHiver.getNom() + " / " + saisonHiver.getNumero());
		
		

	}

}
