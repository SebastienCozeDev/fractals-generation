package fr.univartois.butinfo.fractals.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * La classe Adaptateur de BuffedImage pour implementer IFractalImage.
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class AdaptateurBufferedImage implements IFractalImage {

	
	private final BufferedImage bufferedimage;
	private Pixel pixel;
	
	public AdaptateurBufferedImage(BufferedImage bufferedimage,IFractalImage image) {
		this.bufferedimage=bufferedimage;	
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
		 ((IFractalImage) bufferedimage).setColor(column,row,color);
	}

	@Override
	public void saveAs(String path) throws IOException {
		// TODO Auto-generated method stub
	}

	public BufferedImage getBufferedimage() {
		return bufferedimage;
	}
}
