package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;//TP7

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte cpt = new Compte("A00248hjsf", 1_000_000);
		System.out.println(cpt);
		
		System.out.println("-------------");
		//TP7
		CompteTaux compteTauxTest = new CompteTaux("A00248hjsf", 1_500_000, 1.5f);
		
		Compte[] banque = {cpt, compteTauxTest};
		
		for (int i = 0; i < banque.length; i++) {
			System.out.println(banque[i]);
		}
	}

}
