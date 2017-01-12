package com.ipartek.formacion.hola;

public class Dado {

	static String[] aAlumnos = { "Aaron", "Eneko", "Itsaso", "Ivan", "Guillermo", "Lozoya", "Josu", "Ignacio", "Gomez",
			"Nerea", "Nagore", "Garbiñe", "Egoitz", "Pavel", "Pérez" }; // array
																		// de
																		// alumnos.
																		// La
																		// declaración
																		// hay
																		// que
																		// seguirla
																		// así.
																		// La
																		// primera
																		// a
																		// minúscula
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
																		// saldrá
																		// error
																		// y con
																		// el
																		// error
																		// que
																		// saldrá
																		// podemos
																		// arreglarlo.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hay que hacer un cast. Cast es cambiar por ejemplo un float a un int
		// por ejemplo. Para convertirlo a int, tienes que declarar la variable
		// como int y para castearlo, delante del math.random() se pone entre
		// paréntesis el tipo al que se convierte, en este caso, int. La
		// variable y el casteo deben de ser iguales.
		// int numeroAleatorio = (int) (Math.random() * aAlumnos.length);

		// Hacemos lo mismo que antes pero enlazandolo a un archivo externo.
		int numeroAleatorio = Utilidades.getNumeroAleatorio((aAlumnos.length - 1));
		// Se declara una nueva variable para pillar el nombre y se le da el
		// valor del numero aleatorio (con el array delante para saber que debe
		// coger la posición del array)
		String afortunado = aAlumnos[numeroAleatorio];
		System.out.println("El/la afortunado/a es: " + afortunado);

	}

}
