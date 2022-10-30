package fr.univartois.butinfo.fractals.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * La classe Adaptateur de BuffedImage pour implementer IFractalImage.
 * 
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class BufferedImageAdaptator implements IFractalImage {

	/**
	 * Instance de la classe BifferedImage.
	 */
	private final BufferedImage bufferedImage;

	/**
	 * Constructeur de la classe
	 * 
	 * @param bufferedimage
	 */
	public BufferedImageAdaptator(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}

	@Override
	public int getHeight() {
		return bufferedImage.getHeight();
	}

	@Override
	public int getWidth() {
		return bufferedImage.getWidth();
	}

	@Override
	public Pixel getPixel(int row, int column) {
		return ((IFractalImage) bufferedImage).getPixel(row, column);
	}

	@Override
	public void setColor(int row, int column, Color color) {
		bufferedImage.setRGB(row, column, color.getRGB());
	}

	@Override
	public void saveAs(String path) throws IOException {
		String[] splitted = path.split("\\.");
		String formatName = splitted[splitted.length - 1];
		ImageIO.write(bufferedImage, formatName, new File(path));
	}
}
