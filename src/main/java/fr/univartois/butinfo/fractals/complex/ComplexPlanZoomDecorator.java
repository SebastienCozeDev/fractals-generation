package fr.univartois.butinfo.fractals.complex;

/**
 * Décorateur permettant de zoomer sur l'image.
 */
public class ComplexPlanZoomDecorator extends ComplexPlanDecorated {

	private double constant;
	
	public ComplexPlanZoomDecorator(int height, int width, double constant) {
		super(height, width);
		this.constant = constant;
	}
	
	@Override
	public IComplex asComplex(int row, int column) {
		double re = (column + .5) - (super.width / 2.);
		double im = (super.height / 2.) - (row + .5);
		return new Complex(re,im).multiply(constant);
	}
}
