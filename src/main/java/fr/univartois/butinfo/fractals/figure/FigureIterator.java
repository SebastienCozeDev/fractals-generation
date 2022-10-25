package fr.univartois.butinfo.fractals.figure;

import java.util.Iterator;

/**
 * la classe de figure avec iterator.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class FigureIterator implements Iterator<IFigure>{
	/**
	 * La figure géometriques.
	 */
	private Figure figure;
	int index;
	
	/**
	 * Creer une instance de Figure.
	 * @param figure
	 */
	public FigureIterator(Figure figure) {
		this.figure = figure;
		
	}

	@Override
	public boolean hasNext() {
		 if ( index < figure.length ) { 
	            return  true ; 
	         } 
	         return  false ; 
	      }

	@Override
	public IFigure next() {
		if ( this . hasNext ( ) ) { 
            return (IFigure) figure; 
         } 
         return null ; 
      } 		
	}
