package fr.univartois.butinfo.fractals.figure;

/**
 * La classe {@link Figure} englobe toutes les {@link IFigure}.
 *
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class Figure extends AbstractFigure implements IFigureComposite {

	/**
	 * Instance de la classe {@link Rectangle}.
	 */
	private Rectangle rectangle;
	
	/**
	 * Instance de la classe {@link Circle}.
	 */
	private Circle circle;
	
	/**
	 * Instance de la classe {@link Ellipse}.
	 */
	private Ellipse ellipse;
	
	/**
	 * Instance de la classe {@link Chemin}.
	 */
	private Chemin chemin;
	
	/**
	 * Instance de la classe {@link Polyligne}.
	 */
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