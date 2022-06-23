package fr.diginamic.testenumeration;

public class Ville {
	private String nom;
	private int nombreHab;
	private Continent continent;
	
	public Ville(String nom, int nombreHab, Continent continent) {
		//super();
		this.nom = nom;
		this.nombreHab = nombreHab;
		this.continent = continent;
	}
	
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/** Getter
	 * @return the nombreHab
	 */
	public int getNombreHab() {
		return nombreHab;
	}



	/** Setter
	 * @param nombreHab the nombreHab to set
	 */
	public void setNombreHab(int nombreHab) {
		this.nombreHab = nombreHab;
	}



	/** Getter
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}



	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nombreHab=" + nombreHab + ", continent=" + continent + "]";
	}
	
	

}