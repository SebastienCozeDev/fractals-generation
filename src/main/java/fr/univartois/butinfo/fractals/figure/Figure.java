package fr.univartois.butinfo.fractals.figure;


/**
 * La classe qui englobe toute les figures.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class Figure extends AbstractFigure implements IFigureComposite  {

	@Override
	public void figureString(String forme) {
		System.out.println("toutes les formes"+forme);
}
}