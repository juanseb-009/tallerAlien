package PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ProyectoAliens.Aliens;

public class PruebasConIa {

	// Verificar tamaño inferior al mínimo
	@Test
	public void tamanioInferiorAlMinimo() {

		Aliens alien = new Aliens(0, "Blanco");

		assertEquals(5, alien.getTamanio());

	}

	// Verificar tamaño negativo
	@Test
	public void tamanioNegativo() {

		Aliens alien = new Aliens(-10, "Negro");

		assertEquals(5, alien.getTamanio());

	}

	// Verificar tamaño superior al máximo
	@Test
	public void tamanioSuperiorAlMaximo() {

		Aliens alien = new Aliens(100, "Morado");

		assertEquals(30, alien.getTamanio());

	}

	// Verificar un tamaño válido
	@Test
	public void tamanioDentroDelRango() {

		Aliens alien = new Aliens(15, "Amarillo");

		assertEquals(15, alien.getTamanio());

	}

	// Verificar que se conserve el color
	@Test
	public void asignacionColor() {

		Aliens alien = new Aliens(10, "Naranja");

		assertEquals("Naranja", alien.getColor());

	}

	// Verificar precios con tamaño mínimo
	@Test
	public void preciosConTamanioMinimo() {

		Aliens alien = new Aliens(1, "Azul");

		assertEquals(5, alien.getTamanio());
		assertEquals(1.0, alien.getPrecioCuerpo(), 0.001);
		assertEquals(0.5, alien.getPrecioExtremidad(), 0.001);
		assertEquals(0.25, alien.getPrecioOjo(), 0.001);

	}

	// Verificar precios con tamaño máximo
	@Test
	public void preciosConTamanioMaximo() {

		Aliens alien = new Aliens(60, "Verde");

		assertEquals(30, alien.getTamanio());
		assertEquals(6.0, alien.getPrecioCuerpo(), 0.001);
		assertEquals(3.0, alien.getPrecioExtremidad(), 0.001);
		assertEquals(1.5, alien.getPrecioOjo(), 0.001);

	}

//CASOS VÁLIDOS

	@Test
	public void testAgregarBrazos() {

		Aliens alien = new Aliens(20, "Verde");

		assertTrue(alien.agregarBrazos(3));
		assertEquals(3, alien.getNumeroBrazos());

	}

	@Test
	public void testAgregarPiernas() {

		Aliens alien = new Aliens(20, "Azul");

		assertTrue(alien.agregarPiernas(4));
		assertEquals(4, alien.getNumeroPies());

	}

//CASOS LÍMITE

	@Test
	public void testLimiteExactoExtremidades() {

		Aliens alien = new Aliens(20, "Rojo");

		assertTrue(alien.agregarBrazos(5));
		assertTrue(alien.agregarPiernas(5));

		assertEquals(5, alien.getNumeroBrazos());
		assertEquals(5, alien.getNumeroPies());

	}

	@Test
	public void testSuperarLimiteExtremidades() {

		Aliens alien = new Aliens(20, "Amarillo");

		assertTrue(alien.agregarBrazos(6));
		assertTrue(alien.agregarPiernas(5));

		assertEquals(6, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());

	}

//CASOS COMBINADOS

	@Test
	public void testAgregarBrazosYLuegoPiernas() {

		Aliens alien = new Aliens(20, "Morado");

		assertTrue(alien.agregarBrazos(4));
		assertTrue(alien.agregarPiernas(3));

		assertEquals(4, alien.getNumeroBrazos());
		assertEquals(3, alien.getNumeroPies());

	}


}
