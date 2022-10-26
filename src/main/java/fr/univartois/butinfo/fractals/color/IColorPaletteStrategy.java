package fr.univartois.butinfo.fractals.color;

import java.awt.Color;

/**
 * L'interface {@link IColorPaletteStrategy} correspond au contrat que va
 * respecter la stratégie (strategy).
 *
 * @author Théo Journée & Sébastien Coze
 *
 * @version 0.2.0
 */
public interface IColorPaletteStrategy {

	/**
	 * Donne la couleur à appliquer sur l'image.
	 * 
	 * @param iterationMax Itération maximum.
	 * @param iteration    Itération effectué.
	 * @return La couleur à appliquer.
	 */
	Color getColor(int iterationMax, int iteration);

}