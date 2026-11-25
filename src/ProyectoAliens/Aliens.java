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
	
}
