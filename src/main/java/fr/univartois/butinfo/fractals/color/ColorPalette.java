package fr.univartois.butinfo.fractals.color;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import fr.univartois.butinfo.fractals.image.Pixel;


/**
 * la classe qui donne la methode qu'on va utilisé pour notre palette de couleur.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class ColorPalette implements IColorPalette {
	/**
	 * Instance de la classe de pixel.
	 */
	private Pixel pixel;
	/**
	 * Instance de java.awt.color.
	 */
	private Color color;
	
	private IColorPalette decorated;
	/**
	 * Interfaces Palette de couleur.
	 */
	IColorPalette colorpalette;
	
	/**
	 * Constructeur.
	 * @param pixel
	 */
	public ColorPalette(Pixel pixel){
		this.pixel=pixel;
	}


	public void setColorpalette(IColorPalette colorpalette) {
		this.colorpalette = colorpalette;
	}

	@Override
	public void paletteColor(Color color) {
		
	}
	/**
	 * Methode qui retourne la couleur.
	 * @return
	 */
	public Color getColor() {
		return color;
	}
	 /**
     * Modifie la couleur de ce pixel.
     *
     * @param color 
     */
    public void setColor(Color color) {
        pixel.setColor(color);;
    }
}
