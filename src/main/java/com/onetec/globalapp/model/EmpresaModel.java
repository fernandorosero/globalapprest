package com.onetec.globalapp.model;

public class EmpresaModel {

	private int id;
	private String cif;
	private String nombre;
	private String telefono;
	private String direccion;
	private String localidad;
	private String codigoPostal;
	private String pais;
	private String provincia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
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
	
	public EmpresaModel(int id, String cif, String nombre, String telefono, String direccion, String localidad,
			String codigoPostal, String pais, String provincia) {
		super();
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
		this.provincia = provincia;
	}
	
	public EmpresaModel() {
	}
	
	@Override
	public String toString() {
		return "EmpresaModel [id=" + id + ", cif=" + cif + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", localidad=" + localidad + ", codigoPostal=" + codigoPostal + ", pais="
				+ pais + ", provincia=" + provincia + "]";
	}
	
}
