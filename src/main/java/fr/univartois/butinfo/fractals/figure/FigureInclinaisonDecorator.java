package fr.univartois.butinfo.fractals.figure;

public class FigureInclinaisonDecorator implements IFigure {

	/**
	 * Angle x qui détermine dans quelle mesure l'élément sera incliné.
	 */
	private int x;
	
	@Override
	public String ToString() {
		return "transform= skewX("+x+")";
	}

}
