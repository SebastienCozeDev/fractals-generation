package fr.univartois.butinfo.fractals.image;

import java.awt.image.BufferedImage;
import java.io.IOException;

import fr.univartois.butinfo.fractals.color.ColorPalette;
import fr.univartois.butinfo.fractals.color.IColorPaletteStrategy;
import fr.univartois.butinfo.fractals.color.strategies.BlueColorPaletteStrategy;
import fr.univartois.butinfo.fractals.color.strategies.GrayColorPaletteStrategy;
import fr.univartois.butinfo.fractals.color.strategies.GreenColorPaletteStrategy;
import fr.univartois.butinfo.fractals.color.strategies.RedColorPaletteStrategy;
import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.ComplexPlanZoomDecorator;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.sequences.JuliaNextTerm;
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
	private double scale;

	/**
	 * Point central de l'image.
	 */
	private Pixel centralPoint;

	/**
	 * Suite étant l'approche permettant de générer la fractale (suite complexe ou
	 * chaotique).
	 */
	private String fractalName;

	/**
	 * Palette de couleurs utilisé par l'image.
	 */
	private ColorPalette colorPalette;

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
		this.fractalName = b.getSequence();
		this.colorPalette = b.getColorPalette();
		this.file = b.getFile();
	}

	/**
	 * Crée l'image.
	 * 
	 * @param maxIteration Nombre maximum d'itération.
	 */
	public void createImage(int maxIteration) {
		BufferedImageAdaptator bufferedImageAdaptator = new BufferedImageAdaptator(new BufferedImage(height + 1, width + 1, BufferedImage.TYPE_INT_RGB));
		ComplexPlanZoomDecorator complexPlan = new ComplexPlanZoomDecorator(height, width, scale);
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= width; j++) {
				Complex complex = (Complex) complexPlan.asComplex(i, j);
				Sequence s = new Sequence();
				if (fractalName.equals("Julia")) {
					JuliaNextTerm nextTerm = new JuliaNextTerm(complex, new Complex(-0.4, 0.6), s);
					s.setNextTerm(nextTerm);
				}
				else {
					JuliaNextTerm nextTerm = new JuliaNextTerm(complex, new Complex(-0.4, 0.6), s);
					s.setNextTerm(nextTerm);
				}
				int nbIteration = 0;
				for (IComplex c : s) {
					if ((c.abs() > 2) || (nbIteration == maxIteration)) {
						bufferedImageAdaptator.setColor(j, i, colorPalette.getColor(nbIteration));
						break;
					}
					nbIteration++;
				}
			}
		}
		try {
			bufferedImageAdaptator.saveAs(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
