package fr.univartois.butinfo.fractals.sequences.chaotic;

import fr.univartois.butinfo.fractals.complex.IPlanPoint;

/**
 * La classe {@link Feigenbaum} représente la suite de Feigenbaum.
 * 
 * @author Shahin Shakuri.
 * 
 * @version 0.1.0
 */
public class Feigenbaum extends SequenceChaotique implements ISequenceChaotique {

	/**
	 * Crée une instance de {@link Feigenbaum}.
	 * 
	 * @param premier        Premier point.
	 * 
	 * @param nbMaxIteration Nombre d'itération maximum.
	 */
	public Feigenbaum(IPlanPoint premier, int nbMaxIteration) {
		super(premier, nbMaxIteration);
	}

	@Override
	public double getNext(IPlanPoint plan) {
		return ((plan.x() * plan.y()) * (1 - plan.y()));
	}

}
