package com.onetec.globalapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HISTORICO_EMPLEADOCLIENTE")
public class HistoricoEmpleadoCliente {


	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "idEmpleado", nullable = false)
	private int idEmpleado;
	
	@Column(name = "idCliente", nullable = false)
	private int idCliente;
	
	@Column(name = "fechaAlta", nullable = false)
	private Date fechaAlta;
	
	@Column(name = "fechaBaja", nullable = false)
	private Date fechaBaja;
	
	@Column(name = "responsable", length = 50, nullable = false)
	private String responsable;
	
	@Column(name = "proyecto", length = 30, nullable = false)
	private String proyecto;
	
	@Column(name = "correoEmpleadoCliente", length = 50, nullable = false)
	private String correoEmpleadoCliente;
	
	@Column(name = "telefonoEmpleadoCliente", length = 15, nullable = false)
	private String telefonoEmpleadoCliente;
	
	@Column(name = "direccion", length = 100, nullable = false)
	private String direccion;
	
	@Column(name = "localidad", length = 40, nullable = false)
	private String localidad;
	
	@Column(name = "codigoPostal", length = 5, nullable = false)
	private String codigoPostal;
	
	@Column(name = "provincia", length = 30, nullable = false)
	private String provincia;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public Date getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public Date getFechaBaja() {
		return fechaBaja;
	}


	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}


	public String getResponsable() {
		return responsable;
	}


	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}


	public String getProyecto() {
		return proyecto;
	}


	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}


	public String getCorreoEmpleadoCliente() {
		return correoEmpleadoCliente;
	}


	public void setCorreoEmpleadoCliente(String correoEmpleadoCliente) {
		this.correoEmpleadoCliente = correoEmpleadoCliente;
	}


	public String getTelefonoEmpleadoCliente() {
		return telefonoEmpleadoCliente;
	}


	public void setTelefonoEmpleadoCliente(String telefonoEmpleadoCliente) {
		this.telefonoEmpleadoCliente = telefonoEmpleadoCliente;
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


	
	public HistoricoEmpleadoCliente(int id, int idEmpleado, int idCliente, Date fechaAlta, Date fechaBaja,
			String responsable, String proyecto, String correoEmpleadoCliente, String telefonoEmpleadoCliente,
			String direccion, String localidad, String codigoPostal, String provincia) {
		super();
		this.id = id;
		this.idEmpleado = idEmpleado;
		this.idCliente = idCliente;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.responsable = responsable;
		this.proyecto = proyecto;
		this.correoEmpleadoCliente = correoEmpleadoCliente;
		this.telefonoEmpleadoCliente = telefonoEmpleadoCliente;
		this.direccion = direccion;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
	}

	public HistoricoEmpleadoCliente () {
		
	}
	
}
