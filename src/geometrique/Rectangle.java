package geometrique;

public class Rectangle implements ObjetGeometrique {

	private double longueur;
	private double largueur;

	@Override
	public double perimetre() {
		return (longueur + largueur)*2;
	}

	@Override
	public double surface() {
		return longueur * largueur;
	}

	public double getLongueur() {
		return longueur;
	}
	
	/** Setter
	 * 
	 * @param longueur
	 */

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargueur() {
		return largueur;
	}

	public void setLargueur(double largueur) {
		this.largueur = largueur;
	}
	
	/** Constructeur
	 * 
	 * @param longueur
	 * @param largueur
	 */


	public Rectangle(double longueur, double largueur) {
		super();
		this.longueur = longueur;
		this.largueur = largueur;
	}
	



}
