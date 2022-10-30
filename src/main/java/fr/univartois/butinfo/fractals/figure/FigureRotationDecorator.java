package fr.univartois.butinfo.fractals.figure;

/**
 * Le decorateur pour ajouter une rotation.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class FigureRotationDecorator implements IFigure {

	/**
	 * Valeur de la rotation.
	 */
	private int x;

	/**
	 * Constructeur.
	 * 
	 * @param x
	 */
	public FigureRotationDecorator(int x) {
		super();
		this.x = x;
	}

	@Override
	public String toString() {
		return "transform= rotate(" + x + ")";
	}

}
