package PruebasUnitarias;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ProyectoAliens.Aliens;

public class PruebasJUnit {
	

	
		// Prueba de asignación de atributos
		@Test
		public void testAsignacionAtributos() {

			Aliens alien = new Aliens(20, "Verde");

			assertEquals(20, alien.getTamanio());
			assertEquals("Verde", alien.getColor());

		}


		// Prueba del tamaño mínimo
		@Test
		public void testTamanioMinimo() {

			Aliens alien = new Aliens(2, "Azul");

			assertEquals(5, alien.getTamanio());

		}


		// Prueba del tamaño máximo
		@Test
		public void testTamanioMaximo() {

			Aliens alien = new Aliens(40, "Rojo");

			assertEquals(30, alien.getTamanio());

		}


		// Prueba de los límites exactos
		@Test
		public void testLimitesExactos() {

			Aliens alienMinimo = new Aliens(5, "Verde");
			Aliens alienMaximo = new Aliens(30, "Azul");

			assertEquals(5, alienMinimo.getTamanio());
			assertEquals(30, alienMaximo.getTamanio());

		}


		// Prueba del cálculo de precios
		@Test
		public void testCalculoPrecios() {

			Aliens alien = new Aliens(20, "Verde");

			assertEquals(4.0, alien.getPrecioCuerpo(), 0.001);
			assertEquals(2.0, alien.getPrecioExtremidad(), 0.001);
			assertEquals(1.0, alien.getPrecioOjo(), 0.001);

		}


		// Prueba de precios cuando el tamaño se ajusta al máximo
		@Test
		public void testPreciosConTamanioAjustado() {

			Aliens alien = new Aliens(50, "Morado");

			assertEquals(30, alien.getTamanio());
			assertEquals(6.0, alien.getPrecioCuerpo(), 0.001);
			assertEquals(3.0, alien.getPrecioExtremidad(), 0.001);
			assertEquals(1.5, alien.getPrecioOjo(), 0.001);

		}

}
