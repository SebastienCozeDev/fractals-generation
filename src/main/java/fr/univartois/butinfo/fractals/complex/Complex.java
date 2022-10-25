package fr.univartois.butinfo.fractals.complex;

import java.util.Objects;

/*Classe implementant les operations de nombre complexe */
public class Complex implements IComplex{
	
	private final double re;   // the real part
	private final double im;   // the imaginary part
	
	
	
	public Complex(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}

	@Override
	public double getRealPart() {
		return this.re;
	}



	@Override
	public double getImaginaryPart() {
		return this.im;
	}

	@Override
	public double abs() {
		return Math.hypot(re,im);
	}

	@Override
    public IComplex negate() {
        return new Complex(this.re * (-1), this.im * (-1));
    }

	@Override
	public IComplex conjugate() {
		return new Complex(re,-im);
	}

	@Override
	public IComplex add(IComplex c) {
		return new Complex(this.re+c.getRealPart(),this.im+c.getImaginaryPart());
		
	}
	

	@Override
	public IComplex subtract(IComplex c) {
		return new Complex(this.re-c.getRealPart(),this.im-c.getImaginaryPart());
	}


	@Override
    public IComplex multiply(double c) {
        return new Complex(this.re * c, this.im * c);
    }
	
	@Override
	public IComplex multiply(IComplex c) {
		double real = this.re * c.getRealPart() -this.im * c.getImaginaryPart();
        double img = this.re * c.getImaginaryPart() + this.im * c.getRealPart();
        return new Complex(real, img);
	}
	
	

	@Override
	public IComplex divide(IComplex c) {
		double denominateur = (c.getRealPart()*c.getRealPart()) + (c.getImaginaryPart()*c.getImaginaryPart());
		double a = (this.re*c.getRealPart()+ this.im*c.getImaginaryPart())/denominateur;
		double b = (-this.re * c.getImaginaryPart()+ this.im*c.getRealPart())/denominateur;
		return new Complex(a, b);
	}
	
	public boolean equals(Object x) {
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Complex that = (Complex) x;
        return (this.re == that.re) && (this.im == that.im);
    }
	
    public int hashCode() {
        return Objects.hash(re, im);
    }
    @Override
    public String toString() {
        return this.re + " + " + this.im + "i";
    }

	

}
