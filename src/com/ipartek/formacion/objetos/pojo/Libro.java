package com.ipartek.formacion.objetos.pojo;

public class Libro {
	// atributos y constantes
	private String titulo;
	private String autor;
	private float precio;
	private int num_Paginas;

	public Libro(String titulo, String autor, float precio, int num_Paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.num_Paginas = num_Paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getNum_Paginas() {
		return num_Paginas;
	}

	public void setNum_Paginas(int num_Paginas) {
		this.num_Paginas = num_Paginas;
	}

	@Override
	public String toString() {
		return "Título del libro: " + titulo + ", autor: " + autor + ", con el número de páginas " + num_Paginas
				+ " y que cuesta " + precio + "]";
	}

}
