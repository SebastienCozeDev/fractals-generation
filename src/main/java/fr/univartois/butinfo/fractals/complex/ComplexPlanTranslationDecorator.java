package fr.univartois.butinfo.fractals.complex;

/**
 * Decorateur pour faire une translation de l'image.
 */
public class ComplexPlanTranslationDecorator implements IComplexPlan {


	private final IComplex constant;

	public ComplexPlanTranslationDecorator(IComplex constant) {
		this.constant = constant;
	}
	
	@Override
	public IComplex asComplex(IComplex complex) {
		return complex.add(constant);
	}
}
