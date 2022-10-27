package fr.univartois.butinfo.fractals.figure;

/**
 * La figure Circle.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class Circle implements IFigure {
	
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
	

	public Circle(int r2, int cx2, int cy2, Object stroke2, Object fill2, int strokeWidth2) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String ToString() {
		return "< circle  cx=" + cx + ", cy=" + cy+",r=" + r
				+ ", stroke=" + stroke + ", fill=" + fill + ", strokeWidth=" + strokeWidth + decorated+"/>";
	}
}
