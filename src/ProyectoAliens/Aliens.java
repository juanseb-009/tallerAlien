
package ProyectoAliens;

public class Aliens {
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;

	private double precioTotal = 0;

	public Aliens(int tamanio, String color) {

		// Validación del tamaño

		if (tamanio < 5) {
			this.tamanio = 5;

		} else if (tamanio > 30) {
			this.tamanio = 30;

		} else {
			this.tamanio = tamanio;

		}

		// Asignación del color

		this.color = color;

		// Cálculo de precios

		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;

	}

	public void imprimir() {

		System.out.println("===== INFORMACIÓN DEL ALIEN =====");
		System.out.println("Tamaño: " + tamanio + " cm");
		System.out.println("Color: " + color);
		System.out.println("Número de ojos: " + numeroOjos);
		System.out.println("Número de brazos: " + numeroBrazos);
		System.out.println("Número de pies: " + numeroPies);
		System.out.println("\n===== PRECIOS =====");
		System.out.println("Precio del cuerpo: $" + precioCuerpo);
		System.out.println("Precio por extremidad: $" + precioExtremidad);
		System.out.println("Precio por ojo: $" + precioOjo);
		System.out.println("Precio total: $" + precioTotal);

	}

	// Método para calcular el precio total

	public void calcularPrecioTotal() {

		precioTotal = precioCuerpo + ((numeroBrazos + numeroPies) * precioExtremidad) + (numeroOjos * precioOjo);

	}

	// Método para agregar brazos

	public boolean agregarBrazos(int cantidad) {

		if (numeroBrazos + numeroPies + cantidad <= 10 && cantidad > 0) {
			numeroBrazos += cantidad;

			calcularPrecioTotal();
			return true;

		} else {
			return false;

		}

	}

	// Método para agregar piernas

	public boolean agregarPiernas(int cantidad) {

		if (numeroBrazos + numeroPies + cantidad <= 10 && cantidad > 0) {
			numeroPies += cantidad;

			calcularPrecioTotal();
			return true;

		} else {
			return false;

		}

	}

	// Método para agregar ojos

	public boolean agregarOjos(int cantidad) {
		int maximoOjos;

		if (tamanio >= 5 && tamanio <= 10) {
			maximoOjos = 3;

		} else if (tamanio > 10 && tamanio <= 20) {
			maximoOjos = 5;

		} else {
			maximoOjos = 7;

		}

		if (numeroOjos + cantidad <= maximoOjos && cantidad > 0) {
			numeroOjos += cantidad;

			calcularPrecioTotal();
			return true;

		} else {

			return false;
		}

	}

	public int getTamanio() {
		return tamanio;

	}

	public String getColor() {
		return color;

	}

	public int getNumeroOjos() {
		return numeroOjos;

	}

	public int getNumeroBrazos() {
		return numeroBrazos;

	}

	public int getNumeroPies() {
		return numeroPies;

	}

	public double getPrecioExtremidad() {
		return precioExtremidad;

	}

	public double getPrecioOjo() {
		return precioOjo;

	}

	public double getPrecioCuerpo() {
		return precioCuerpo;

	}

	// Nuevo getter (precioTotal)

	public double getPrecioTotal() {

		return precioTotal;

	}

}
