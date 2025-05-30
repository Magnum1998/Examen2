package clases;
/**
 * @param a
 * @param b
 * @param c
 */
public class TrianguloRectangulo {
	double a;
	double b;
	double c;

	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
		this.c=hipotenusa();
	}
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public TrianguloRectangulo(double a, double b) {
		this.a = a;
		this.b = b;
		this.c = hipotenusa();
	}
	/**
	 * @return area
	 */
	public double area () {
		double area;
		area=this.a*this.b/2;
		return area;
	}
	/**
	 * @return this.c
	 */
	public double hipotenusa () {
		this.c=Math.sqrt(this.a * this.a + this.b * this.b);
		return this.c;
	}
	/**
	 * @return perimetro
	 */
	public double perimetro() {
		double perimetro;
		perimetro=this.a+this.b+hipotenusa();
		return perimetro;
	}
	/**
	 * @return a
	 */
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	/**
	 * @return b
	 */
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	/**
	 * @return c
	 */
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	@Override
	public String toString() {
		String mensaje="Lado a: "+this.a+", Lado b: "+this.b+", Lado c: "+this.c;
		return mensaje;
	}
}
