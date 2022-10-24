package fr.univartois.butinfo.fractals.sequences;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import fr.univartois.butinfo.fractals.complex.IComplex;

/**
 * La classe Sequence permet de générer une suite.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
public class Sequence implements Iterable<IComplex> {

	/**
	 * La stratégie pour obtenir le prochain terme.
	 */
	private final INextTerm nextTerm;

	/**
	 * Le premier terme.
	 */
	private IComplex firstTerm;

	/**
	 * Le terme courant.
	 */
	private IComplex presentTerm;

	/**
	 * Crée une nouvelle instance de Sequence.
	 * 
	 * @param nextTerme    La stratégie pour obtenir le prochain terme.
	 * @param firstElement Le premier élément de la suite.
	 */
	public Sequence(INextTerm nextTerme) {
		this.nextTerm = nextTerme;
	}

	/**
	 * Getter pour le terme courant.
	 * 
	 * @return Le terme courant.
	 */
	public IComplex getPresentTerm() {
		return presentTerm;
	}

	/**
	 * Setter pour le terme courant.
	 * 
	 * @param presentTerm Le nouveau terme courant.
	 */
	public void setPresentTerm(IComplex presentTerm) {
		nextTerm.setPresentTerm(presentTerm);
		this.presentTerm = presentTerm;
	}

	@Override
	public String toString() {
		String str = "";
		for (IComplex complex : this) {
			str += complex.toString();
		}
		return str;
	}

	@Override
	public Iterator<IComplex> iterator() {
		return new SequenceIterator(this);
	}

	/**
	 * Getter pour la strategy nextTerm.
	 * 
	 * @return La strategy nextTerm.
	 */
	public INextTerm getNextTerm() {
		return nextTerm;
	}

	/**
	 * Getter pour le premier terme.
	 * 
	 * @return Le premier terme.
	 */
	public IComplex getFirstTerm() {
		return firstTerm;
	}

	/**
	 * Setter pour le premier terme.
	 * 
	 * @param firstTerm Le nouveau premier terme.
	 */
	public void setFirstTerm(IComplex firstTerm) {
		nextTerm.setFirstTerm(firstTerm);
		this.firstTerm = firstTerm;
		this.presentTerm = this.firstTerm;
	}

}
