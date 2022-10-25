package fr.univartois.butinfo.fractals.figure;

import java.util.Iterator;


public class Figure implements Iterable<IFigure>{

	public int length;

	public Iterator<IFigure> iterator() {
		return new FigureIterator(this);
	}

}
