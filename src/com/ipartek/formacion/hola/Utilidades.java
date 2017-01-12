package com.ipartek.formacion.hola;

/**
 * Clase {@code Utilidades} con métodos estáticos y comunes. <br>
 * Por ejemplo, generar números aleatorios, validaciones, etc
 * 
 * @author Curso
 *
 */
public class Utilidades {

	/**
	 * Generar numero {@code int} aleatorio desde 0 hasta <b>maximoValor</b>
	 * 
	 * @param maximoValor
	 *            numeros aleatorios máximos que se pueden generar incluido
	 *            este.
	 * @return numero entero aleatorio
	 */

	static public int getNumeroAleatorio(int maximoValor) {
		return (int) (Math.random() * maximoValor);
		// System.out.println(numeroAleatorio);

	}
	// suma tonta pasando dos parámetros: int numero 1 , int numero 2.
	// devuelve int. suma 2 numeros siempre positivos. si uno de los dos es
	// negativo, return 0. Y si suman mas de 100, return 0.

	/**
	 * Suma muy rara del jefe
	 * 
	 * @param num1
	 *            entero a sumar
	 * @param num2
	 *            entero a sumar
	 * @return sumar los dos parametros, pero: <br>
	 *         <ul>
	 *         <li>si cualquiera de los dos numeros es negativo, enviar return
	 *         0.</li>
	 *         <li>si la suma es superior a 100, return 0.</li>
	 *         </ul>
	 */
	static public int sumaTonta(int num1, int num2) {
		int numeroSumado = -1;
		if (num1 < 0 || num2 < 0 || (num1 + num2 > 100)) {
			numeroSumado = 0;
		} else {
			numeroSumado = num1 + num2;
		}
		return numeroSumado;
	}

}
