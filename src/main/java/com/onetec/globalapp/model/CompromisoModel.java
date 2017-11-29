package com.onetec.globalapp.model;

import java.util.Date;

public class CompromisoModel {
	
	private int id;
	private int idEmpleado;
	private String nombreCompromiso;
	private boolean realizado;
	private String observaciones;
	private Date fechaAlta;
	private Date fechaCompromiso;
	private Date fechaCumplimiento;
	private String responsable;

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

	public String getNombreCompromiso() {
		return nombreCompromiso;
	}

	public void setNombreCompromiso(String nombreCompromiso) {
		this.nombreCompromiso = nombreCompromiso;
	}

	public boolean isRealizado() {
		return realizado;
	}

	public void setRealizado(boolean realizado) {
		this.realizado = realizado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaCompromiso() {
		return fechaCompromiso;
	}

	public void setFechaCompromiso(Date fechaCompromiso) {
		this.fechaCompromiso = fechaCompromiso;
	}

	public Date getFechaCumplimiento() {
		return fechaCumplimiento;
	}

	public void setFechaCumplimiento(Date fechaCumplimiento) {
		this.fechaCumplimiento = fechaCumplimiento;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public CompromisoModel(int id, int idEmpleado, String nombreCompromiso, boolean realizado, String observaciones,
			Date fechaAlta, Date fechaCompromiso, Date fechaCumplimiento, String responsable) {
		super();
		this.id = id;
		this.idEmpleado = idEmpleado;
		this.nombreCompromiso = nombreCompromiso;
		this.realizado = realizado;
		this.observaciones = observaciones;
		this.fechaAlta = fechaAlta;
		this.fechaCompromiso = fechaCompromiso;
		this.fechaCumplimiento = fechaCumplimiento;
		this.responsable = responsable;
	}

	public CompromisoModel() {
	}

	@Override
	public String toString() {
		return "CompromisoModel [id=" + id + ", idEmpleado=" + idEmpleado + ", nombreCompromiso=" + nombreCompromiso
				+ ", realizado=" + realizado + ", observaciones=" + observaciones + ", fechaAlta=" + fechaAlta
				+ ", fechaCompromiso=" + fechaCompromiso + ", fechaCumplimiento=" + fechaCumplimiento + ", responsable="
				+ responsable + "]";
	}

	
	
}
