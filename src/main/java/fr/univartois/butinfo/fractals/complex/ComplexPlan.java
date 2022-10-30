package fr.univartois.butinfo.fractals.complex;

/**
 * La classe {@link ComplexPlan} propose une représentation du plan complexe
 * permettant de faire la relation entre les pixels d'une image et un nombre
 * complexe.
 * 
 * @author Shahin Shakuri & Sébastien Coze.
 * 
 * @version 0.1.0
 */
public class ComplexPlan implements IComplexPlan {

	/**
	 * Hauteur du plan.
	 */
	private int height;

	/**
	 * Largeur du plan.
	 */
	private int width;

	/**
	 * Crée une instance de {@link ComplexPlan}.
	 * 
	 * @param height Hauteur du plan.
	 * 
	 * @param width  Largeur du plan.
	 */
	public ComplexPlan(int height, int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public Complex asComplex(int row, int column) {
		double re = (column + .5) - (width / 2.);
		double im = (height / 2.) - (row + .5);
		return new Complex(re, im);
	}

}
