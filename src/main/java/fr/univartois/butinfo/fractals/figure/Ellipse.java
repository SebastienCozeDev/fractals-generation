package fr.univartois.butinfo.fractals.figure;

/**
 * La classe {@link Ellipse} correspond à une {@link IFigure} d'ellipse.
 *
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class Ellipse implements IFigure {

	/**
	 * Rayon x.
	 */
	private int rx;

	/**
	 * Rayon y.
	 */
	private int ry;

	/**
	 * Position x corne gauche du rectangle.
	 */
	private int cx;

	/**
	 * Position y corne gauche du rectangle.
	 */
	private int cy;

	/**
	 * Couleur du rectangle.
	 */
	private String stroke;

	/**
	 * Le fond.
	 */
	private String fill;

	/**
	 * Largeur.
	 */
	private int strokeWidth;

	/**
	 * {@link IFigure} décoré.
	 */
	private IFigure decorated;

	/**
	 * Crée une instance de la classe {@link Ellipse}.
	 * 
	 * @param cx          Position x corne gauche du rectangle.
	 * 
	 * @param cy          Position y corne gauche du rectangle.
	 * 
	 * @param stroke      Couleur du rectangle.
	 * 
	 * @param fill        Le fond.
	 * 
	 * @param strokeWidth Largeur.
	 */
	public Ellipse(int cx, int cy, String stroke, String fill, int strokeWidth) {
		this.cx = cx;
		this.cy = cy;
		this.stroke = stroke;
		this.fill = fill;
		this.strokeWidth = strokeWidth;
	}

	@Override
	public String toString() {
		return "< ellipse  cx=" + cx + ", cy=" + cy + ",rx=" + rx + ", ry=" + ry + ", stroke=" + stroke + ", fill="
				+ fill + ", strokeWidth=" + strokeWidth + decorated + "/>";
	}
}
