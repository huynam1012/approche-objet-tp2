package sets;

public class Pays {
	
	public String nom;
	public int nbHab;
	public int pibHab;
	public Pays(String nom, int nbHab, int pibHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}
	

	public int compareTo(Pays another) {
		return nom.compareTo(another.nom);
	}
	
	
}
