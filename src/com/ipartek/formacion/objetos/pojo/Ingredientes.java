package com.ipartek.formacion.objetos.pojo;

public class Ingredientes {

	// atributos y constantes
	private String nombre;
	private float cantidad;
	private boolean gluten;

	// constructores
	public Ingredientes(String nombre, float cantidad, boolean gluten) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.gluten = gluten;
	}

	// getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	// otros metodos
	@Override
	public String toString() {
		return " Ingredientes: nombre=" + nombre + ", cantidad=" + cantidad + ", gluten=" + gluten;
	}
	/*
	 * URL a marmitako
	 * http://www.hogarmania.com/cocina/recetas/pescados-mariscos/201109/
	 * marmitako-bonito-11686.html
	 * 
	 * Se ENLAZA CON RecetaMarmitako.java y con recetas.java
	 */

	/*
	 * Ingredientes cantidad float nombre string gluten
	 * 
	 * 
	 * Receta titulo string ingredientes [ ] tiempo int dificultad string
	 * comensales int descripción string
	 * 
	 */

}
