package fr.univartois.butinfo.fractals.sequences.chaotic;

import fr.univartois.butinfo.fractals.complex.IPlanPoint;

/**
 * La classe {@link Circulaire} représente la suite circulaire.
 * 
 * @author Shahin Shakuri.
 * 
 * @version 0.1.0
 */
public class Circulaire extends SequenceChaotique implements ISequenceChaotique {

	/**
	 * Crée une instance de {@link Circulaire}.
	 * 
	 * @param premier        Premiier point.
	 * 
	 * @param nbMaxIteration Nombre d'itération maximum.
	 */
	public Circulaire(IPlanPoint premier, int nbMaxIteration) {
		super(premier, nbMaxIteration);
	}

	@Override
	public double getNext(IPlanPoint plan) {
		return plan.y() + (plan.x() * Math.sin(2 * Math.PI * plan.y()) / 2 * Math.PI);
	}

}
