package fr.univartois.butinfo.fractals.complex;

/**
 * La classe {@link ComplexPlanDecorated} correspond à un {@link IComplexPlan}
 * décoré.
 * 
 * @author Shahin Shakuri & Sébastien Coze
 * 
 * @version 0.1.0
 */
public abstract class ComplexPlanDecorated {

	/**
	 * Instance d'un {@link IComplexPlan} qui sera décoré.
	 */
	private IComplexPlan decorated;

	/**
	 * Hauteur du plan.
	 */
	protected int height;

	/**
	 * Largeur du plan.
	 */
	protected int width;

	/**
	 * Crée une instance de {@link ComplexPlanDecorated}.
	 * 
	 * @param height Hauteur du plan.
	 * 
	 * @param width  Largeur du plan.
	 */
	protected ComplexPlanDecorated(int height, int width) {
		this.height = height;
		this.width = width;
	}

	/**
	 * Permet d'avoir le nombre complexe pour des coordonnées du plan données.
	 * 
	 * @param row    Ligne du point.
	 * 
	 * @param column Colonne du point.
	 * 
	 * @return Le nombre complexe correspondant.
	 */
	public IComplex asComplex(int row, int column) {
		return decorated.asComplex(row, column);
	}

}
