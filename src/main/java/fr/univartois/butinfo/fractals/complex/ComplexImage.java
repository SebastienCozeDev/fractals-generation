package fr.univartois.butinfo.fractals.complex;
/* cette classe  propose une représentation du plan complexe permettant de faire la relation entre les pixels
d’une image et un nombre complexe */

public class ComplexImage  {
	
	private IComplexImage decorated;
	private final double re; // the real part
	private final double im; // the imaginary part

	private int height;
	private int width;

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public double getRe() {
		return re;
	}

	public double getIm() {
		return im;
	}
	

	public ComplexImage(double re, double im, int height, int width) {
		this.re = re;
		this.im = im;
		this.height = height;
		this.width = width;
	}

	public IComplex asComplex(int row, int column) {
		double re = (column + .5) - (width / 2.);
		double im = (height / 2.) - (row + .5);
		return decorated.asComplex(new Complex(re,im));
		
	}

}
