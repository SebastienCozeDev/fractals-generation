package fr.univartois.butinfo.fractals.figure;

/**
 * Le decorateur pour ajouter une echelle.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class FigureEchelleDecorator implements IFigure {
	/**
	 * position x.
	 */
	private int x;

	/**
	 * position y.
	 */
	private int y;

	
	/**
	 * Constructeur.
	 * @param x
	 * @param y
	 */
	public FigureEchelleDecorator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String ToString() {
		return "transform= scale("+x+","+y+")";
	}

}