package fr.univartois.butinfo.fractals.sequences.chaotic;

import java.util.Iterator;

import fr.univartois.butinfo.fractals.complex.IPlanPoint;

/*Classe representant les suites chaotiques */

public abstract class SequenceChaotique implements Iterable<IPlanPoint>,ISequenceChaotique {
	 private IPlanPoint premier;
	    private int nbMaxIteration;
	    
	    public SequenceChaotique(IPlanPoint premier, int nbMaxIteration) {
	        this.premier=premier;
	        this.nbMaxIteration = nbMaxIteration;
	    }
	    public Iterator<IPlanPoint> iterator(){
	        return new SequenceChaotiqueIterator(this, nbMaxIteration, premier);
	        
	    }
	    public abstract double getNext(IPlanPoint plan);
}


