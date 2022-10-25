package fr.univartois.butinfo.fractals.figure;

public class Polyligne {

	/**
	 * position.
	 */
	private int x;

	/**
	 * Couleur du polyligne.
	 */
	private String stroke;

	/**
	 * largeur.
	 */
	private int strokeWidth;
	
	private IFigure decorated;
	
	public Polyligne(String stroke) {
		this.stroke = stroke;
	}

	/**
	 * Methode de chaine de caractere svg.
	 */
	public String toString() {
		return "<svg width=\"200\" height=\"250\" version=\"1.1\"> < points=\"50 160 55 180 70 180 60 190 65 205 50 195 35 205 40 190 30 180 45 180\""
				+ ", stroke=" + stroke + ", strokeWidth=" + strokeWidth +  decorated + "/> </svg>";
	}
}
