package com.onetec.globalapp.model;

public class CategoriaModel {

	private int id;
	private String descripcion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public CategoriaModel(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	public CategoriaModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", descripcion=" + descripcion + "]";
	}

	
}
