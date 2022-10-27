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
	public void figureString(String forme) {
		System.out.println("toutes les formes" + forme);
	}

	public String Rectangle() {
		return rectangle.ToString();
	}

	protected String Circle() {
		return circle.ToString();
	}

	protected String Ellipse() {
		return ellipse.ToString();
	}

	protected String Polyligne() {
		return polyligne.ToString();
	}

	protected String Chemin() {
		return chemin.ToString();
	}

}