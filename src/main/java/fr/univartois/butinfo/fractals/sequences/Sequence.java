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
public class Sequence<T> implements Iterator<T> {

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

	@Override
	public boolean hasNext() {
		double realPart = presentTerm.getRealPart();
		double imaginaryPart = presentTerm.getImaginaryPart();
		return (Math.sqrt(Math.pow(realPart, 2)) + (Math.pow(imaginaryPart, 2)) >= 2) || (nextTerm.calculateNextTerm(presentTerm) != null);
	}

	@Override
	public T next() {
		if (hasNext()) {
			presentTerm = nextTerm.calculateNextTerm(presentTerm);
			return (T) presentTerm;	
		}
		return null;
	}
	
	public String toString() {
		
	}

}
