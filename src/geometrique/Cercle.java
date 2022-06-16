package geometrique;

public class Cercle implements ObjetGeometrique {

	private double rayon;

	public double perimetre() {
		return Math.PI * rayon * 2;
	}

	@Override
	public double surface() {
		return Math.PI * rayon * rayon;

	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	/**
	 @Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", toString()=" + super.toString() + "]";
	}
	*/
	
	

}
