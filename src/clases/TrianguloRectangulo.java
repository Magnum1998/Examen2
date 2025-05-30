package clases;
/**
 * Clase que representa un triángulo rectángulo.
 * Permite calcular su área, perímetro e hipotenusa.
 */
public class TrianguloRectangulo {
	private double a;
	private double b;
	private double c;

	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
		this.c=hipotenusa();
	}
	/**
	 * Constructor que recibe los dos catetos.
	 * @param a Cateto a
	 * @param b Cateto b
	 * @throws IllegalArgumentException si alguno de los catetos es <= 0
	 */
	public TrianguloRectangulo(double a, double b) {
		if(a<=0||b<=0) {
			throw new IllegalArgumentException("Los catetos deben ser mayores a 0.");
		}
		this.a = a;
		this.b = b;
		this.c = hipotenusa();
	}
	/**
	 * Calcula el área del triángulo.
	 * @return Área del triángulo
	 */
	public double area () {
		return this.a*this.b/2;
	}
	/**
	 * Calcula y actualiza la hipotenusa usando el teorema de Pitágoras.
	 * @return Valor de la hipotenusa
	 */
	public double hipotenusa () {
		return Math.sqrt(this.a * this.a + this.b * this.b);
	}
	/**
	 * Calcula el perímetro del triángulo.
	 * @return Perímetro del triángulo
	 */
	public double perimetro() {
		double perimetro;
		perimetro=this.a+this.b+hipotenusa();
		return perimetro;
	}
	/**
	 * @return Cateto a
	 */
	public double getA() {
		return a;
	}
	/**
	 * Establece el valor de a
	 * @param a Cateto a
	 */
	public void setA(double a) {
		this.a = a;
	}
	/**
	 * @return Cateto b
	 */
	public double getB() {
		return b;
	}
	/**
	 * Establece el valor de b
	 * @param b Cateto b
	 */
	public void setB(double b) {
		this.b = b;
	}
	/**
	 * @return Hipotenusa c
	 */
	public double getC() {
		return c;
	}
	/**
	 * Establece el valor de c
	 * @param c Hipotenusa c
	 */
	public void setC(double c) {
		this.c = c;
	}
	/**
	 * Devuelve una representación textual del triángulo.
	 * @return Cadena con los valores de los lados
	 */
	@Override
	public String toString() {
		String mensaje="Lado a: "+this.a+", Lado b: "+this.b+", Lado c: "+this.c;
		return mensaje;
	}
}
