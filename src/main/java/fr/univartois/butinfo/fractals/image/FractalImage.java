package fr.univartois.butinfo.fractals.image;

import java.awt.image.BufferedImage;

import fr.univartois.butinfo.fractals.color.IPaletteColor;
import fr.univartois.butinfo.fractals.color.PaletteColor;
import fr.univartois.butinfo.fractals.complex.ComplexPlan;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.sequences.Sequence;

/**
 * Classe représentant une image fractale.
 * 
 * @author Sébastien Coze
 * 
 * @version 0.1.0
 *
 */
public class FractalImage {

	/**
	 * Hauteur de l'image en pixels.
	 */
	private int height;

	/**
	 * Largeur de l'image en pixels.
	 */
	private int width;

	/**
	 * Échelle de l'image. Elle correspond à la largeur d'un pixel dans le plan
	 * complexe.
	 */
	private int scale;

	/**
	 * Point central de l'image.
	 */
	private Pixel centralPoint;

	/**
	 * Suite étant l'approche permettant de générer la fractale (suite complexe ou
	 * chaotique).
	 */
	private Sequence sequence;

	/**
	 * Palette de couleurs utilisé par l'image.
	 */
	private IPaletteColor colorPalette;

	/**
	 * Nom du fichier dans lequel le résultat sera sauvegardé.
	 */
	private String file;

	/**
	 * Crée une instance de {@link FractalImage}.
	 * 
	 * @param b Le builder pour l'image de type {@link FractalImageBuilder}.
	 */
	public FractalImage(FractalImageBuilder b) {
		this.height = b.getHeight();
		this.width = b.getWidth();
		this.scale = b.getScale();
		this.centralPoint = b.getCentralPoint();
		this.sequence = b.getSequence();
		this.colorPalette = b.getColorPalette();
	}
	
	/**
	 * Crée l'image.
	 */
	public void createImage() {
		BufferedImageAdaptator image = new BufferedImageAdaptator(new BufferedImage(height, width, scale));
		int k = 0;
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= width; j++) {
				k = 0;
				PaletteColor paletteColor = new PaletteColor(new Pixel(image, i, j));
				ComplexPlan complexPlan = new ComplexPlan(i, j);
				sequence.setFirstTerm(complexPlan.asComplex(i, j));
				for (IComplex complex : sequence) {
					k++;					
				}
				paletteColor.getColor();
			}
		}
	}

}
