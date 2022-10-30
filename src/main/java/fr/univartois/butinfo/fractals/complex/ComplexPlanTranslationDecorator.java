package fr.univartois.butinfo.fractals.complex;

/**
 * La classe {@link ComplexPlanTranslationDecorator} correspond au décorateur
 * d'un {@link IComplexPlan} permettant de faire une translation.
 * 
 * @author Shahin Shakuri & Sébastien Coze.
 * 
 * @version 0.1.0
 */
public class ComplexPlanTranslationDecorator extends ComplexPlanDecorated {

	/**
	 * Instance de {@link IComplex} correspondant à la constante de la translation.
	 */
	private IComplex constant;

	/**
	 * Crée une instance de {@link ComplexPlanTranslationDecorator}.
	 * 
	 * @param height   Hauteur du plan.
	 * 
	 * @param width    Largeur du plan.
	 * 
	 * @param constant Constante de la translation.
	 */
	public ComplexPlanTranslationDecorator(int height, int width, IComplex constant) {
		super(height, width);
		this.constant = constant;
	}

	@Override
	public IComplex asComplex(int row, int column) {
		double re = (column + .5) - (super.width / 2.);
		double im = (super.height / 2.) - (row + .5);
		return new Complex(re, im).add(constant);
	}

}
