package fr.univartois.butinfo.fractals.figure;

public class line {


	/**
	 * position x du point 1.
	 */
	private int x1;

	/**
	 * position y du point 1.
	 */
	private int y1;

	/**
	 * position x du point 2.
	 */
	private int x2;

	/**
	 * position y du point 2.
	 */
	private int y2;

	/**
	 * Couleur du rectangle.
	 */
	private String stroke;

	/**
	 * largeur.
	 */
	private int strokeWidth;
	
	private IFigure decorated;
	
	/**
	 * Constructeur.
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param cy
	 * @param stroke
	 * @param width
	 */
	public line(int x1, int y1, int x2, int y2, String stroke) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.stroke = stroke;
	}

	/**
	 * Methode de chaine de caractere svg.
	 */
	public String toString() {
		return "<svg width=\"200\" height=\"250\" version=\"1.1\"> < line  x1=" + x1 + ", y1=" + y1 + ",x2=" + x2 + ", y2=" + y2 
				+ ", stroke=" + stroke + ", strokeWidth=" + strokeWidth +  decorated + "/> </svg>";
	}
}

