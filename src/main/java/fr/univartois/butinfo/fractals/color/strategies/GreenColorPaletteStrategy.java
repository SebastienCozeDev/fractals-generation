package fr.univartois.butinfo.fractals.color.strategies;

import java.awt.Color;

import fr.univartois.butinfo.fractals.color.IColorPaletteStrategy;

/**
 * La classe {@link GreenColorPaletteStrategy} correspond à la stratégie
 * (strategy) pour la palette de vert.
 * 
 * @author Théo Journée & Sébastien Coze
 * 
 * @version 0.2.0
 *
 */
public class GreenColorPaletteStrategy implements IColorPaletteStrategy {

	/**
	 * Nombre maximum que peut prendre une teinte de couleur.
	 */
	private final int TINT_MAX = 255;

	@Override
	public Color getColor(int iterationMax, int iteration) {
		if (iterationMax == iteration)
			return new Color(0, 0, 0);
		int tintSeparation = TINT_MAX / iterationMax;
		int greenTint = tintSeparation * iteration;
		return new Color(0, greenTint, 0);
	}

}
