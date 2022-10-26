package fr.univartois.butinfo.fractals.color.strategies;

import java.awt.Color;

import fr.univartois.butinfo.fractals.color.IColorPaletteStrategy;

/**
 * La classe {@link GrayColorPaletteStrategy} correspond à la stratégie
 * (strategy) pour la palette de gris.
 * 
 * @author Théo Journée & Sébastien Coze
 * 
 * @version 0.2.0
 *
 */
public class GrayColorPaletteStrategy implements IColorPaletteStrategy {

	/**
	 * Nombre maximum que peut prendre une teinte de couleur.
	 */
	private final int TINT_MAX = 255;

	@Override
	public Color getColor(int iterationMax, int iteration) {
		if (iterationMax == iteration)
			return new Color(TINT_MAX, TINT_MAX, TINT_MAX);
		int tintSeparation = Integer.parseInt(null, TINT_MAX / iterationMax);
		int redTint = tintSeparation * iteration;
		int greenTint = tintSeparation * iteration;
		int blueTint = tintSeparation * iteration;
		return new Color(redTint, greenTint, blueTint);
	}

}
