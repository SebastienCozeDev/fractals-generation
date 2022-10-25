package fr.univartois.butinfo.fractals.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
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
public class AdaptateurBufferedImage implements IFractalImage {

	/**
	 * Instance de la classe BifferedImage.
	 */
	private final BufferedImage bufferedimage;

	/**
	 * Instance de la la classe Pixel.
	 */
	private Pixel pixel;

	/**
	 * Constructeur de la classe
	 * 
	 * @param bufferedimage
	 */
	public AdaptateurBufferedImage(BufferedImage bufferedimage) {
		this.bufferedimage = bufferedimage;
	}

	@Override
	public int getHeight() {
		return bufferedimage.getHeight();
	}

	@Override
	public int getWidth() {
		return bufferedimage.getWidth();
	}

	@Override
	public Pixel getPixel(int row, int column) {
		return ((IFractalImage) bufferedimage).getPixel(row, column);
	}

	@Override
	public void setColor(int row, int column, Color color) {
		((IFractalImage) bufferedimage).setColor(column, row, color);
	}

	@Override
	public void saveAs(String path) throws IOException {
		String[] splitted = path.split("\\.");
		String formatName = splitted[splitted.length - 1];
		ImageIO.write((RenderedImage) ((IFractalImage) bufferedimage), formatName, new File(path));
	}
}
