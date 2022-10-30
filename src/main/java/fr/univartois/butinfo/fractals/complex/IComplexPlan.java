package fr.univartois.butinfo.fractals.complex;

/**
 * L'interface {@link IComplexPlan} correspond au contrat que doit respecter un
 * plan complex tel que {@link ComplexPlan} par exemple.
 * 
 * @author Shahin Shakuri.
 * 
 * @version 0.1.0
 */
public interface IComplexPlan {

	/**
	 * Permet d'obtenir le nombre complexe correspondant au point du plan.
	 * 
	 * @param row    Ligne du point.
	 * 
	 * @param column Colonne du point.
	 * 
	 * @return Nombre complexe correspondant.
	 */
	IComplex asComplex(int row, int column);

}
