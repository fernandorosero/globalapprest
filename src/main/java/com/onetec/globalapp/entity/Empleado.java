package com.onetec.globalapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EMPLEADOS")
public class Empleado {
	
	@Id
	@GeneratedValue
	@Column(name="id", unique = true, nullable = false)
	private int id;
	
	@Column(name="nombre", length = 40, nullable = false)
	private String nombre;
	
	@Column(name="apellido1", length = 40, nullable = false)
	private String apellido1;
	
	@Column(name="apellido2", length = 40, nullable = false)
	private String apellido2;
	
	@Column(name="dni", length = 10, nullable = false)
	private String dni;
	
	@Column(name="sexo", length = 10, nullable = false)
	private String sexo;
	
	@Column(name="cv", length = 200, nullable = false)
	private String cv;
	
	@Column(name="paisNacimiento", length = 15, nullable = false)
	private String paisNacimiento;
	
	@Column(name="provinciaNacimiento", length = 30, nullable = false)
	private String provinciaNacimiento;
	
	@Column(name="fechaNacimiento", nullable = false)
	private Date fechaNacimiento;
	
	@Column(name="titulacion", length = 30, nullable = false)
	private String titulacion;
	
	@Column(name="correoPersonal", length = 50, nullable = false)
	private String correoPersonal;
	
	@Column(name="telefonoPersonal", length = 15, nullable = false)
	private String telefonoPersonal;
	
	@Column(name="direccion", length = 100, nullable = false)
	private String direccion;
	
	@Column(name="localidad", length = 40, nullable = false)
	private String localidad;
	
	@Column(name="codigoPostal", length = 5, nullable = false)
	private String codigoPostal;
	
	@Column(name="provincia", length = 30, nullable = false)
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

	public Empleado(int id, String nombre, String apellido1, String apellido2, String dni, String sexo, String cv,
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

	public Empleado() {
	}

	
}
