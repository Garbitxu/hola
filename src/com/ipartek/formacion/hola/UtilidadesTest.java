package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {
	@Test // indica que es un test
	public void testGetNumeroAleatorio() {
		int numero = -1;
		final int NUMERO_MAXIMO = 10;

		// CREAR ARRAY CON todo FALSE
		boolean[] aResultado = new boolean[NUMERO_MAXIMO];

		// Generar 1000 numeros aleatorios y actualizar array con true
		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getNumeroAleatorio(NUMERO_MAXIMO);
			aResultado[numero] = true;

		}

		// Recorrer array y comprobar todo true
		for (int i = 0; i < aResultado.length; i++) {
			assertTrue(aResultado[i]);

		}
	}

	@Test

	public void testNoFallaNunca() {
		assertTrue(true);
	}

	@Test

	public void testSumaRara() {
		assertEquals("no suma bien", 5, Utilidades.sumaTonta(2, 3));
		/*
		 * assertEquals ("texto error", resultado final,
		 * pagina.metodo(valor1_comparar, valor2_comparar));
		 * 
		 */
		assertEquals("Debiera salir 0 al haber un negativo", 0, Utilidades.sumaTonta(-2, 3));
		assertEquals("Debiera salir 0 al haber dos negativos", 0, Utilidades.sumaTonta(-2, -3));
		assertEquals("Debiera salir 0 al haber un negativo", 0, Utilidades.sumaTonta(2, -3));
		assertEquals(">100 debiera ser 0", 0, Utilidades.sumaTonta(1, 100));

	}
}