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
public class JuliaGeneralizationNextTerm implements INextTerm {

	/**
	 * Premier terme de la suite de Julia.
	 */
	private IComplex firstTerm;

	/**
	 * Terme courant de la suite.
	 */
	private IComplex presentTerm;

	/**
	 * Nombre complexe c permettant de générer la suite de Julia.
	 */
	private IComplex c;
	
	/**
	 * Suite de la strategy.
	 */
	private Sequence sequence;
	
	/**
	 * Opérateur binaire.
	 */
	private BinaryOperator<IComplex> binaryOperator;

	/**
	 * Crée une nouvelle instance de JuliaNextTerm.
	 * 
	 * @param z Le nombre complexe z de la suite de Julia.
	 * @param c Le nombre complexe c de la suite de Julia.
	 */
	public JuliaGeneralizationNextTerm(IComplex z, IComplex c, Sequence sequence, BinaryOperator<IComplex> binaryOperator) {
		this.c = c;
		this.sequence = sequence;
		setFirstTerm(binaryOperator.apply(z, c));
		this.binaryOperator = binaryOperator;
	}

	@Override
	public IComplex calculateNextTerm(IComplex lastTerm) {
		if (lastTerm == null)
			return firstTerm;
		else {
			setPresentTerm(binaryOperator.apply(lastTerm, c));
			return presentTerm;
		}
	}

	@Override
	public void setFirstTerm(IComplex firstTerme) {
		sequence.setFirstTerm(firstTerme);
		this.firstTerm = firstTerme;
	}

	@Override
	public void setPresentTerm(IComplex presentTerm) {
		sequence.setPresentTerm(presentTerm);
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
