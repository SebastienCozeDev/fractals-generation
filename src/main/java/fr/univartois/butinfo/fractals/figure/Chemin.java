package fr.univartois.butinfo.fractals.figure;

/**
 * La classe {@link Chemin} corrospond à une {@link IFigure} de chemin.
 *
 * @author Théo Journée
 *
 * @version 0.1.0
 */
public class Chemin implements IFigure {

	/**
	 * Couleur du {@link Chemin}.
	 */
	private String stroke;

	/**
	 * Largeur du {@link Chemin}.
	 */
	private int strokeWidth;

	/**
	 * {@link IFigure} décoré.
	 */
	private IFigure decorated;

	@Override
	public String toString() {
		return "< path d=\"M20,230 Q40,205 50,230 T90,230\"" + ", stroke=" + stroke + ", strokeWidth=" + strokeWidth
				+ decorated + "/>";
	}
}
