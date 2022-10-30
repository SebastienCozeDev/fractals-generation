package fr.univartois.butinfo.fractals.figure;

/**
 * La classe {@link Line} correspond à une {@link IFigure} de ligne.
 *
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class Line implements IFigure {

	/**
	 * Position x du point 1.
	 */
	private int x1;

	/**
	 * Position y du point 1.
	 */
	private int y1;

	/**
	 * Position x du point 2.
	 */
	private int x2;

	/**
	 * Position y du point 2.
	 */
	private int y2;

	/**
	 * Couleur du rectangle.
	 */
	private String stroke;

	/**
	 * Largeur.
	 */
	private int strokeWidth;

	/**
	 * Instance de {@link IFigure} décorée.
	 */
	private IFigure decorated;

	/**
	 * Crée une instance de {@link Line}.
	 * 
	 * @param x1     Position x du point 1.
	 * 
	 * @param y1     Position y du point 1.
	 * 
	 * @param x2     Position x du point 2.
	 * 
	 * @param y2     Position y du point 2.
	 * 
	 * @param stroke Couleur du rectangle.
	 * 
	 * @param width  Largeur.
	 */
	public Line(int x1, int y1, int x2, int y2, String stroke) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.stroke = stroke;
	}

	@Override
	public String toString() {
		return "< line  x1=" + x1 + ", y1=" + y1 + ",x2=" + x2 + ", y2=" + y2 + ", stroke=" + stroke + ", strokeWidth="
				+ strokeWidth + decorated + "/>";
	}
}
