package fr.univartois.butinfo.fractals.sequences.chaotic;

import fr.univartois.butinfo.fractals.complex.IPlanPoint;

/*La classe representant la suite circulaire*/

public class Circulaire extends SequenceChaotique implements ISequenceChaotique {

	public Circulaire(IPlanPoint premier, int nbMaxIteration) {
		super(premier, nbMaxIteration);
	}

	@Override
	public double getNext(IPlanPoint plan) {
	
		return plan.Y()+((plan.X()*Math.sin(2*Math.PI*plan.Y())/2*Math.PI));
	}

}
