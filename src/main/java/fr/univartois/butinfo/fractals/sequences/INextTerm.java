package fr.univartois.butinfo.fractals.sequences;

import fr.univartois.butinfo.fractals.complex.IComplex;

/**
 * L'interface INextTerm définit le contrat à respecter par la strategy de la
 * méthode calculateNextTerm() permettant de calculer le prochain terme d'une
 * suite.
 *
 * @author Sébastien Coze
 *
 * @version 0.1.0
 */
public interface INextTerm {

	/**
	 * Permet de calculer le prochain terme d'une suite.
	 */
	IComplex calculateNextTerm(IComplex lastTerm);

}
