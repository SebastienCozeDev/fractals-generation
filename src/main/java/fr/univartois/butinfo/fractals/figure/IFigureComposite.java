package fr.univartois.butinfo.fractals.figure;

/**
 * L'interface {@link IFigureComposite} correspond au contrat que doit respecté
 * un composite.
 * 
 * @author Théo Journée
 * 
 * @version 0.1.0
 */
public interface IFigureComposite {

	/**
	 * Donne la forme en chaîne de caractères.
	 * 
	 * @param forme La forme.
	 * @return La forme en {@link String}.
	 */
	String figureString(String forme);
}
