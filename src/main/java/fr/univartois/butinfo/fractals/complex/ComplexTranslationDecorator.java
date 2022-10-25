package fr.univartois.butinfo.fractals.complex;

/*Decorateur pour faire une translation de l'image */

public abstract class ComplexTranslationDecorator implements IComplexImage {


	private final IComplex constant;

	public ComplexTranslationDecorator(IComplex constant) {
		this.constant = constant;
	}
	
	@Override
	public IComplex asComplex(IComplex complex) {
		return complex.add(constant);
	}
}
