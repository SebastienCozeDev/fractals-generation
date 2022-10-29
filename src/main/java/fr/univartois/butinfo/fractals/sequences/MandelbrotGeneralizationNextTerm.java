package fr.univartois.butinfo.fractals.sequences;

import java.util.function.BinaryOperator;

import fr.univartois.butinfo.fractals.complex.IComplex;

/**
 * La classe JuliaNextTerm correspond à la stratégie (strategy) pour calculer le
 * prochain terme de la suite de Julia.
 *
 * @author Sébastien Coze
 *
 * @version 0.1.0
 */
public class MandelbrotGeneralizationNextTerm implements INextTerm {

	/**
	 * Premier terme de la suite de Julia.
	 */
	private IComplex firstTerm;

	/**
	 * Terme courant de la suite.
	 */
	private IComplex presentTerm;

	/**
	 * Nombre complexe z permettant de générer la suite de Julia.
	 */
	private IComplex z;
	
	/**
	 * Opérateur binaire.
	 */
	private BinaryOperator<IComplex> binaryOperator;

	/**
	 * Crée une nouvelle instance de JuliaNextTerm.
	 * 
	 * @param z Le nombre complexe z de la suite de Mandelbrot.
	 * @param c Le nombre complexe c de la suite de Mandelbrot.
	 */
	public MandelbrotGeneralizationNextTerm(IComplex z, BinaryOperator<IComplex> binaryOperator) {
		this.z = z;
		this.binaryOperator = binaryOperator;
		setFirstTerm(binaryOperator.apply(z, z));
	}

	@Override
	public IComplex calculateNextTerm(IComplex lastTerm) {
		if (lastTerm == null) {
			//System.out.println("On est ici.");
			setPresentTerm(binaryOperator.apply(getPresentTerm(), z));
			return presentTerm;	
		}
		else {
			setPresentTerm(binaryOperator.apply(lastTerm, z));
			return presentTerm;
		}
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
	public IComplex getFirstTerm() {
		return firstTerm;
	}

	@Override
	public IComplex getPresentTerm() {
		return presentTerm;
	}
	
	/* Pour la création (exemple) :
	new JuliaGeneralizationNextTerm(z, c, (z, c) -> z.add(c))
	*/

}
