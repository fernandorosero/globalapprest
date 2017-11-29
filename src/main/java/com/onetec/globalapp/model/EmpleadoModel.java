package com.onetec.globalapp.model;

import java.util.Date;

public class EmpleadoModel {

	
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private String sexo;
	private String cv;
	private String paisNacimiento;
	private String provinciaNacimiento;
	private Date fechaNacimiento;
	private String titulacion;
	private String correoPersonal;
	private String telefonoPersonal;
	private String direccion;
	private String localidad;
	private String codigoPostal;
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
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public String getPaisNacimiento() {
		return paisNacimiento;
	}
	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}
	public String getProvinciaNacimiento() {
		return provinciaNacimiento;
	}
	public void setProvinciaNacimiento(String provinciaNacimiento) {
		this.provinciaNacimiento = provinciaNacimiento;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public String getCorreoPersonal() {
		return correoPersonal;
	}
	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}
	public String getTelefonoPersonal() {
		return telefonoPersonal;
	}
	public void setTelefonoPersonal(String telefonoPersonal) {
		this.telefonoPersonal = telefonoPersonal;
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
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public EmpleadoModel(int id, String nombre, String apellido1, String apellido2, String dni, String sexo, String cv,
			String paisNacimiento, String provinciaNacimiento, Date fechaNacimiento, String titulacion,
			String correoPersonal, String telefonoPersonal, String direccion, String localidad, String codigoPostal,
			String provincia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.sexo = sexo;
		this.cv = cv;
		this.paisNacimiento = paisNacimiento;
		this.provinciaNacimiento = provinciaNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.titulacion = titulacion;
		this.correoPersonal = correoPersonal;
		this.telefonoPersonal = telefonoPersonal;
		this.direccion = direccion;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
	}
	public EmpleadoModel() {
	}
	
	@Override
	public String toString() {
		return "EmpleadoModel [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", sexo=" + sexo + ", cv=" + cv + ", paisNacimiento=" + paisNacimiento
				+ ", provinciaNacimiento=" + provinciaNacimiento + ", fechaNacimiento=" + fechaNacimiento
				+ ", titulacion=" + titulacion + ", correoPersonal=" + correoPersonal + ", telefonoPersonal="
				+ telefonoPersonal + ", direccion=" + direccion + ", localidad=" + localidad + ", codigoPostal="
				+ codigoPostal + ", provincia=" + provincia + "]";
	}
	
}
