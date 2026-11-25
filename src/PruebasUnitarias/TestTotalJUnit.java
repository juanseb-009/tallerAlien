package PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ProyectoAliens.Aliens;

public class TestTotalJUnit {




    // ==========================================
    // 1. CALCULO CORRECTO DEL PRECIO TOTAL
    // ==========================================

    @Test
    public void testPrecioTotalInicial() {
        Aliens alien = new Aliens(20, "Verde");

        assertEquals(0.0, alien.getPrecioTotal(), 0.001);
    }

    @Test
    public void testCalculoPrecioTotal() {
        Aliens alien = new Aliens(20, "Verde");

        alien.agregarBrazos(2);
        alien.agregarPiernas(2);
        alien.agregarOjos(3);

        assertEquals(15.0, alien.getPrecioTotal(), 0.001);
    }

    @Test
    public void testActualizacionPrecioAlAgregarElementos() {
        Aliens alien = new Aliens(10, "Azul");

        alien.agregarBrazos(2);
        assertEquals(3.0, alien.getPrecioTotal(), 0.001);

        alien.agregarOjos(2);
        assertEquals(4.0, alien.getPrecioTotal(), 0.001);

        alien.agregarPiernas(2);
        assertEquals(6.0, alien.getPrecioTotal(), 0.001);
    }

    // ==========================================
    // 2. COMPORTAMIENTO AL AGREGAR ELEMENTOS
    // ==========================================

    @Test
    public void testAgregarBrazos() {
        Aliens alien = new Aliens(20, "Rojo");

        assertTrue(alien.agregarBrazos(3));
        assertEquals(3, alien.getNumeroBrazos());
    }

    @Test
    public void testAgregarPiernas() {
        Aliens alien = new Aliens(20, "Amarillo");

        assertTrue(alien.agregarPiernas(4));
        assertEquals(4, alien.getNumeroPies());
    }

    @Test
    public void testAgregarOjos() {
        Aliens alien = new Aliens(20, "Morado");

        assertTrue(alien.agregarOjos(3));
        assertEquals(3, alien.getNumeroOjos());
    }

    @Test
    public void testAgregarVariosElementos() {
        Aliens alien = new Aliens(20, "Blanco");

        assertTrue(alien.agregarBrazos(2));
        assertTrue(alien.agregarPiernas(3));
        assertTrue(alien.agregarOjos(4));

        assertEquals(2, alien.getNumeroBrazos());
        assertEquals(3, alien.getNumeroPies());
        assertEquals(4, alien.getNumeroOjos());
    }

    @Test
    public void testAgregarCantidadNegativa() {
        Aliens alien = new Aliens(20, "Verde");

        assertFalse(alien.agregarBrazos(-2));
        assertFalse(alien.agregarPiernas(-1));
        assertFalse(alien.agregarOjos(-3));

        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
        assertEquals(0, alien.getNumeroOjos());
    }

    @Test
    public void testAgregarCantidadCero() {
        Aliens alien = new Aliens(20, "Azul");

        assertFalse(alien.agregarBrazos(0));
        assertFalse(alien.agregarPiernas(0));
        assertFalse(alien.agregarOjos(0));
    }

    // ==========================================
    // 3. RESTRICCIONES DE NEGOCIO
    // ==========================================

    @Test
    public void testTamanioMinimo() {
        Aliens alien = new Aliens(2, "Verde");

        assertEquals(5, alien.getTamanio());
    }

    @Test
    public void testTamanioMaximo() {
        Aliens alien = new Aliens(40, "Rojo");

        assertEquals(30, alien.getTamanio());
    }

    @Test
    public void testLimiteExactoExtremidades() {
        Aliens alien = new Aliens(20, "Azul");

        assertTrue(alien.agregarBrazos(5));
        assertTrue(alien.agregarPiernas(5));

        assertEquals(5, alien.getNumeroBrazos());
        assertEquals(5, alien.getNumeroPies());
    }

    @Test
    public void testSuperarLimiteExtremidades() {
        Aliens alien = new Aliens(20, "Amarillo");

        assertTrue(alien.agregarBrazos(6));
        assertFalse(alien.agregarPiernas(5));

        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }

    @Test
    public void testLimiteOjosSegunTamanio() {
        Aliens alienPequeno = new Aliens(10, "Verde");
        Aliens alienMediano = new Aliens(15, "Azul");
        Aliens alienGrande = new Aliens(25, "Rojo");

        assertTrue(alienPequeno.agregarOjos(3));
        assertFalse(alienPequeno.agregarOjos(1));

        assertTrue(alienMediano.agregarOjos(5));
        assertFalse(alienMediano.agregarOjos(1));

        assertTrue(alienGrande.agregarOjos(7));
        assertFalse(alienGrande.agregarOjos(1));
    }

    @Test
    public void testNoModificarPrecioCuandoSeRechazaAgregado() {
        Aliens alien = new Aliens(20, "Morado");

        alien.agregarBrazos(6);

        double precioAnterior = alien.getPrecioTotal();

        assertFalse(alien.agregarPiernas(5));

        assertEquals(precioAnterior, alien.getPrecioTotal(), 0.001);
        assertEquals(0, alien.getNumeroPies());
    }

}


