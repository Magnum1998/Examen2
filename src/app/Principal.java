package app;

import clases.TrianguloRectangulo;
/**
 * Clase principal que prueba la clase TrianguloRectangulo.
 * Crea dos triángulos y muestra su área, perímetro e información.
 */
public class Principal {

	public static void main(String[] args) {
		// Crear un triángulo con catetos 2 y 4
		TrianguloRectangulo t1  = new TrianguloRectangulo (2,4);
		// Crear un triángulo con el constructor por defecto (catetos 1 y 1)
		TrianguloRectangulo t2 = new TrianguloRectangulo();
		
		t1.area();
		t2.area();
		t1.perimetro();
		t2.perimetro();
		
	}

}