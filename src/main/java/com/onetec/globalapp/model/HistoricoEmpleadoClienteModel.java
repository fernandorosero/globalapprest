package com.onetec.globalapp.model;

import java.util.Date;

public class HistoricoEmpleadoClienteModel {

	
	private int id;
	private int idEmpleado;
	private int idCliente;
	private Date fechaAlta;
	private Date fechaBaja;
	private String responsable;
	private String proyecto;
	private String correoEmpleadoCliente;
	private String telefonoEmpleadoCliente;
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
	public HistoricoEmpleadoClienteModel(int id, int idEmpleado, int idCliente, Date fechaAlta, Date fechaBaja,
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
	public HistoricoEmpleadoClienteModel() {
		super();
	}
	
	@Override
	public String toString() {
		return "HistoricoEmpleadoClienteModel [id=" + id + ", idEmpleado=" + idEmpleado + ", idCliente=" + idCliente
				+ ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + ", responsable=" + responsable
				+ ", proyecto=" + proyecto + ", correoEmpleadoCliente=" + correoEmpleadoCliente
				+ ", telefonoEmpleadoCliente=" + telefonoEmpleadoCliente + ", direccion=" + direccion + ", localidad="
				+ localidad + ", codigoPostal=" + codigoPostal + ", provincia=" + provincia + "]";
	}
	
}
