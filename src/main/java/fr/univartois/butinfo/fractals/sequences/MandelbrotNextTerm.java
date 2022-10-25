package fr.univartois.butinfo.fractals.sequences;

import fr.univartois.butinfo.fractals.complex.IComplex;

/**
 * La classe {@link MandelbrotNextTerm} correspond à la stratégie (strategy)
 * pour calculer le prochain terme de la suite de Mandelbrot.
 *
 * @author Sébastien Coze
 *
 * @version 0.1.0
 */
public class MandelbrotNextTerm implements INextTerm {

	/**
	 * Premier terme de la suite de Mandelbrot.
	 */
	private IComplex firstTerm;

	/**
	 * Terme courant de la suite.
	 */
	private IComplex presentTerm;

	/**
	 * Nombre complexe z permettant de générer la suite de Mandelbrot.
	 */
	private IComplex z;

	/**
	 * Crée une nouvelle instance de JuliaNextTerm.
	 * 
	 * @param z Le nombre complexe z.
	 */
	public MandelbrotNextTerm(IComplex z) {
		setFirstTerm(z.add(z.multiply(z)));
	}

	@Override
	public void setFirstTerm(IComplex firstTerme) {
		this.firstTerm = firstTerme;
	}

	@Override
	public void setPresentTerm(IComplex presentTerm) {
		this.presentTerm = presentTerm;
	}

	@Override
	public IComplex calculateNextTerm(IComplex lastTerm) {
		if (lastTerm == null)
			return firstTerm;
		else
			return z.add(lastTerm.multiply(z.multiply(z)));
	}

}
