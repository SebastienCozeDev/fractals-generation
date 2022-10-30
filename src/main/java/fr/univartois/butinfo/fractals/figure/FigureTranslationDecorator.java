package fr.univartois.butinfo.fractals.figure;

/**
 * Le decorateur pour ajouter une translation.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class FigureTranslationDecorator implements IFigure {

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
	 * 
	 * @param x
	 * @param y
	 */
	public FigureTranslationDecorator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "transform= translate(" + x + "," + y + ")";
	}

}
