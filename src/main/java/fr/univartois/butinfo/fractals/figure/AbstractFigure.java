package fr.univartois.butinfo.fractals.figure;

import java.io.PrintWriter;

/**
 * La classe {@link AbstractFigure} est le composite pour les figures.
 * 
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public abstract class AbstractFigure implements IFigureComposite {

	/**
	 * Rectangle.
	 */
	private Rectangle rectangle;

	/**
	 * Cercle.
	 */
	private Circle circle;

	/**
	 * Ellipse.
	 */
	private Ellipse ellipse;

	/**
	 * Chemin.
	 */
	private Chemin chemin;

	/**
	 * Polyligne.
	 */
	private Polyligne polyligne;

	/**
	 * Nom de la figure.
	 */
	private static String nom;

	/**
	 * Classe principale de la figure.
	 * 
	 * @param args Arguments.
	 */
	public static void main(String[] args) {
		PrintWriter writer1 = new PrintWriter(System.out);
		writer1.write("<svg width=\"100\" height=\"100\">" + create() + "</svg>");
		writer1.flush();
		writer1.close();
	}

	/**
	 * Crée une figure.
	 * 
	 * @return Le nom de la figure.
	 */
	protected static String create() {
		return "" + nom + "";
	}

	/**
	 * Crée un {@link Rectangle}.
	 * 
	 * @return Le {@link Rectangle} en chaîne de caractères.
	 */
	protected String rectangle() {
		return rectangle.toString();
	}

	/**
	 * Crée un {@link Circle}.
	 * 
	 * @return Le {@link Circle} en chaîne de caractères.
	 */
	protected String circle() {
		return circle.toString();
	}

	/**
	 * Crée une {@link Ellipse}.
	 * 
	 * @return L'{@link Ellipse} en chaîne de caractères.
	 */
	protected String ellipse() {
		return ellipse.toString();
	}

	/**
	 * Crée un {@link Polyligne}.
	 * 
	 * @return Le {@link Polyligne} en chaîne de caractères.
	 */
	protected String polyligne() {
		return polyligne.toString();
	}

	/**
	 * Crée un {@link Chemin}.
	 * 
	 * @return Le {@link Chemin} en chaîne de caractères.
	 */
	protected String chemin() {
		return chemin.toString();
	}

}
