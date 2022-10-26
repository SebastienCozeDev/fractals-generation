package fr.univartois.butinfo.fractals.color;

import java.awt.Color;

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
