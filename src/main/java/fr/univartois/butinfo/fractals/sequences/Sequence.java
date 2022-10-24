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
	
	private final IComplex firstElement;
	
	private IComplex presentTerm;

	/**
	 * Crée une nouvelle instance de Sequence.
	 * 
	 * @param nextTerme La stratégie pour obtenir le prochain terme.
	 * @param firstElement Le premier élément de la suite.
	 */
	public Sequence(INextTerm nextTerme, IComplex firstElement) {
		this.nextTerm = nextTerme;
		this.firstElement = firstElement;
		presentTerm = firstElement;
	}
	
	public IComplex getPresentTerm() {
		return presentTerm;
	}
	
	public void setPresentTerm(IComplex presentTerm) {
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

	public INextTerm getNextTerm() {
		return nextTerm;
	}

}
