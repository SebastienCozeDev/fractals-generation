package fr.univartois.butinfo.fractals.sequences.chaotic;

import fr.univartois.butinfo.fractals.complex.IPlanPoint;

/*La classe representant la suite Feigenbaum*/

public class Feigenbaum extends SequenceChaotique implements ISequenceChaotique{
	public Feigenbaum(IPlanPoint premier, int nbMaxIteration) {
        super(premier, nbMaxIteration);
 
    }

    @Override
    public double getNext(IPlanPoint plan) {
        return ((plan.X()*plan.Y())*(1-plan.Y()));
    }



}
