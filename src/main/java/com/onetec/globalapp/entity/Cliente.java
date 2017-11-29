package com.onetec.globalapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Cliente {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "nombre", length = 30, nullable = false)
	private String nombre;
	
	@Column(name = "telefono", length = 15, nullable = false)
	private String telefono;
	
	@Column(name = "direccion", length = 100, nullable = false)
	private String direccion;
	
	@Column(name = "localidad", length = 40, nullable = false)
	private String localidad;
	
	@Column(name = "codigoPostal", length = 5, nullable = false)
	private String codigoPostal;
	
	@Column(name = "pais", length = 15, nullable = false)
	private String pais;
	
	@Column(name = "provincia", length = 30, nullable = false)
	private String provincia;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public Cliente(int id, String nombre, String telefono, String direccion, String localidad, String codigoPostal,
			String pais, String provincia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
		this.provincia = provincia;
	}


	public Cliente() {
	}


	
	
	
	
	
}
