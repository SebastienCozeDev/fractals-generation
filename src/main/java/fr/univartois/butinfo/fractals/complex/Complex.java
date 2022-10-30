package fr.univartois.butinfo.fractals.complex;

import java.util.Objects;

/**
 * La classe {@link Complex} implémente les opérations des nombres complexes.
 * 
 * @author Shahin Shakuri
 * 
 * @version 0.1.0
 */
public class Complex implements IComplex {

	/**
	 * Partie réel du nombre complexe.
	 */
	private final double re;

	/**
	 * Partie imaginaire du nombre complexe.
	 */
	private final double im;

	/**
	 * Crée une instance de {@link Complex}.
	 * 
	 * @param re Partie réel du nombre complexe.
	 * 
	 * @param im Partie imaginaire du nombre complexe.
	 */
	public Complex(double re, double im) {
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
		return Math.sqrt(re * re + im * im);
	}

	@Override
	public IComplex negate() {
		return new Complex(this.re * (-1), this.im * (-1));
	}

	@Override
	public IComplex conjugate() {
		return new Complex(re, -im);
	}

	@Override
	public IComplex add(IComplex c) {
		return new Complex(this.re + c.getRealPart(), this.im + c.getImaginaryPart());

	}

	@Override
	public IComplex subtract(IComplex c) {
		return new Complex(this.re - c.getRealPart(), this.im - c.getImaginaryPart());
	}

	@Override
	public IComplex multiply(double c) {
		return new Complex(this.re * c, this.im * c);
	}

	@Override
	public IComplex multiply(IComplex c) {
		double real = this.re * c.getRealPart() - this.im * c.getImaginaryPart();
		double img = this.re * c.getImaginaryPart() + this.im * c.getRealPart();
		return new Complex(real, img);
	}

	@Override
	public IComplex divide(IComplex c) {
		double denominateur = (c.getRealPart() * c.getRealPart()) + (c.getImaginaryPart() * c.getImaginaryPart());
		double a = (this.re * c.getRealPart() + this.im * c.getImaginaryPart()) / denominateur;
		double b = (-this.re * c.getImaginaryPart() + this.im * c.getRealPart()) / denominateur;
		return new Complex(a, b);
	}

	@Override
	public boolean equals(Object x) {
		if (x == null)
			return false;
		if (this.getClass() != x.getClass())
			return false;
		Complex that = (Complex) x;
		return (this.re == that.re) && (this.im == that.im);
	}

	@Override
	public int hashCode() {
		return Objects.hash(re, im);
	}

	@Override
	public String toString() {
		return this.re + " + " + this.im + "i";
	}

}
