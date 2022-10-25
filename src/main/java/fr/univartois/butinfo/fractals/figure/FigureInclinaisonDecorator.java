package fr.univartois.butinfo.fractals.figure;

public class FigureInclinaisonDecorator implements IFigure {

	/**
	 * Angle x qui d�termine dans quelle mesure l'�l�ment sera inclin�.
	 */
	private int x;
	
	@Override
	public String ToString() {
		return "transform= skewX("+x+")";
	}

}
