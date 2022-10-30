package fr.univartois.butinfo.fractals.figure;

import java.io.PrintWriter;

public abstract class AbstractFigure implements IFigureComposite {

	private Rectangle rectangle;
	private Circle circle;
	private Ellipse ellipse;
	private Chemin chemin;
	private Polyligne polyligne;
	private static String nom;

	public static void main(String[] args) {

		PrintWriter writer1 = new PrintWriter(System.out);
		writer1.write("<svg width=\"100\" height=\"100\">" + create() + "</svg>");
		writer1.flush();
		writer1.close();
	}

	protected static String create() {
		return "" + nom + "";
	}

	protected String rectangle() {
		return rectangle.ToString();
	}

	protected String circle() {
		return circle.ToString();
	}

	protected String ellipse() {
		return ellipse.ToString();
	}

	protected String polyligne() {
		return polyligne.ToString();
	}

	protected String chemin() {
		return chemin.ToString();
	}

}
