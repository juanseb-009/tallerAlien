package testAliens;

import ProyectoAliens.Aliens;

public class TestAliens {

	public static void main(String[] args) {

		// Primer alien: tamaño dentro del rango permitido
		Aliens alien1 = new Aliens(20, "Verde");

		// Segundo alien: tamaño superior al máximo permitido
		Aliens alien2 = new Aliens(40, "Azul");

		// Imprimir información del primer alien
		System.out.println("ALIEN 1");
		alien1.imprimir();

		// Imprimir información del segundo alien
		System.out.println("\nALIEN 2");
		alien2.imprimir();

		// TODO Auto-generated method stub

	}

}
