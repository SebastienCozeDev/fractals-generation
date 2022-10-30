package fr.univartois.butinfo.fractals.sequences.chaotic;

import fr.univartois.butinfo.fractals.complex.IPlanPoint;

/**
 * L'interface {@link ISequenceChaotique} correspond au contrat que doivent
 * respecté les suites chaotiques.
 * 
 * @author Shahin Shakuri.
 * 
 * @version 0.1.0
 */
public interface ISequenceChaotique {

	/**
	 * Donne le prochain terme.
	 * 
	 * @param plan Point du plan.
	 * 
	 * @return Le prochain terme.
	 */
	public double getNext(IPlanPoint plan);
}
