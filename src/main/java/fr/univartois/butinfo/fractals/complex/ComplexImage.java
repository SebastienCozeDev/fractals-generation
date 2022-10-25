package fr.univartois.butinfo.fractals.complex;

public  class ComplexImage {
	
	private final double re;   // the real part
	private final double im;   // the imaginary part
	
	private int height;
	private int width;
	
	
	
	
	public int getHeight() {
		return height;
	}



	public int getWidth() {
		return width;
	}

	public double getRe() {
		return re;
	}


	public double getIm() {
		return im;
	}


	public ComplexImage(double re, double im, int height, int width) {
		super();
		this.re = re;
		this.im = im;
		this.height = height;
		this.width = width;
	}

	
	public IComplex asComplex(int row, int column) {
		 double re = (column + .5) - (width / 2.);
		 double im = (height / 2.) - (row + .5);
		 return new Complex(re, im);
		}


	
	
	
	








	
	
	}
