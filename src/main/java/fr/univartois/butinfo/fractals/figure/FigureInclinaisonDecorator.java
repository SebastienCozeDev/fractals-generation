package fr.univartois.butinfo.fractals.figure;

/**
 * Le decorateur pour ajouter une inclinaison.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class FigureInclinaisonDecorator implements IFigure {

	/**
	 * Angle x qui d�termine dans quelle mesure l'�l�ment sera inclin�.
	 */
	private int x;

	@Override
	public String toString() {
		return "transform= skewX(" + x + ")";
	}

}
