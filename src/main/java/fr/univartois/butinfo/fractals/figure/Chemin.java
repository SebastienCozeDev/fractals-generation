package fr.univartois.butinfo.fractals.figure;

/**
 * La figure Chemin.
 *
 * @author Theo Journee
 *
 * @version 0.1.0
 */
public class Chemin implements IFigure {


	/**
	 * position.
	 */
	private int x;

	/**
	 * Couleur du chemin.
	 */
	private String stroke;

	/**
	 * largeur.
	 */
	private int strokeWidth;
	
	private IFigure decorated;
	


	@Override
	public String ToString() {
		return "< path d=\"M20,230 Q40,205 50,230 T90,230\""
				+ ", stroke=" + stroke + ", strokeWidth=" + strokeWidth +  decorated + "/>";
	}
}

