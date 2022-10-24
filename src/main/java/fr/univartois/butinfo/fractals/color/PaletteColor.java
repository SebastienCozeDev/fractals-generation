package fr.univartois.butinfo.fractals.color;

import java.awt.Color;


/**
 * la classe qui donne la methode qu'on va utilisé pour notre palette de couleur.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class PaletteColor implements IPaletteColor {
	/**
	 * Interfaces Palette de couleur.
	 */
	IPaletteColor paletteColor;

	/**
	 * Setter pour le palette de couleur.
	 * @param paletteColor
	 */
	public void setPaletteColor(IPaletteColor paletteColor) {
		this.paletteColor = paletteColor;
	}
	
	@Override
	public void paletteColor(Color color) {
		paletteColor.paletteColor(color);;
 }
}
