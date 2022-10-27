package fr.univartois.butinfo.fractals.figure;

import java.util.ArrayList;
import java.util.List;

public class FigureComposite implements IFigureComposite {

	private List<IFigureComposite> figures = new ArrayList<>();

	@Override
	public void figureString(String forme) {
		for (IFigureComposite figure : figures) {
		      figure.figureString(forme);
	}
		}
	
	public void add (IFigureComposite figure) {
		 this.figures.add(figure);
	}
	public void remove (IFigureComposite figure) {
		 figures.remove(figure);
	}
	
}
