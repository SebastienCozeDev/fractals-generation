package fr.univartois.butinfo.fractals.color.decorators;

import java.awt.Color;

import fr.univartois.butinfo.fractals.color.IColorPaletteStrategy;
import fr.univartois.butinfo.fractals.color.MaskColorPaletteDecorator;

/**
 * La classe {@link OnlyGreenDecorator} correspond au masque qui ne laisse passer
 * que la couleur verte.
 * 
 * @author Sébastien Coze
 * 
 * @version 0.1.0
 *
 */
public class OnlyGreenDecorator extends MaskColorPaletteDecorator {

	/**
	 * Crée une instance de {@link OnlyGreenDecorator}.
	 * 
	 * @param decorated L'objet décoré.
	 */
	public OnlyGreenDecorator(IColorPaletteStrategy decorated) {
		super(decorated);
	}

	@Override
	public Color getColor(int iterationMax, int iteration) {
		Color c = super.decorated.getColor(iterationMax, iteration);
		return new Color(0, c.getGreen(), 0);
	}

}
