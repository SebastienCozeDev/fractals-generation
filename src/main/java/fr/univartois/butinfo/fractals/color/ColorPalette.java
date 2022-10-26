package fr.univartois.butinfo.fractals.color;

import java.awt.Color;

/**
 * La classe {@link ColorPalette} donne la methode qu'on va utilisé pour notre
 * palette de couleur.
 *
 * @author Théo Journée & Sébastien Coze
 *
 * @version 0.2.0
 */
public class ColorPalette {

	/**
	 * Nombre d'itération maximale.
	 */
	private final int ITERATION_NUMBER_MAX;

	private IColorPaletteStrategy colorPaletteStrategy;

	/**
	 * Crée une instance de {@link ColorPalette}.
	 * 
	 * @param iterationNumber Nombre d'itération maximale.
	 */
	public ColorPalette(int iterationNumber) {
		this.ITERATION_NUMBER_MAX = iterationNumber;
	}

	/**
	 * Donne la couleur pour un nombre d'itération donné.
	 * 
	 * @param iteration Nombre d'itération effectué.
	 * @return La couleur a appliqué.
	 */
	public Color getColor(int iteration) {
		colorPaletteStrategy.getColor(ITERATION_NUMBER_MAX, iteration);
		return null;
	}

}
