package fr.univartois.butinfo.fractals.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

import fr.univartois.butinfo.fractals.complex.IComplex;

/**
 * La classe SequenceIterator correspond à l'Iterator de la suite (classe
 * Sequence).
 *
 * @author Sébastien Coze
 *
 * @version 0.1.0
 */
public class SequenceIterator implements Iterator<IComplex> {

	/**
	 * La suite de nombres complexes.
	 */
	private final Sequence sequence;

	/**
	 * Crée une nouvelle instance de Sequence.
	 * 
	 * @param sequence La suite de nombres complexes.
	 */
	public SequenceIterator(Sequence sequence) {
		this.sequence = Objects.requireNonNull(sequence);
	}

	@Override
	public boolean hasNext() {
		return (sequence.getPresentTerm().abs() >= 2)
				|| (sequence.getNextTerm().calculateNextTerm(sequence.getPresentTerm()) != null);
	}

	@Override
	public IComplex next() {
		if (!hasNext()) {
		      throw new NoSuchElementException();
		}
		sequence.setPresentTerm(sequence.getNextTerm().calculateNextTerm(sequence.getPresentTerm()));
		return sequence.getPresentTerm();
	}
}
