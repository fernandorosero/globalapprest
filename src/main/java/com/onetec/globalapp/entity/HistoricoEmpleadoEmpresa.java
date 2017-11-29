package com.onetec.globalapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HISTORICO_EMPLEADOEMPRESA")
public class HistoricoEmpleadoEmpresa {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "idEmpresa", nullable = false)
	private int idEmpresa;
	
	@Column(name = "idEmpleado", nullable = false)
	private int idEmpleado;
	
	@Column(name = "fechaAlta", nullable = false)
	private Date fechaAlta;
	
	@Column(name = "fechaBaja", nullable = false)
	private Date fechaBaja;
	
	@Column(name = "contrato", length = 20, nullable = false)
	private String contrato;
	
	@Column(name = "fechaContrato", nullable = false)
	private Date fechaContrato;
	
	@Column(name = "categoria", length = 20, nullable = false)
	private String categoria;
	
	@Column(name = "fechaCategoria", nullable = false)
	private Date fechaCategoria;
	
	@Column(name = "salario", length = 15, nullable = false)
	private String salario;
	
	@Column(name = "fechaSalario", nullable = false)
	private Date fechaSalario;
	
	@Column(name = "correoEmpresa", length = 50, nullable = false)
	private String correoEmpresa;
	
	@Column(name = "telefonoEmpresa", length = 15, nullable = false)
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


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
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


	public HistoricoEmpleadoEmpresa(int id, int idEmpresa, int idEmpleado, Date fechaAlta, Date fechaBaja,
			String contrato, Date fechaContrato, String categoria, Date fechaCategoria, String salario,
			Date fechaSalario, String correoEmpresa, String telefonoEmpresa) {
		super();
		this.id = id;
		this.idEmpresa = idEmpresa;
		this.idEmpleado = idEmpleado;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.contrato = contrato;
		this.fechaContrato = fechaContrato;
		this.categoria = categoria;
		this.fechaCategoria = fechaCategoria;
		this.salario = salario;
		this.fechaSalario = fechaSalario;
		this.correoEmpresa = correoEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
	}

	public HistoricoEmpleadoEmpresa () {}

}
