package fr.univartois.butinfo.fractals.image;

import java.awt.image.BufferedImage;
import java.io.IOException;

import fr.univartois.butinfo.fractals.color.ColorPalette;
import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.ComplexPlanZoomDecorator;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.sequences.JuliaGeneralizationNextTerm;
import fr.univartois.butinfo.fractals.sequences.JuliaNextTerm;
import fr.univartois.butinfo.fractals.sequences.MandelbrotGeneralizationNextTerm;
import fr.univartois.butinfo.fractals.sequences.MandelbrotNextTerm;
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
				} else if (fractalName.equals("Mandelbrot")) {
					MandelbrotNextTerm nextTerm = new MandelbrotNextTerm(complex, s);
					s.setNextTerm(nextTerm);
				} else if (fractalName.equals("Julia2")) {
					JuliaNextTerm nextTerm = new JuliaNextTerm(complex, new Complex(0.32, 0.043), s);
					s.setNextTerm(nextTerm);
				} else if (fractalName.equals("Julia3")) {
					JuliaNextTerm nextTerm = new JuliaNextTerm(complex, new Complex(-0.0986, -0.65186), s);
					s.setNextTerm(nextTerm);
				} else if (fractalName.equals("Julia4")) {
					JuliaNextTerm nextTerm = new JuliaNextTerm(complex, new Complex(-0.772691322542185, 0.124281466072787), s);
					s.setNextTerm(nextTerm);
				} else if (fractalName.equals("GeneralJulia")) {
					JuliaGeneralizationNextTerm nextTerm = new JuliaGeneralizationNextTerm(complex, new Complex(0.32, 0.043), s, (z, c) -> z.multiply(z).add(c));
					s.setNextTerm(nextTerm);
				}
				else {
					MandelbrotGeneralizationNextTerm nextTerm = new MandelbrotGeneralizationNextTerm(complex, s, (z, c) -> (z.multiply(z).add(z)).divide(z.multiply(z.multiply(z)).add(c)));
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
