package fr.univartois.butinfo.fractals.complex;

public abstract class ComplexZoomDecorator implements IComplexImage {
	
	
	
	private final double constant;

	public ComplexZoomDecorator(double constant) {
		this.constant = constant;
	}
	
	@Override
	public IComplex asComplex(IComplex complex) {
		return complex.multiply(constant);
	}
}
