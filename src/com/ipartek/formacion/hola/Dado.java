package com.ipartek.formacion.hola;

public class Dado {

	static String[] aAlumnos = { "Aaron", "Eneko", "Itsaso", "Ivan", "Guillermo", "Lozoya", "Josu", "Ignacio", "Gomez",
			"Nerea", "Nagore", "Garbi�e", "Egoitz", "Pavel", "P�rez" }; // array
																		// de
																		// alumnos.
																		// La
																		// declaraci�n
																		// hay
																		// que
																		// seguirla
																		// as�.
																		// La
																		// primera
																		// a
																		// min�scula
																		// es
																		// para
																		// indicar
																		// que
																		// se
																		// trata
																		// de un
																		// array.
																		// "No
																		// es
																		// necesario"
																		// el
																		// static,
																		// pero
																		// si
																		// necesita
																		// algo
																		// nos
																		// saldr�
																		// error
																		// y con
																		// el
																		// error
																		// que
																		// saldr�
																		// podemos
																		// arreglarlo.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hay que hacer un cast. Cast es cambiar por ejemplo un float a un int
		// por ejemplo. Para convertirlo a int, tienes que declarar la variable
		// como int y para castearlo, delante del math.random() se pone entre
		// par�ntesis el tipo al que se convierte, en este caso, int. La
		// variable y el casteo deben de ser iguales.
		// int numeroAleatorio = (int) (Math.random() * aAlumnos.length);

		// Hacemos lo mismo que antes pero enlazandolo a un archivo externo.
		int numeroAleatorio = Utilidades.getNumeroAleatorio((aAlumnos.length - 1));
		// Se declara una nueva variable para pillar el nombre y se le da el
		// valor del numero aleatorio (con el array delante para saber que debe
		// coger la posici�n del array)
		String afortunado = aAlumnos[numeroAleatorio];
		System.out.println("El/la afortunado/a es: " + afortunado);

	}

}
