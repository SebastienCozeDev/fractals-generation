package fr.univartois.butinfo.fractals.figure;

/**
 * La classe qui englobe toute les figures.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class Figure extends AbstractFigure implements IFigureComposite {

	private Rectangle rectangle;
	private Circle circle;
	private Ellipse ellipse;
	private Chemin chemin;
	private Polyligne polyligne;

	@Override
	public String figureString(String forme) {
		return "Toutes les formes " + forme;
	}

	@Override
	public String rectangle() {
		return rectangle.toString();
	}

	@Override
	protected String circle() {
		return circle.toString();
	}

	@Override
	protected String ellipse() {
		return ellipse.toString();
	}

	@Override
	protected String polyligne() {
		return polyligne.toString();
	}

	@Override
	protected String chemin() {
		return chemin.toString();
	}

}