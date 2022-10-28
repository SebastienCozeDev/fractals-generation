package fr.univartois.butinfo.fractals.sequences;

import java.util.Iterator;

import fr.univartois.butinfo.fractals.complex.IPlanPoint;

public abstract class SequenceChaotique implements Iterator<IPlanPoint>,ISequenceChaotique {
	 private IPlanPoint premier;
	    private int nbMaxIteration;
	    
	    public SequenceChaotique(IPlanPoint premier, int nbMaxIteration) {
	        this.premier=premier;
	        this.nbMaxIteration = nbMaxIteration;
	    }
	    public Iterator<IPlanPoint> iterator(){
	        return (Iterator<IPlanPoint>) new SequenceChaotiqueIterator(this, nbMaxIteration, premier);
	        
	    }
	    public abstract double getNext(IPlanPoint plan);
}


