package fr.univartois.butinfo.fractals.figure;

/**
 * La classe Polyligne figure.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class Polyligne implements IFigure {

	/**
	 * Couleur du polyligne.
	 */
	private String stroke;

	/**
	 * largeur.
	 */
	private int strokeWidth;
	
	private IFigure decorated;
	
	public Polyligne(String stroke) {
		this.stroke = stroke;
	}

	@Override
	public String ToString() {
		return "< points=\"50 160 55 180 70 180 60 190 65 205 50 195 35 205 40 190 30 180 45 180\""
				+ ", stroke=" + stroke + ", strokeWidth=" + strokeWidth +  decorated + "/>";
	}
}
