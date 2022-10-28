package fr.univartois.butinfo.fractals.sequences;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import fr.univartois.butinfo.fractals.color.ColorPalette;
import fr.univartois.butinfo.fractals.color.strategies.GrayColorPaletteStrategy;
import fr.univartois.butinfo.fractals.color.strategies.RedColorPaletteStrategy;
import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.ComplexPlan;
import fr.univartois.butinfo.fractals.complex.ComplexPlanZoomDecorator;
import fr.univartois.butinfo.fractals.complex.IComplex;

public class SequencesTest {
	
	/*
	 * Ca peut soit boucler ou diverger
	 * Qd ca boucle, on met en noir et l'inverse blanc
	 */
	public static void main(String[] args) {
		int nbIterationMax = 5; // nb iteration où on considère que la suite ne converge pas
		int height = 2048;
		int width = 2048;
		BufferedImage bufferedImage = new BufferedImage(height+1, width+1, BufferedImage.TYPE_INT_RGB);
		ColorPalette colorPalette = new ColorPalette(nbIterationMax, new RedColorPaletteStrategy());
		//ComplexPlan complexPlan = new ComplexPlan(height, width);
		ComplexPlanZoomDecorator complexPlan = new ComplexPlanZoomDecorator(height, width, 0.001);
		Complex maxComplex = new Complex(Math.pow(10, 37), Math.pow(10, 37));
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= width; j++) {
				Complex complex = (Complex) complexPlan.asComplex(i, j);
				Sequence s = new Sequence();
				JuliaNextTerm juliaNextTerm = new JuliaNextTerm(complex, new Complex(0.32, 0.043), s);
				s.setNextTerm(juliaNextTerm);
				//System.out.println(s.getFirstTerm());
				int nbIteration = 0;
				for (IComplex c : s) {
					// elle diverge
					
					if ((c.getRealPart() > maxComplex.getRealPart()) && (c.getImaginaryPart() > maxComplex.getImaginaryPart())) {
						//System.out.println("WHITE");
						bufferedImage.setRGB(i, j, colorPalette.getColor(nbIteration).getRGB());
						break;						
					}
					if (c.abs() > 2) {
						bufferedImage.setRGB(i, j, colorPalette.getColor(nbIteration).getRGB());
						break;
					}
					else if (nbIteration == nbIterationMax) {
						//System.out.println("BLACK");
						bufferedImage.setRGB(i, j, new Color(0, 0, 0).getRGB());
						break;
					}
					//System.out.println(c);
					nbIteration++;
				}
			}
		}
	    try {
	        File myObj = new File("2048-5-0.32-0.043-zoom0.001-black.png");
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	          ImageIO.write(bufferedImage, "png", myObj);
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
		//ImageIO.write(bufferedImage, "img", new File("img"));
		/*
		String[] splitted = path.split("\\.");
		String formatName = splitted[splitted.length - 1];
		ImageIO.write(bufferedImage, formatName, new File(path));*/
	}
	
}
