package com.onetec.globalapp.model;

import java.util.Date;

public class HistoricoEmpleadoEmpresaModel {
	
	
	private int id;
	private int idEmpresa;
	private int idEmpleado;
	private int idCategoria;
	private Date fechaAlta;
	private Date fechaBaja;
	private String contrato;
	private Date fechaContrato;
	private Date fechaCategoria;
	private String salario;
	private Date fechaSalario;
	private String correoEmpresa;
	private String telefonoEmpresa;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
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
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public Date getFechaContrato() {
		return fechaContrato;
	}
	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	public Date getFechaCategoria() {
		return fechaCategoria;
	}
	public void setFechaCategoria(Date fechaCategoria) {
		this.fechaCategoria = fechaCategoria;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public Date getFechaSalario() {
		return fechaSalario;
	}
	public void setFechaSalario(Date fechaSalario) {
		this.fechaSalario = fechaSalario;
	}
	public String getCorreoEmpresa() {
		return correoEmpresa;
	}
	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}
	public String getTelefonoEmpresa() {
		return telefonoEmpresa;
	}
	public void setTelefonoEmpresa(String telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}
	public HistoricoEmpleadoEmpresaModel(int id, int idEmpresa, int idEmpleado, int idCategoria, Date fechaAlta,
			Date fechaBaja, String contrato, Date fechaContrato, Date fechaCategoria, String salario, Date fechaSalario,
			String correoEmpresa, String telefonoEmpresa) {
		super();
		this.id = id;
		this.idEmpresa = idEmpresa;
		this.idEmpleado = idEmpleado;
		this.idCategoria = idCategoria;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.contrato = contrato;
		this.fechaContrato = fechaContrato;
		this.fechaCategoria = fechaCategoria;
		this.salario = salario;
		this.fechaSalario = fechaSalario;
		this.correoEmpresa = correoEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
	}
	public HistoricoEmpleadoEmpresaModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "HistoricoEmpleadoEmpresaModel [id=" + id + ", idEmpresa=" + idEmpresa + ", idEmpleado=" + idEmpleado
				+ ", idCategoria=" + idCategoria + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja
				+ ", contrato=" + contrato + ", fechaContrato=" + fechaContrato + ", fechaCategoria=" + fechaCategoria
				+ ", salario=" + salario + ", fechaSalario=" + fechaSalario + ", correoEmpresa=" + correoEmpresa
				+ ", telefonoEmpresa=" + telefonoEmpresa + "]";
	}
	
}
