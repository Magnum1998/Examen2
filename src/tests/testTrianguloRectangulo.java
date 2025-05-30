package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import clases.TrianguloRectangulo;
/**
 * Clase de pruebas para TrianguloRectangulo.
 * Se comprueban cálculos de área, perímetro, hipotenusa y validación de entradas.
 */
public class testTrianguloRectangulo {
	TrianguloRectangulo t1 = new TrianguloRectangulo(3,4);
	TrianguloRectangulo tdefecto = new TrianguloRectangulo();
	
	@Test
	public void testCalcularHipotenusat1() {
		assertEquals(5, t1.hipotenusa(), 0.0001);
	}
	
	@Test
	public void testCalcularHipotenusatdefecto() {

		assertEquals(Math.sqrt(2), tdefecto.hipotenusa(), 0.0001);
	}
	
	@Test
	public void testCalcularAreat1() {
		assertEquals(3*4/2, t1.area(), 0.0001);
	}
	
	@Test
	public void testCalcularAreatdefecto() {
		assertEquals(0.5, tdefecto.area(), 0.0001);
	}
	
	@Test
	public void testCalcularPerimetrot1() {
		assertEquals(3+4+5, t1.perimetro(), 0.0001);
	}
	
	@Test
	public void testCalcularPerimetrotdefecto() {
		assertEquals(1+1+Math.sqrt(2), tdefecto.perimetro(), 0.0001);
	}
	
	@Test
	public void testCatetoNegativo() {
		  Exception ex = assertThrows(IllegalArgumentException.class, () -> {
			new TrianguloRectangulo(-2,4);
		});
		  assertEquals("Los catetos deben ser mayores a 0.", ex.getMessage());

	}
	
}
