package fr.univartois.butinfo.fractals.figure.decorators;

import fr.univartois.butinfo.fractals.figure.IFigure;

/**
 * La classe {@link FigureRotationDecorator} correspondant au décorateur
 * permettant d'ajouter une rotation.
 *
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class FigureRotationDecorator implements IFigure {

	/**
	 * Valeur de la rotation.
	 */
	private int x;

	/**
	 * Crée une instance de {@link FigureRotationDecorator}.
	 * 
	 * @param x Valeur de la rotation.
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
