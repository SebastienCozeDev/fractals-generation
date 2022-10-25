package fr.univartois.butinfo.fractals.complex;

/*decorateur permettant de zoomer sur l'image*/

public abstract class ComplexPlanZoomDecorator implements IComplexPlan {

	private final double constant;

	public ComplexPlanZoomDecorator(double constant) {
		this.constant = constant;
	}

	@Override
	public IComplex asComplex(IComplex complex) {
		return complex.multiply(constant);
	}
}
