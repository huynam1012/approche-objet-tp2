package fr.diginamic.banque.entites;

public abstract class Operation {
	
	String date;
	float montant;
	
	public Operation(String date, float montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	@Override
	//show the results
	public String toString() {
		return "date " + this.date + " montant " + this.montant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
