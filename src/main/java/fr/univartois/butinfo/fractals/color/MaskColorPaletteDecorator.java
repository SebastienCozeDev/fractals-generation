package fr.univartois.butinfo.fractals.color;

/**
 * La classe {@link MaskColorPaletteDecorator} est le décorateur de
 * {@link IColorPaletteStrategy} permettant d'appliquer un masque sur une
 * palette de couleurs.
 * 
 * @author Sébastien Coze
 * 
 * @version 0.1.0
 */
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
