package fichier;

public class Ville {

	private String nom;
	private String codeDepartement;
	private String nomRegion;
	private int popTotale;
	/**
	 * @param nom
	 * @param codeDepartement
	 * @param nomRegion
	 * @param popTotale
	 */
	public Ville(String nom, String codeDepartement, String nomRegion, int popTotale) {
		super();
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.popTotale = popTotale;
	}
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", codeDepartement=" + codeDepartement + ", nomRegion=" + nomRegion
				+ ", popTotale=" + popTotale + "]";
	}

	/**
	 * @return the relevant data in the writing format
	 */
	public String getData() {
		return String.format("%s;%s;%s;%d", nom, codeDepartement, nomRegion, popTotale);
	}
	
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}
	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}
	/**
	 * @return the popTotale
	 */
	public int getPopTotale() {
		return popTotale;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}
	/**
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	/**
	 * @param popTotale the popTotale to set
	 */
	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}

}
