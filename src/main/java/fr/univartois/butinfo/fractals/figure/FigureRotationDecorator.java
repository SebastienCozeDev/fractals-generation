package fr.univartois.butinfo.fractals.figure;

public class FigureRotationDecorator implements IFigure {

	/**
	 * Valeur de la rotation.
	 */
	private int x;
	/**
	 * Constructeur.
	 * @param x
	 */
	public FigureRotationDecorator(int x) {
		super();
		this.x = x;
	}

	@Override
	public String ToString() {
		return "transform= rotate(" + x + ")";
	}

}
