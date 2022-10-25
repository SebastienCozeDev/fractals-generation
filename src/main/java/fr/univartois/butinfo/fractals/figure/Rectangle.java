package fr.univartois.butinfo.fractals.figure;


public class Rectangle {
	
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
	
	/**
	 * Constructeur.
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
		super();
		this.setX(x);
		this.setY(y);
		this.width = width;
		this.height = height;
		this.setRx(rx);
		this.setRy(ry);
		this.setStroke(stroke);
		this.fill = fill;
		this.setStrokeWidth(strokeWidth);
	}
	
	/**
	 * Getter de x postion.
	 * @return
	 */
	public int getX() {
		return x;
	}

	/**
	 * Setter.x postion.
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Getter Y position.
	 * @return
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Setter de Y position.
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getRx() {
		return rx;
	}

	public void setRx(int rx) {
		this.rx = rx;
	}

	public int getRy() {
		return ry;
	}

	public void setRy(int ry) {
		this.ry = ry;
	}

	public String getStroke() {
		return stroke;
	}

	public void setStroke(String stroke) {
		this.stroke = stroke;
	}

	public String getFill() {
		return fill;
	}

	public int getStrokeWidth() {
		return strokeWidth;
	}

	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	
	/**
	 * Methode de chaine de caractere svg.
	 */
	public String toString() {
		return "< rect x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", rx=" + rx + ", ry="
				+ ry + ", stroke=" + stroke + ", fill=" + fill + ", strokeWidth=" + strokeWidth + "/>";
	}
}