package fr.univartois.butinfo.fractals.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import fr.univartois.butinfo.fractals.color.ColorPalette;
import fr.univartois.butinfo.fractals.color.IColorPaletteStrategy;
import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.ComplexPlan;
import fr.univartois.butinfo.fractals.complex.ComplexPlanDecorated;
import fr.univartois.butinfo.fractals.complex.ComplexPlanTranslationDecorator;
import fr.univartois.butinfo.fractals.complex.ComplexPlanZoomDecorator;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.IComplexPlan;
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
	private Sequence sequence;

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
		this.sequence = b.getSequence();
		this.colorPalette = b.getColorPalette();
		this.file = b.getFile();
	}

	/**
	 * Crée l'image.
	 * 
	 * @param maxIteration Nombre maximum d'itération.
	 */
	public void createImage(int maxIteration, IColorPaletteStrategy colorPaletteStrategy, Sequence sequence) {
		// TODO Il faut créer une translation pour placer le point central correctement.
		// TODO Il faut créer un zoom pour appliquer l'échelle.
		BufferedImageAdaptator image = new BufferedImageAdaptator(new BufferedImage(height, width, BufferedImage.TYPE_INT_RGB));
		int k = 0;
		ColorPalette paletteColor = new ColorPalette(maxIteration, colorPaletteStrategy);
		ComplexPlanDecorated complexPlanDecorated = new ComplexPlanZoomDecorator(height, width, 1/100);
		for (int i = 0; i < height; i++) {
			System.out.println("Ligne " + i);
			for (int j = 0; j < width; j++) {
				k = 0;
				/*
				System.out.println(sequence.getFirstTerm());
				System.out.println(sequence.getPresentTerm());
				System.out.println(sequence.getNextTerm());
				System.out.println(sequence.getNextTerm().calculateNextTerm(sequence.getPresentTerm()));
				sequence.setPresentTerm(sequence.getNextTerm().calculateNextTerm(sequence.getPresentTerm()));
				System.out.println(sequence.getNextTerm().calculateNextTerm(sequence.getPresentTerm()));
				System.out.println("---");*/
				for (IComplex complex : sequence) {
					System.out.println(complex);
					k++;
					if ((k == maxIteration) || (Double.isNaN(complex.getRealPart())) || (Double.isNaN(complex.getImaginaryPart())))
						break;
				}
				System.out.println(k);
				//image.setColor(i, j, paletteColor.getColor(k));
				System.out.println("i = " + i);
				System.out.println("j = " + j);
				image.setColor(i, j, new Color(0, 0, 0));
			}
		}
		try {
			image.saveAs(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
