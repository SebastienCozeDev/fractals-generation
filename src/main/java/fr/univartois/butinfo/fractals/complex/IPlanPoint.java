package fr.univartois.butinfo.fractals.complex;

/**
 * L'interface {@link IPlanPoint} correspond au contrat que doit respecter
 * l'adapteur permettant de calculer des suites de points dans le plan réel.
 * 
 * @author Shahin Shakuri.
 * 
 * @version 0.1.0
 */
public interface IPlanPoint {

	/**
	 * Permet d'obtenir la coordonnée X.
	 * 
	 * @return La coordonnée X.
	 */
	public double x();

	/**
	 * Permet d'obtenir la coordonnée Y.
	 * 
	 * @return La coordonnée Y.
	 */
	public double y();

	/**
	 * Permet d'obtenir la distance entre deux point.
	 * 
	 * @param point La deuxième point.
	 * 
	 * @return La distance.
	 */
	public double distance(IPlanPoint point);

	/**
	 * Converti le point en nombre complexe.
	 * 
	 * @return Le nombre complexe correspondant.
	 */
	public IComplex convertirEnIComplex();

}
