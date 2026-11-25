
package testAliens;

import ProyectoAliens.Aliens;

public class TestAliens {

    public static void main(String[] args) {

        // ==========================================
        // CREACION DE ALIENS
        // ==========================================

        // Primer alien: tamaño dentro del rango permitido
        Aliens alien1 = new Aliens(20, "Verde");

        // Segundo alien: tamaño superior al máximo permitido
        Aliens alien2 = new Aliens(40, "Azul");

        // Imprimir información del primer alien
        System.out.println("========== ALIEN 1 ==========");
        alien1.imprimir();

        // Imprimir información del segundo alien
        System.out.println("\n========== ALIEN 2 ==========");
        alien2.imprimir();


        // ==========================================
        // 1. CALCULO DEL PRECIO TOTAL
        // ==========================================

        System.out.println("\n========== PRECIO TOTAL ==========");

        alien1.agregarBrazos(2);
        alien1.agregarPiernas(2);
        alien1.agregarOjos(3);

        System.out.println("Precio despues de agregar elementos: $"
                + alien1.getPrecioTotal());


        // ==========================================
        // 2. COMPORTAMIENTO AL AGREGAR ELEMENTOS
        // ==========================================

        System.out.println("\n========== AGREGAR ELEMENTOS ==========");

        Aliens alien3 = new Aliens(15, "Morado");

        System.out.println("Agregar 3 brazos: "
                + alien3.agregarBrazos(3));

        System.out.println("Agregar 2 piernas: "
                + alien3.agregarPiernas(2));

        System.out.println("Agregar 4 ojos: "
                + alien3.agregarOjos(4));

        System.out.println("Brazos actuales: "
                + alien3.getNumeroBrazos());

        System.out.println("Piernas actuales: "
                + alien3.getNumeroPies());

        System.out.println("Ojos actuales: "
                + alien3.getNumeroOjos());


        // ==========================================
        // 3. RESTRICCIONES DE NEGOCIO
        // ==========================================

        System.out.println("\n========== RESTRICCIONES ==========");

        // Restriccion de extremidades
        Aliens alien4 = new Aliens(20, "Rojo");

        System.out.println("Agregar 6 brazos: "
                + alien4.agregarBrazos(6));

        System.out.println("Agregar 5 piernas: "
                + alien4.agregarPiernas(5));

        System.out.println("Total de extremidades: "
                + (alien4.getNumeroBrazos() + alien4.getNumeroPies()));


        // Restriccion de ojos
        Aliens alien5 = new Aliens(10, "Amarillo");

        System.out.println("\nAgregar 3 ojos: "
                + alien5.agregarOjos(3));

        System.out.println("Agregar 1 ojo adicional: "
                + alien5.agregarOjos(1));

        System.out.println("Ojos actuales: "
                + alien5.getNumeroOjos());


        // Restriccion de cantidades invalidas
        Aliens alien6 = new Aliens(20, "Blanco");

        System.out.println("\nAgregar -2 brazos: "
                + alien6.agregarBrazos(-2));

        System.out.println("Agregar 0 piernas: "
                + alien6.agregarPiernas(0));

        System.out.println("Agregar -1 ojo: "
                + alien6.agregarOjos(-1));


        // ==========================================
        // INFORMACION FINAL
        // ==========================================

        System.out.println("\n========== FIN DE LAS PRUEBAS ==========");

        alien1.imprimir();

    }

}
