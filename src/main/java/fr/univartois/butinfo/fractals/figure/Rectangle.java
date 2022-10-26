package fr.univartois.butinfo.fractals.figure;

/**
 * La classe du Rectangle.
 *
 * @author Theo journee
 *
 * @version 0.1.0
 */
public class Rectangle implements IFigure {

	/**
	 * position x coté gauche du rectangle.
	 */
	private int x;

	/**
	 * position y coté gauche du rectangle
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
	 * position x corne gauche du rectangle.
	 */
	private int rx;

	/**
	 * position y corne gauche du rectangle.
	 */
	private int ry;

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

	/**
	 * Cosntructeur.
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param rx
	 * @param ry
	 * @param stroke
	 * @param fill
	 * @param strokeWidth
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

	/**
	 * Getter de x postion.
	 * 
	 * @return
	 */
	public int getX() {
		return x;
	}

	/**
	 * Getter Y position.
	 * 
	 * @return
	 */
	public int getY() {
		return y;
	}

	/**
	 * Getter pour la largeur.
	 * 
	 * @return
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Getter de hauteur.
	 * 
	 * @return
	 */
	public int getHeight() {
		return height;
	}

	public int getRx() {
		return rx;
	}

	public int getRy() {
		return ry;
	}

	/**
	 * Getter de couleur largeur.
	 * 
	 * @return
	 */
	public int getStrokeWidth() {
		return strokeWidth;
	}

	/**
	 * Setter de coueleur largeur.
	 * 
	 * @param strokeWidth
	 */
	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

	@Override
	public String ToString() {
		return "< rect x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", rx=" + rx + ", ry=" + ry
				+ ", stroke=" + stroke + ", fill=" + fill + ", strokeWidth=" + strokeWidth + decorated + "/>";
	}
}