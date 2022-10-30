package fr.univartois.butinfo.fractals.sequences.chaotic;

import java.util.Iterator;
import java.util.NoSuchElementException;

import fr.univartois.butinfo.fractals.complex.AdaptateurComplex;
import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.IPlanPoint;

/**
 * La classe {@link SequenceChaotiqueIterator} est l'{@link Iterator} pour la
 * classe {@link SequenceChaotique}.
 * 
 * @author Shahin Shakuri
 * 
 * @version 0.1.0
 */
public class SequenceChaotiqueIterator implements Iterator<IPlanPoint> {

	/**
	 * Nombre d'itération.
	 */
	private int nbIteration = 0;

	/**
	 * Nombre maximum d'itération.
	 */
	private int nbMaxIteration;

	/**
	 * Point précédent.
	 */
	private IPlanPoint precedent;

	/**
	 * Instance de {@link ISequenceChaotique}.
	 */
	ISequenceChaotique suiteChaotique;

	/**
	 * Crée une {@link SequenceChaotiqueIterator}.
	 * 
	 * @param suiteChaotique Instance de {@link ISequenceChaotique}.
	 * 
	 * @param nbMaxIteration Nombre maximum d'itération.
	 * 
	 * @param precedent      Point précédent.
	 */
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