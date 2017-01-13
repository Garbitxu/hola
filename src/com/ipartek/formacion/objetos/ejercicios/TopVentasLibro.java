package com.ipartek.formacion.objetos.ejercicios;

import com.ipartek.formacion.objetos.pojo.Libro;

/*
 * ES NECESARIO CREAR UNA CLASE OBJETO LIBRO.
 * 
 * 
 * 
 */
public class TopVentasLibro {

	private static int TOP_VENTAS = 5;

	// otros metodos
	public static void main(String[] args) {

		Libro[] aLibros = { new Libro("Amor y Asco", "SRTABEBI", 13.3f, 232),
				new Libro("ANIMALES FANTASTICOS Y DONDE ENCONTRARLOS (GUIÓN ORIGINAL DE LA PELICULA)", "J.K.Rowling",
						14.25f, 256),
				new Libro("EL LABERINTO DE LOS ESPIRITUS", "Carlos Ruiz Zafon", 22.7f, 928),
				new Libro("CUANDO ABRAS EL PARACAIDAS", "DEFREDS JOSE. A. GOMEZ IGLESIAS", 14, 216),
				new Libro("TODO ESTO TE DARE (PREMIO PLANETA 2016)", "Dolores Redondo", 20.81f, 624) };
		System.out.println("TOP VENTAS LIBROS");
		System.out.println(" ");
		for (int i = 0; i < TOP_VENTAS; i++) {
			System.out.println((i + 1) + " " + aLibros[i].toString());
		}
	}

}
