package fr.univartois.butinfo.fractals.complex;

/**
 * Décorateur permettant de zoomer sur l'image.
 */

/**
 * La classe {@link ComplexPlanZoomDecorator} correspond au décorateur
 * permettant de zoomer sur le plan {@link IComplexPlan}.
 * 
 * @author Shahin Shakuri & Sébastien Coze
 * 
 * @version 0.1.0
 */
public class ComplexPlanZoomDecorator extends ComplexPlanDecorated {

	/**
	 * Constante du zoom.
	 */
	private double constant;

	/**
	 * Crée une instance de {@link ComplexPlanZoomDecorator}.
	 * 
	 * @param height   Hauteur du plan.
	 * 
	 * @param width    Largeur du plan.
	 * 
	 * @param constant Constante du zoom.
	 */
	public ComplexPlanZoomDecorator(int height, int width, double constant) {
		super(height, width);
		this.constant = constant;
	}

	@Override
	public IComplex asComplex(int row, int column) {
		double re = (column + .5) - (super.width / 2.);
		double im = (super.height / 2.) - (row + .5);
		return new Complex(re, im).multiply(constant);
	}
}
