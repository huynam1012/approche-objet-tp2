package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, float montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "Debit";
	}
	

}
