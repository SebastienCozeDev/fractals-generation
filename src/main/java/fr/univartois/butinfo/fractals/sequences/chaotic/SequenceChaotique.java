package fr.univartois.butinfo.fractals.sequences.chaotic;

import java.util.Iterator;

import fr.univartois.butinfo.fractals.complex.IPlanPoint;

/*Classe representant les suites chaotiques */

/**
 * La classe {@link SequenceChaotique} correspond à une suite chaotique.
 * 
 * @author Shahin Shakuri.
 * 
 * @version 0.1.0
 */
public abstract class SequenceChaotique implements Iterable<IPlanPoint>, ISequenceChaotique {

	/**
	 * Premier point du plan.
	 */
	private IPlanPoint premier;

	/**
	 * Nombre maximum d'itération.
	 */
	private int nbMaxIteration;

	/**
	 * Crée une instance de {@link SequenceChaotique}.
	 * 
	 * @param premier        Premier point du plan.
	 * 
	 * @param nbMaxIteration Nombre maximum d'itération.
	 */
	protected SequenceChaotique(IPlanPoint premier, int nbMaxIteration) {
		this.premier = premier;
		this.nbMaxIteration = nbMaxIteration;
	}

	@Override
	public Iterator<IPlanPoint> iterator() {
		return new SequenceChaotiqueIterator(this, nbMaxIteration, premier);

	}

}
