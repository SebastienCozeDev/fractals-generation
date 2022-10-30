package fr.univartois.butinfo.fractals.figure;

import java.util.ArrayList;
import java.util.List;

public class FigureComposite implements IFigureComposite {

	private List<IFigureComposite> figures = new ArrayList<>();

	@Override
	public String figureString(String forme) {
		StringBuilder bld = new StringBuilder();
		for (IFigureComposite figure : figures) {
			bld.append(figure.figureString(forme));
		}
		return bld.toString();
	}

	public void add(IFigureComposite figure) {
		this.figures.add(figure);
	}

	public void remove(IFigureComposite figure) {
		figures.remove(figure);
	}

}
