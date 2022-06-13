package entites;

public class AdressePostale {
	
	int numeroRue;
	String libelleRue;
	int codePostal;
	String ville;

	/** Constructeur avec 4 paramètres
	 */
	AdressePostale(int nvNumeroRue, String nvLibelleRue, int nvCodePostal, String nvVille) {
		
		numeroRue = nvNumeroRue;
		libelleRue = nvLibelleRue;
		codePostal = nvCodePostal;
		ville = nvVille;
		
		
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
