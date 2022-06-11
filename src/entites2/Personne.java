package entites2;

import entites.AdressePostale;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adresse;
	
	/** Constructeur avec 4 paramètres
	 */
	public Personne(String nvNom, String nvPrenom, AdressePostale nvAdresse) { 
		// put public before Personne so that this class is accessible by any other class.
		nom = nvNom;
		prenom = nvPrenom;
		adresse = nvAdresse;
	}
		
}
