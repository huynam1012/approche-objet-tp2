package fr.diginamic.banque.entites;

public class Compte {
	
	private String numeroCompte;
	private double soldeCompte;
	
	
	public Compte(String numeroCompte, double soldeCompte) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	@Override
	public String toString() {
		return "Votre compte " + numeroCompte + " restre " + soldeCompte + "�";
	}
	
	
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
}
