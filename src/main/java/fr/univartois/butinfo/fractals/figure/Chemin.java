package fr.univartois.butinfo.fractals.figure;

public class Chemin {


	/**
	 * position.
	 */
	private int x;

	/**
	 * Couleur du chemin.
	 */
	private String stroke;

	/**
	 * largeur.
	 */
	private int strokeWidth;
	
	private IFigure decorated;
	
	/**
	 * Methode de chaine de caractere svg.
	 */
	public String toString() {
		return "<svg width=\"200\" height=\"250\" version=\"1.1\"> < path d=\"M20,230 Q40,205 50,230 T90,230\""
				+ ", stroke=" + stroke + ", strokeWidth=" + strokeWidth +  decorated + "/> </svg>";
	}
}

