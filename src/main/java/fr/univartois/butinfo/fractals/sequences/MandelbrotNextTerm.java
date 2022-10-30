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
	 * Suite de la strategy.
	 */
	private Sequence sequence;

	/**
	 * Crée une nouvelle instance de JuliaNextTerm.
	 * 
	 * @param z       Le nombre complexe z.
	 * @param s
	 * @param complex
	 */
	public MandelbrotNextTerm(IComplex z, Sequence sequence) {
		this.z = z;
		this.sequence = sequence;
		setFirstTerm(z.add(z.multiply(z)));
	}

	@Override
	public IComplex calculateNextTerm(IComplex lastTerm) {
		if (lastTerm == null)
			return (sequence.getPresentTerm().multiply(sequence.getPresentTerm())).add(z);
		else
			return lastTerm.multiply(lastTerm).add(z);
	}

	@Override
	public IComplex getFirstTerm() {
		return firstTerm;
	}

	@Override
	public void setFirstTerm(IComplex firstTerme) {
		this.firstTerm = firstTerme;
		sequence.setFirstTerm(firstTerme);
		sequence.setPresentTerm(firstTerme);
	}

	@Override
	public IComplex getPresentTerm() {
		return presentTerm;
	}

	@Override
	public void setPresentTerm(IComplex presentTerm) {
		this.presentTerm = presentTerm;
	}

}
