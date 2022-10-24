package fr.univartois.butinfo.fractals.sequences;

import fr.univartois.butinfo.fractals.complex.IComplex;

public class JuliaNextTerm implements INextTerm {

	private IComplex firstTerm;
	
	private IComplex presentTerm;
	
	private IComplex z;
	
	private IComplex c;
	
	public JuliaNextTerm(IComplex z, IComplex c) {
		firstTerm = c.add(z.multiply(z));
	}
	
	@Override
	public IComplex calculateNextTerm(IComplex lastTerm) {
		if (presentTerm == null)
			return firstTerm;
		else
			return c.add(lastTerm.multiply(z.multiply(z)));
	}

	@Override
	public void setFirstTerm(IComplex firstTerme) {
		this.firstTerm = firstTerme;
	}

	@Override
	public void setPresentTerm(IComplex presentTerm) {
		this.presentTerm = presentTerm;
	}
	
}
