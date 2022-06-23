package maps;
import java.util.Objects;
public class Ville implements Comparable<Ville> {

	private String nom;

	private int nbHabitants;

	private String departement;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param nbHabitants
	 */
	public Ville(String nom, int nbHabitants, String departement) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.departement = departement;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) obj;
		return Objects.equals(nom, other.nom) && nbHabitants == other.nbHabitants;
	}

	public int compareTo(Ville autre) {
		if (this.nbHabitants > autre.getNbHabitants()) {
			return 1;
		} else if (this.nbHabitants < autre.getNbHabitants()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return nom + " avec " + nbHabitants + " habitants";
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * Setter
	 * 
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return the departement
	 */
	public String getDepartement() {
		return departement;
	}

	/**
	 * Setter
	 * 
	 * @param departement the departement to set
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
	}

}