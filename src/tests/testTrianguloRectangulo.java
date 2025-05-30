package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

public class testTrianguloRectangulo {
	TrianguloRectangulo t1 = new TrianguloRectangulo();
	TrianguloRectangulo t2 = new TrianguloRectangulo(2,4);
	
	@Test
	public void testCalcularHipotenusat1() {
		double hip = t1.hipotenusa();
	}
	@Test
	public void testCalcularHipotenusatt2() {
		double hip = t2.hipotenusa();
	}
	@Test
	public void testCalcularAreat1() {
		double area = t1.area();
	}
	@Test
	public void testCalcularAreat2() {
		double area = t2.area();
	}
	@Test
	public void testCalcularPerimetrot1() {
		double perimetro = t1.perimetro();
	}
	@Test
	public void testCalcularPerimetrot2() {
		double perimetro = t2.perimetro();
	}
	@Test
	public void testCatetoNegativo() {
		  Exception ex = assertThrows(IllegalArgumentException.class, () -> {
			TrianguloRectangulo t3 = new TrianguloRectangulo(-2,4);
		});
		  assertEquals("Los catetos deben ser mayores que cero.", ex.getMessage());

	}
	
}
