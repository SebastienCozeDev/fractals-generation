package fr.univartois.butinfo.fractals.complex;

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
