package fr.univartois.butinfo.fractals.figure;

public class FigureTranslationDecorator implements IFigure {

	/**
	 * position x.
	 */
	private int x;

	/**
	 * position y.
	 */
	private int y;

	/**
	 * Constructeur.
	 * 
	 * @param x
	 * @param y
	 */
	public FigureTranslationDecorator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String ToString() {
		return "transform= translate("+x+","+y+")";
	}

}
