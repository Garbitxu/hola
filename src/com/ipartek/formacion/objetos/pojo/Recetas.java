package com.ipartek.formacion.objetos.pojo;

import java.util.Arrays;

public class Recetas {

	// atributos y constantes
	private String titulo;
	private int tiempo;
	private Ingredientes[] ingredientes;
	private String dificultad;
	private int comensales;
	private String descripcion;
	// constructores

	public Recetas() {
		super();

	}

	// el profe solo puso parametro titulo e ingredientes. Lo demás lo mete el
	// en numeros etc
	public Recetas(String titulo, Ingredientes[] ingredientes, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = titulo;
		this.tiempo = tiempo;
		this.dificultad = dificultad;
		this.comensales = comensales;
		this.descripcion = descripcion;
		this.ingredientes = ingredientes;
	}

	// getters y setters

	public Ingredientes[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingredientes[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// otros metodos
	public boolean isGlutenFree() {
		// hay que hacerlo usando this.

		return false;
	}

	@Override
	public String toString() {
		return "Recetas [titulo=" + titulo + ", tiempo=" + tiempo + ", ingredientes=" + Arrays.toString(ingredientes)
				+ ", dificultad=" + dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
