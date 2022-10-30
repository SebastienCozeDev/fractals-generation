package fr.univartois.butinfo.fractals.figure.decorators;

import fr.univartois.butinfo.fractals.figure.IFigure;

/**
 * La classe {@link FigureInclinaisonDecorator} correspond au décorateur
 * permettant ajouter une inclinaison.
 *
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class FigureInclinaisonDecorator implements IFigure {

	/**
	 * Angle x qui détermine dans quelle mesure l'élément sera incliné.
	 */
	private int x;

	@Override
	public String toString() {
		return "transform= skewX(" + x + ")";
	}

}
