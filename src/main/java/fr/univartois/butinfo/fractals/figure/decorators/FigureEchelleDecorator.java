package fr.univartois.butinfo.fractals.figure.decorators;

import fr.univartois.butinfo.fractals.figure.IFigure;

/**
 * La classe {@link FigureEchelleDecorator} correspond au décorateur permettant
 * d'ajouter une échelle.
 *
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class FigureEchelleDecorator implements IFigure {

	/**
	 * Position x.
	 */
	private int x;

	/**
	 * Position y.
	 */
	private int y;

	/**
	 * Crée une instance de {@link FigureEchelleDecorator}.
	 * 
	 * @param x Position x.
	 * @param y Position y.
	 */
	public FigureEchelleDecorator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "transform= scale(" + x + "," + y + ")";
	}

}
