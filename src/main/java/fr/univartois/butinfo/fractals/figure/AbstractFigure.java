package fr.univartois.butinfo.fractals.figure;

import java.io.PrintWriter;

public abstract class AbstractFigure implements IFigureComposite {
	
	   
	
	
	public static void main(String[] args) throws Exception {
	    
	    PrintWriter writer1 = new PrintWriter(System.out);
	    writer1.write("<svg width=\"100\" height=\"100\">"+
	    		
	    		+"</svg>");
	    
	    
	    writer1.flush();
	    writer1.close();
}
	
	public String create() {
		IFigureComposite rectangle = (IFigureComposite) new Rectangle(0, 0, 0, 0, 0, 0, null, null, 0);
		IFigureComposite circle= (IFigureComposite) new Circle(0, 0, 0, "black", "transparent",0);
		FigureComposite figureComposite = new FigureComposite();
		figureComposite.add(rectangle);
		return ""+rectangle+"";
	}
}
