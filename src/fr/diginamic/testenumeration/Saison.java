package fr.diginamic.testenumeration;

public enum Saison {

	// Instance de Saison
	PRINTEMPS(1, "Printemps"), ETE(2, "Eté"), AUTOMNE(3, "Automne"), HIVER(4, "Hier");

	private int numero;
	private String nom;

	/**
	 * Constructeurs
	 * 
	 * @param numero
	 * @param nom
	 */
	private Saison(int numero, String nom) {
		this.numero = numero;
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter
	 * 
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * public static Saison getSaisonByNom(String nom) { Saison[] tabSaison =
	 * Saison.values(); for (Saison saison : tabSaison) { if
	 * (saison.getNom().equals(nom)) { return saison; } } return null; }
	 */

	public String toString() {
		return String.format("%d %s", nom, numero);
	}

}
