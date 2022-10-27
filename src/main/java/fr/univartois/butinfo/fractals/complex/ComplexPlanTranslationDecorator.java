package fr.univartois.butinfo.fractals.complex;

/**
 * Decorateur pour faire une translation de l'image.
 */
public class ComplexPlanTranslationDecorator extends ComplexPlanDecorated {

	private IComplex constant;
	
	public ComplexPlanTranslationDecorator(int height, int width, IComplex constant) {
		super(height, width);
		this.constant = constant;
	}
	
	public IComplex asComplex(int row, int column) {
		double re = (column + .5) - (super.width / 2.);
		double im = (super.height / 2.) - (row + .5);
		return new Complex(re,im).add(constant);
	}
	
}
