package fr.univartois.butinfo.fractals.sequences.chaotic;

/*L'interface pour les suites chaotiques*/

import fr.univartois.butinfo.fractals.complex.IPlanPoint;

public interface ISequenceChaotique {
	public double getNext(IPlanPoint plan);
}
