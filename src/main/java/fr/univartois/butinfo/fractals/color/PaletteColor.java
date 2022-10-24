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
public class PaletteColor implements IPaletteColor {
	/**
	 * Liste des palette de couleur.
	 */
	private List<IPaletteColor> palettecolor = new ArrayList<>();
	/**
	 * Instance de la classe de pixel.
	 */
	private Pixel pixel;
	/**
	 * Instance de java.awt.color.
	 */
	private Color color;
	/**
	 * Interfaces Palette de couleur.
	 */
	IPaletteColor paletteColor;
	
	/**
	 * Constructeur.
	 * @param pixel
	 */
	public PaletteColor(Pixel pixel){
		this.pixel=pixel;
	}

	/**
	 * Setter pour le palette de couleur.
	 * @param paletteColor
	 */
	public void setPaletteColor(IPaletteColor paletteColor) {
		this.paletteColor = paletteColor;
	}
	
	@Override
	public void paletteColor(Color color) {
		for(IPaletteColor Color : palettecolor) {
			paletteColor.paletteColor(color);
		}
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
