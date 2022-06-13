package entites2;

import entites.AdressePostale;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adresse;
	
	/** Constructeur avec 4 paramètres
	 
	public Personne(String nvNom, String nvPrenom, AdressePostale nvAdresse) { 
		// put public before Personne so that this class is accessible by any other class.
		nom = nvNom;
		prenom = nvPrenom;
		adresse = nvAdresse;*/
	
	//TP2 avec "this"
	//Ajoutez un constructeur à la classe Personne avec les paramètres permettant de valoriser nom et prénom.
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	//Ajoutez un second constructeur à la classe Personne avec les 3 paramètres permettant de valoriser 
	//les attributs nom, prenom et adresse.
	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	//Ajoutez une méthode qui permet d’afficher le nom et le prénom avec le nom de famille en majuscules
	public void AfficherNomPrenom() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);
	}
	
	//ajoutez une méthode qui prend un argument en paramètre et permet de modifier la variable d’instance nom de Personne
	public void ModifiedNom(String nom) { 
		this.nom = nom; 
	}
	
	//ajoutez une méthode qui prend un argument en paramètre et permet de modifier la variable d’instance prenom de Personne
	public void ModifiedPrenom(String prenom) { 
		this.prenom = prenom; 
	}
	
	//ajoutez une méthode qui prend un argument en paramètre et permet de modifier la variable d’instance l'adresse.
	public void SetAdresse(AdressePostale addr) {
		this.adresse = addr;
	}
	
	//ajoutez une méthode qui retourne le nom
	public String GetNom() {
		return this.nom;
	}
	
	//ajoutez une méthode qui retourne le prénom
	public String GetPreNom() {
		return this.prenom;
	}
		
	//ajoutez une méthode qui retourne l'adresse
	public AdressePostale GetAdresse() {
		return this.adresse;
	}
	
}
