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
	 * Getter pour le premier terme.
	 * 
	 * @return Le premier terme.
	 */
	IComplex getFirstTerm();

	/**
	 * Setter pour le premier terme.
	 * 
	 * @param firstTerme Le premier terme.
	 */
	void setFirstTerm(IComplex firstTerme);

	/**
	 * Getter pour le terme courant.
	 * 
	 * @return Le terme courant.
	 */
	IComplex getPresentTerm();

	/**
	 * Setter pour le terme courant.
	 * 
	 * @param presentTerm Le nouveau courant.
	 */
	void setPresentTerm(IComplex presentTerm);

	/**
	 * Permet de calculer le prochain terme d'une suite.
	 */
	IComplex calculateNextTerm(IComplex lastTerm);

}
