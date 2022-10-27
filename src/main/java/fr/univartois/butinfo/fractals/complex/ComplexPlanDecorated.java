package fr.univartois.butinfo.fractals.complex;

public abstract class ComplexPlanDecorated {
	
	private IComplexPlan decorated;

	protected int height;

	protected int width;

	public ComplexPlanDecorated(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public IComplex asComplex(int row, int column) {
		return decorated.asComplex(row, column);
	}
	
}
