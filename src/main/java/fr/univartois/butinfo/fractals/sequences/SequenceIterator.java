package fr.univartois.butinfo.fractals.sequences;

import java.util.Iterator;

import fr.univartois.butinfo.fractals.complex.IComplex;

public class SequenceIterator implements Iterator<IComplex> {
	
	private IComplex presentTerm;
	
	private INextTerm nextTerm;
	
	private Sequence sequence;

	public SequenceIterator(Sequence sequence) {
		this.sequence = sequence;
	}

	@Override
	public boolean hasNext() {
		return (sequence.getPresentTerm().abs() >= 2) || (sequence.getNextTerm().calculateNextTerm(sequence.getPresentTerm()) != null);
	}

	@Override
	public IComplex next() {
		if (hasNext()) {
			presentTerm = nextTerm.calculateNextTerm(presentTerm);
			return presentTerm;	
		}
		return null;
	}

}
