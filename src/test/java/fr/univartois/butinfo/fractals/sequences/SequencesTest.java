package fr.univartois.butinfo.fractals.sequences;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import fr.univartois.butinfo.fractals.color.ColorPalette;
import fr.univartois.butinfo.fractals.color.strategies.GrayColorPaletteStrategy;
import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.ComplexPlanZoomDecorator;
import fr.univartois.butinfo.fractals.complex.IComplex;

/**
 * La classe {@link SequencesTest} sert à tester la classe.
 * 
 * @author Sébastien Coze
 * 
 * @version 0.1.0
 */
public class SequencesTest {

	/*
	 * Ca peut soit boucler ou diverger.
	 */
	public static void main(String[] args) {
		int nbIterationMax = 200; // nb iteration où on considère que la suite ne converge pas
		int height = 2048;
		int width = 2048;
		BufferedImage bufferedImage = new BufferedImage(height + 1, width + 1, BufferedImage.TYPE_INT_RGB);
		ColorPalette colorPalette = new ColorPalette(nbIterationMax, new GrayColorPaletteStrategy());
		// ComplexPlan complexPlan = new ComplexPlan(height, width);
		ComplexPlanZoomDecorator complexPlan = new ComplexPlanZoomDecorator(height, width, 0.002);
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= width; j++) {
				Complex complex = (Complex) complexPlan.asComplex(i, j);
				Sequence s = new Sequence();
				JuliaNextTerm juliaNextTerm = new JuliaNextTerm(complex, new Complex(-0.4, 0.6), s);

				s.setNextTerm(juliaNextTerm);
				int nbIteration = 0;
				for (IComplex c : s) {
					// elle diverge
					if (c.abs() > 2) {
						bufferedImage.setRGB(j, i, colorPalette.getColor(nbIteration).getRGB());
						break;
					} else if (nbIteration == nbIterationMax) {
						bufferedImage.setRGB(j, i, colorPalette.getColor(nbIteration).getRGB());
						break;
					}
					nbIteration++;
				}
			}
		}
		try {
			File myObj = new File("example.png");
			System.out.println("File created or edited: " + myObj.getName());
			ImageIO.write(bufferedImage, "png", myObj);
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
