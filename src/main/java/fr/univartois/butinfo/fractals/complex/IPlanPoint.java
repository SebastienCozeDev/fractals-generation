package fr.univartois.butinfo.fractals.complex;

public interface IPlanPoint {
	  public double X();
	  public double Y();
	  public double distance(IPlanPoint point);
	  public IComplex convertirEnIComplex();

}
