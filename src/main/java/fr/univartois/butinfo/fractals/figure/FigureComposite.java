package fr.univartois.butinfo.fractals.figure;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe {@link FigureComposite} correspond au composite de la classe
 * {@link Figure}.
 * 
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class FigureComposite implements IFigureComposite {

	/**
	 * Instance de {@link List} correspondant à la liste des
	 * {@link IFigureComposite}.
	 */
	private List<IFigureComposite> figures = new ArrayList<>();

	@Override
	public String figureString(String forme) {
		StringBuilder bld = new StringBuilder();
		for (IFigureComposite figure : figures) {
			bld.append(figure.figureString(forme));
		}
		return bld.toString();
	}

	/**
	 * Ajouter une instance de {@link IFigureComposite} dans la liste des figures.
	 * 
	 * @param figure La figure a ajouté.
	 */
	public void add(IFigureComposite figure) {
		this.figures.add(figure);
	}

	/**
	 * Supprimer une instance de {@link IFigureComposite} dans la liste des figures.
	 * 
	 * @param figure La figure à supprimer.
	 */
	public void remove(IFigureComposite figure) {
		figures.remove(figure);
	}

}
