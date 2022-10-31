package fr.univartois.butinfo.fractals.figure;

/**
 * La classe {@link Rectangle} correspond à un {@link IFigure} de rectangle.
 *
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class Rectangle implements IFigure {

	/**
	 * Position x coté gauche du rectangle.
	 */
	private int x;

	/**
	 * Position y coté gauche du rectangle.
	 */
	private int y;

	/**
	 * Largeur du rectangle.
	 */
	private int width;

	/**
	 * Hauteur du rectangle.
	 */
	private int height;

	/**
	 * Position x corne gauche du rectangle.
	 */
	private int rx;

	/**
	 * Position y corne gauche du rectangle.
	 */
	private int ry;

	/**
	 * Couleur du rectangle.
	 */
	private String stroke;

	/**
	 * Le fond.
	 */
	private String fill;

	/**
	 * Largeur de couleur.
	 */
	private int strokeWidth;
	
	/**
	 * {@link IFigure} décorée.
	 */
	private IFigure decorated;

	/**
	 * Crée une isntance de {@link Rectangle}.
	 * 
	 * @param x           Position x coté gauche du rectangle.
	 * 
	 * @param y           Position y coté gauche du rectangle.
	 * 
	 * @param width       Largeur du rectangle.
	 * 
	 * @param height      Hauteur du rectangle.
	 * 
	 * @param rx          Position x corne gauche du rectangle.
	 * 
	 * @param ry          Position y corne gauche du rectangle.
	 * 
	 * @param stroke      Couleur du rectangle.
	 * 
	 * @param fill        Le fond.
	 * 
	 * @param strokeWidth Largeur de couleur.
	 */
	public Rectangle(int x, int y, int width, int height, int rx, int ry, String stroke, String fill, int strokeWidth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.rx = rx;
		this.ry = ry;
		this.stroke = stroke;
		this.fill = fill;
		this.strokeWidth = strokeWidth;
	}

	@Override
	public String toString() {
		return "< rect x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", rx=" + rx + ", ry=" + ry
				+ ", stroke=" + stroke + ", fill=" + fill + ", strokeWidth=" + strokeWidth + decorated + "/>";
	}
}