package fr.univartois.butinfo.fractals.complex;

/*L'interface qui permet d'implementer des methodes pour l'adaptateur */

public interface IPlanPoint {
	  public double X();
	  public double Y();
	  public double distance(IPlanPoint point);
	  public IComplex convertirEnIComplex();

}
