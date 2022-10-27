package fr.univartois.butinfo.fractals.figure;

import java.io.PrintWriter;

public abstract class AbstractFigure implements IFigureComposite {
	
	private Rectangle rectangle;
	private Circle circle;
	private Ellipse ellipse;
	private Chemin chemin;
	private Polyligne polyligne;
	private static  String nom;
	private static Figure figure;
	
	public static void main(String[] args) throws Exception {

		PrintWriter writer1 = new PrintWriter(System.out);
		writer1.write("<svg width=\"100\" height=\"100\">" + create(5) + "</svg>");
		writer1.flush();
		writer1.close();
	}

	protected static String create(int nbiterations) {
		for (int i = 0;i > nbiterations;i++) {
			String rectangles =figure.Rectangle();
			String circles =figure.Circle();
			String ellipse=figure.Ellipse();
			String chemins=figure.Chemin();
			}
		return ""+nom+"" ;
		}
	
	protected String Rectangle() {
		return rectangle.ToString();
	}

	protected String Circle() {
		return circle.ToString();
	}

	protected String Ellipse() {
		return ellipse.ToString();
	}

	protected String Polyligne() {
		return polyligne.ToString();
	}

	protected String Chemin() {
		return chemin.ToString();
	}


}
