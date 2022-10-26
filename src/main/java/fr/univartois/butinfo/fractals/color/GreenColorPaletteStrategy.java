package fr.univartois.butinfo.fractals.color;

import java.awt.Color;

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
			return new Color(TINT_MAX, TINT_MAX, TINT_MAX);
		int tintSeparation = Integer.parseInt(null, TINT_MAX / iterationMax);
		int greenTint = tintSeparation * iteration;
		return new Color(TINT_MAX, greenTint, TINT_MAX);
	}

}
