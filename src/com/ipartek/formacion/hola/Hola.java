package com.ipartek.formacion.hola;

//los package SIEMPRE HAY QUE PONERLOS AL INICIO.
//hay que importar el package que hemos creado en la clase libro
import com.ipartek.formacion.hola.pojo.Libro;

/**
 * clase para realizar un "Hello world"
 * 
 * @author Curso
 *
 */
public class Hola {

	/**
	 * método main para ejecutar la clase
	 * 
	 * @param args
	 *            []String
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		// comentario de línea
		System.out.println(" ");
		System.out.println("***********************************************************");
		/*
		 * comentario de bloque mas de una linea
		 * 
		 */
		// Vamos a instanciar un objeto de la clase libro
		// Hay que declarar una variable de tipo libro.

		Libro libroJava = new Libro();

		libroJava.numeroPaginas = 320;
		libroJava.nombre = "Java 7";
		libroJava.autor = "Roberto Montero Miguel";

		// libroJava.describete();
		System.out.println(libroJava.describete());
		System.out.println("Escribir 10 páginas nuevas");
		// El for para cuando no haya parámetros. ver Libro.java para entenderlo
		// mejor.
		// for (int i = 0; i < 10; i++) {
		// libroJava.escribir();
		// }
		libroJava.escribir(10);// se le pasa un parámetro para escribir 10
								// páginas. Ver Libro.java para entenderlo
								// mejor. También se puede declarar una variable
								// int paginasAEscribir=10; y luego
								// libroJava(paginasAEscribir);
		System.out.println(" ");
		System.out.println("***********************************************************");
		// libroJava.describete();
		System.out.println(libroJava.describete()); // hace lo mismo que
													// libroJava.describete(),
													// solo que es mas elegante.
													// Devuelve un string, así
													// puedo ponerlo donde
													// quiera etc. Es lo mismo
													// que hacer string
													// retorno=libroJava.describete();
													// System.out.println(retorno);

		// los caracteres char se hace con comilla simple
		// una cadena string se hace con comillas dobles
		// float variable=10.23f; HAY QUE PONER EL PUNTO para los decimales y
		// FORZOSAMENTE LA F AL FINAL O CRASHEA.
		// También se puede castear de la siguiente forma: float variable =
		// (float)
		// 10.23;

		// Operador ternario
		// Asigna un valor a una variable en función de una 'condición'.
		// sintaxis: (condicion) ? true:false;
		int edad = (3 > 100) ? 18 : 34;
		System.out.println("edad " + edad);
	}// end:main
}
