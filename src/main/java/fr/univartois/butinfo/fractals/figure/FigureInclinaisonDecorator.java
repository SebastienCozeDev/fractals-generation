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
	 * Angle x qui détermine dans quelle mesure l'élément sera incliné.
	 */
	private int x;
	
	@Override
	public String ToString() {
		return "transform= skewX("+x+")";
	}

}
