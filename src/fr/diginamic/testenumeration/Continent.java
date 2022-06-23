package fr.diginamic.testenumeration;

public enum Continent {

	EUROPE("Europe"), AFRIQUE("Afrique"), ASIE("Asie"), AMERIQUE("Amérique"), OCEANIE("Océanie");

	private String nom;

	/**
	 * Constructeurs
	 * 
	 * @param nom
	 */
	private Continent(String nom) {
		this.nom = nom;
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

}
