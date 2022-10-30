package fr.univartois.butinfo.fractals.figure;

/**
 * La classe {@link Polyligne} correspond à une {@link IFigure} d'un polyligne.
 *
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class Polyligne implements IFigure {

	/**
	 * Couleur du polyligne.
	 */
	private String stroke;

	/**
	 * Largeur.
	 */
	private int strokeWidth;

	/**
	 * {@link IFigure} décoré.
	 */
	private IFigure decorated;

	/**
	 * Crée une instance de {@link Polyligne}.
	 * 
	 * @param stroke Couleur du polyligne.
	 */
	public Polyligne(String stroke) {
		this.stroke = stroke;
	}

	@Override
	public String toString() {
		return "< points=\"50 160 55 180 70 180 60 190 65 205 50 195 35 205 40 190 30 180 45 180\"" + ", stroke="
				+ stroke + ", strokeWidth=" + strokeWidth + decorated + "/>";
	}
}
