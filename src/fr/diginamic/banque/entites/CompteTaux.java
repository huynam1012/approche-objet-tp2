package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private float tauxRemuneration;
	
	public CompteTaux(String numeroCompte, double soldeCompte, float taux) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = taux;
	}
	//TP7
	public float getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(float taux) {
		this.tauxRemuneration = taux;
	}

	
	@Override
	public String toString() {
		return super.toString() + "taux est " + this.tauxRemuneration;
	}

	


}
