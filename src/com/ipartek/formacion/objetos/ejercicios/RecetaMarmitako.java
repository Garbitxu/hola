package com.ipartek.formacion.objetos.ejercicios;

import com.ipartek.formacion.objetos.pojo.Ingredientes;
import com.ipartek.formacion.objetos.pojo.Recetas;

public class RecetaMarmitako {
	// is gluten free se hace en Recetas

	// main
	public static void main(String[] args) {

		Recetas marmitako = new Recetas(); // no entiendo porque es necesario
		marmitako.setComensales(4);
		marmitako.setDificultad("Dificil");
		marmitako.setTiempo(50);
		marmitako.setTitulo("Receta para hacer Marmitako");
		marmitako.setDescripcion(
				"\r\rRetira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente. Cuando estén bien hidratados, retírales la carne y resérvala. \r\rPela las patatas, cáscalas y ponlas a cocer en una cazuela con agua, un chorrito de brandy y la guindilla cayena. Ata una cabeza de ajo con una cuerda de cocina a un asa de la cazuela y cuélgala dentro. Sazona. Cuece todo junto durante 15-20 minutos. Reserva.\r\rLava y pica las cebolletas y todos los pimientos y ponlos a pochar en una cazuela con aceite. Sazona. Cuando esté bien pochado, añade la salsa de tomate y la carne de los pimientos choriceros. Mezcla bien y tritura con la batidora eléctrica. Vierte este puré sobre la cazuela de las patatas y mezcla bien. Trocea el pan, añade a la cazuela y deja que hierva durante 10 minutos a fuego suave. \r\rRetira la piel al bonito, córtalo en trozos de bocado y salpimiéntalo. Añade a la cazuela, incorpora perejil picado y apaga el fuego para que se termine de hacer con el calor residual. Retira la cabeza de ajo y sirve. Decora con una ramita de perejil.");

		// orden: Nombre, cantidad, gluten.

		Ingredientes[] aIngredientes = { new Ingredientes("Patatas", 4, false), new Ingredientes("Bonito", 500, false),
				new Ingredientes("Cebolleta", 2, false), new Ingredientes("Pimientos Verdes", 2, false),
				new Ingredientes("Pimiento Rojo", 0.5f, false), new Ingredientes("Cabeza de Ajo", 1, false),
				new Ingredientes("Pimientos choriceros", 4, false), new Ingredientes("pan de sopa", 40, true),
				new Ingredientes("Vaso de salsa de tomate", 0.5f, false), new Ingredientes("Agua", 0, false),
				new Ingredientes("Copa de Brandy", 1, false), new Ingredientes("Aceite de Oliva", 0, false),
				new Ingredientes("Sal", 0, false), new Ingredientes("Pimienta", 0, false),
				new Ingredientes("Guindilla Cayena", 1, false), new Ingredientes("Perejil", 0, false),

		};
		System.out.println(marmitako.getTitulo() + "\r");
		System.out.println("Receta para " + marmitako.getComensales() + "\r" + "\rNivel de dificultad: "
				+ marmitako.getDificultad() + "\n");
		for (int i = 0; i < aIngredientes.length; i++) {
			System.out.println(aIngredientes[i].toString());
		}
		System.out.println(marmitako.getDescripcion());
		/*
		 * URL a marmitako
		 * http://www.hogarmania.com/cocina/recetas/pescados-mariscos/201109/
		 * marmitako-bonito-11686.html
		 * 
		 * Se ENLAZA CON Ingredientes.java y con Recetas.java
		 */

		/*
		 * Ingredientes cantidad float nombre string gluten boolean
		 * 
		 * 
		 * Receta titulo string ingredientes [ ] tiempo int dificultad string
		 * comensales int descripción string
		 * 
		 */

	}

}
