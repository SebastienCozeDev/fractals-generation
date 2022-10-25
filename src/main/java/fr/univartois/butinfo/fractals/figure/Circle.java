package fr.univartois.butinfo.fractals.figure;

public class Circle {
	
	/**
	 * rayon du cercle.
	 */
	private int r;
	/**
	 * position x corne gauche du rectangle.
	 */
	private int cx;

	/**
	 * position y corne gauche du rectangle.
	 */
	private int cy;

	/**
	 * Couleur du rectangle.
	 */
	private String stroke;

	/**
	 * le fond.
	 */
	private String fill;

	/**
	 * largeur de couleur.
	 */
	private int strokeWidth;
	
	private IFigure decorated;

	public Circle(int r, int cx, int cy, String stroke, String fill, int strokeWidth) {
		this.r=r;
		this.cx = cx;
		this.cy = cy;
		this.stroke = stroke;
		this.fill = fill;
		this.strokeWidth = strokeWidth;
	}
	/**
	 * Methode de chaine de caractere svg.
	 */
	public String toString() {
		return "<svg width=\"200\" height=\"250\" version=\"1.1\"> < circle  cx=" + cx + ", cy=" + cy+",r=" + r
				+ ", stroke=" + stroke + ", fill=" + fill + ", strokeWidth=" + strokeWidth + decorated+"/> </svg>";
	}
}
