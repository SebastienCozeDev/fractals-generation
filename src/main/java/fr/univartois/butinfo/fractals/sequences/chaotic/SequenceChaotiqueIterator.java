package fr.univartois.butinfo.fractals.sequences.chaotic;

import java.util.Iterator;
import java.util.NoSuchElementException;

import fr.univartois.butinfo.fractals.complex.AdaptateurComplex;
import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.IPlanPoint;

public class SequenceChaotiqueIterator implements Iterator<IPlanPoint> {

	private int nbIteration = 0;

	private int nbMaxIteration;

	private IPlanPoint precedent;

	ISequenceChaotique suiteChaotique;

	public SequenceChaotiqueIterator(ISequenceChaotique suiteChaotique, int nbMaxIteration, IPlanPoint precedent) {
		this.suiteChaotique = suiteChaotique;
		this.nbMaxIteration = nbMaxIteration;
		this.precedent = precedent;
	}

	@Override
	public boolean hasNext() {
		return (nbIteration != nbMaxIteration);
	}

	@Override
	public IPlanPoint next() {
		if (!hasNext())
			throw new NoSuchElementException();
		nbIteration++;
		return new AdaptateurComplex(new Complex(precedent.y(), suiteChaotique.getNext(precedent)));
	}

}