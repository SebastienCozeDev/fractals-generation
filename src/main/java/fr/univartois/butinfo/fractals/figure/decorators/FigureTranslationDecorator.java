package fr.univartois.butinfo.fractals.figure.decorators;

import fr.univartois.butinfo.fractals.figure.IFigure;

/**
 * La classe {@link FigureTranslationDecorator} correspond au décorateur
 * permettant d'ajouter une translation.
 *
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class FigureTranslationDecorator implements IFigure {

	/**
	 * Position x.
	 */
	private int x;

	/**
	 * Position y.
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
