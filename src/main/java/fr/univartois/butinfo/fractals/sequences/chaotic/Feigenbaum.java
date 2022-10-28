package fr.univartois.butinfo.fractals.sequences;

import fr.univartois.butinfo.fractals.complex.IPlanPoint;
import fr.univartois.butinfo.fractals.sequences.chaotic.ISequenceChaotique;
import fr.univartois.butinfo.fractals.sequences.chaotic.SequenceChaotique;

public abstract class Feigenbaum extends SequenceChaotique implements ISequenceChaotique{
	public Feigenbaum(IPlanPoint premier, int nbMaxIteration) {
        super(premier, nbMaxIteration);
 
    }

    @Override
    public double getNext(IPlanPoint premier) {
        return ((premier.X()*premier.Y())*(1-premier.Y()));
    }


}
