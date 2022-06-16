package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation[] operations = new Operation[9];
		
		operations[0] = new Credit("2022-06-12", 200);

		operations[1] = new Credit("2022-05-11", 100);
		operations[2] = new Credit("2022-06-05", 2);
		operations[3] = new Credit("2022-06-10", 42);
		operations[4] = new Credit("2022-01-13", 51);
		
		operations[5] = new Debit("2022-02-01", 100);
		operations[6] = new Debit("2022-03-23", 5);		
		operations[7] = new Debit("2022-05-03", 100);
		operations[8]=  new Debit("2022-05-33", 35);
		
		int total = 0;

		for (int i = 0; i < operations.length; i++) {
			Operation operation = operations[i];
			if (operation.getType() == "Debit") {
				total -= operation.getMontant();
			} else {
				total += operation.getMontant();
			}
			
			System.out.println(operation);
		}
		
		System.out.println("le total d'opérations : " + total);
	}

}
