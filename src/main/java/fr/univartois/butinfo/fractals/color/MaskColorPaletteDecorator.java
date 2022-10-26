package fr.univartois.butinfo.fractals.color;

import java.awt.Color;

public abstract class MaskColorPaletteDecorator implements IColorPaletteStrategy {

	/**
	 * L'élément décoré.
	 */
	protected IColorPaletteStrategy decorated;

	/**
	 * Crée une instance de {@link MaskColorPaletteDecorator}.
	 * 
	 * @param decorated L'élément qu'il faut décorer.
	 */
	public MaskColorPaletteDecorator(IColorPaletteStrategy decorated) {
		this.decorated = decorated;
	}

	@Override
	public abstract Color getColor(int iterationMax, int iteration);

}
