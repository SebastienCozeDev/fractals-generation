package fr.univartois.butinfo.fractals.complex;
/* cette classe  propose une représentation du plan complexe permettant de faire la relation entre les pixels
d’une image et un nombre complexe */

public class ComplexPlan  {
	
	private IComplexPlan decorated;

	private int height;
	
	private int width;
	
	public ComplexPlan(int height, int width,IComplexPlan decorated) {
		this.height = height;
		this.width = width;
		this.decorated=decorated;
	}

	public IComplex asComplex(int row, int column) {
		double re = (column + .5) - (width / 2.);
		double im = (height / 2.) - (row + .5);
		if (decorated == null) 
			return new Complex(re,im);
		return decorated.asComplex(new Complex(re,im));
	}

}
