package fr.univartois.butinfo.fractals.figure;

/**
 * La classe {@link Circle} correspondant à une {@link IFigure} de cercle.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class Circle implements IFigure {

	/**
	 * Rayon du {@link Circle}.
	 */
	private int r;

	/**
	 * Position x corne gauche du {@link Circle}.
	 */
	private int cx;

	/**
	 * Position y corne gauche du {@link Circle}.
	 */
	private int cy;

	/**
	 * Couleur du {@link Circle}.
	 */
	private String stroke;

	/**
	 * Fond du {@link Circle}.
	 */
	private String fill;

	/**
	 * Largeur du {@link Circle}.
	 */
	private int strokeWidth;

	/**
	 * {@link IFigure} décoré.
	 */
	private IFigure decorated;

	@Override
	public String toString() {
		return "< circle  cx=" + cx + ", cy=" + cy + ",r=" + r + ", stroke=" + stroke + ", fill=" + fill
				+ ", strokeWidth=" + strokeWidth + decorated + "/>";
	}
}
