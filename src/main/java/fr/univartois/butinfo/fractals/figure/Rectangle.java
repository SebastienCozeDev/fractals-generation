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
	 * Constructeur
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param rx
	 * @param ry
	 */
	public Rectangle(int x, int y, int width, int height, int rx, int ry) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.rx = rx;
		this.ry = ry;
	}
}