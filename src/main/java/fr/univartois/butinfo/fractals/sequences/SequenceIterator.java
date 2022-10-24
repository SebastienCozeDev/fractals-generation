package fr.univartois.butinfo.fractals.sequences;

import java.util.Iterator;

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
	private Sequence sequence;

	/**
	 * Crée une nouvelle instance de Sequence.
	 * 
	 * @param sequence La suite de nombres complexes.
	 */
	public SequenceIterator(Sequence sequence) {
		this.sequence = sequence;
	}

	@Override
	public boolean hasNext() {
		return (sequence.getPresentTerm().abs() >= 2)
				|| (sequence.getNextTerm().calculateNextTerm(sequence.getPresentTerm()) != null);
	}

	@Override
	public IComplex next() {
		if (hasNext()) {
			sequence.setPresentTerm(sequence.getNextTerm().calculateNextTerm(sequence.getPresentTerm()));
			return sequence.getPresentTerm();
		}
		return null;
	}

}
