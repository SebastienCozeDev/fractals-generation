package fr.univartois.butinfo.fractals.color;

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
	protected MaskColorPaletteDecorator(IColorPaletteStrategy decorated) {
		this.decorated = decorated;
	}

}
