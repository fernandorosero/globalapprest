package com.onetec.globalapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPROMISOS")
public class Compromiso {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "idEmpleado", nullable = false)
	private int idEmpleado;
	
	@Column(name = "nombreCompromiso", length = 50, nullable = false)
	private String nombreCompromiso;
	
	@Column(name = "realizado", nullable = false)
	private boolean realizado;
	
	@Column(name = "observaciones", length = 100, nullable = false)
	private String observaciones;
	
	@Column(name = "fechaAlta", nullable = false)
	private Date fechaAlta;
	
	@Column(name = "fechaCompromiso", nullable = false)
	private Date fechaCompromiso;
	
	@Column(name = "fechaCumplimiento", nullable = false)
	private Date fechaCumplimiento;
	
	@Column(name = "responsable", length = 50, nullable = false)
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


	public Compromiso(int id, int idEmpleado, String nombreCompromiso, boolean realizado, String observaciones,
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
	
	
	public Compromiso(){}
	
}
