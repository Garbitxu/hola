package com.ipartek.formacion.hola.pojo;

/**
 * 
 * 
 * Class {@code Libro} clase para representar un libro
 *
 */

public class Libro {

	// atributos
	/**
	 * Se declaran las variables/atributos que vamos a utilizar
	 * 
	 * int numeroPaginas el numero total de p�ginas que contiene el
	 * {@code Libro}
	 */

	public int numeroPaginas;

	/**
	 * String nombre es el nombre del {@code Libro}
	 */
	public String nombre; // los string en Java son clases que se comportan como
							// variables
	/**
	 * String autor es el nombre del autor
	 */
	public String autor;
	// Hay que declararlas public para poderlas acceder o manejar desde fuera

	// M�todos o funciones
	/**
	 * Se crea un m�todo que contiene la descripci�n del {@code Libro}. Se
	 * muestra por pantalla.
	 * 
	 */

	// public void describete() { //metodo o funci�n publico sin retorno (void)
	// llammado describete
	// System.out.println("Autor: " +this.autor + " descripci�n: "+this.nombre +
	// " p�ginas: " + this.numeroPaginas); // sacamos por pantalla los datos del
	// libro (variables)

	// }

	public String describete() { // hace lo mismo que el public void pero es mas
									// recomendable de esta forma. Ver Hola.java
									// para ver los cambios.
		return "Autor: " + this.autor + " descripci�n: " + this.nombre + " p�ginas: " + this.numeroPaginas; // devuelve
																											// este
																											// valor.
																											// para
																											// devolver
																											// valor
																											// hay
																											// que
																											// usar
																											// siempre
																											// return.

	}

	/**
	 * Aumenta en 1 el atributo numeroPaginas al escribir. No se muestra en
	 * pantalla.
	 * 
	 */
	// este m�todo comentado NO TIENE PAR�METRO.
	// public void escribir() { // metodo o funci�n publico sin retorno (void)
	// llammado escribir. Necesario para crear
	// objetos en la otra p�gina.
	// this.numeroPaginas++;

	// }
	// M�TODO con par�metro

	/**
	 * 
	 * Aumentamos el numero de p�ginas
	 * 
	 * @param numPaginas
	 *            <code> int </code> numero p�ginas nuevas escritas
	 */
	public void escribir(int numPaginas) { // metodo o funci�n publico sin
											// retorno (void)
		// llammado escribir. Necesario para crear
		// objetos en la otra p�gina.
		this.numeroPaginas += numPaginas; // es lo mismo que:
											// this.numeroPaginas=numPaginas+numeroPaginas;

	}

}
