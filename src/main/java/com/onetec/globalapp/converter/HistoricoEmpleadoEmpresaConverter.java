package com.onetec.globalapp.converter;

import org.springframework.stereotype.Component;

import com.onetec.globalapp.entity.HistoricoEmpleadoEmpresa;
import com.onetec.globalapp.model.HistoricoEmpleadoEmpresaModel;

@Component("historicoEmpleadoEmpresaConverter")
public class HistoricoEmpleadoEmpresaConverter {

	/**
	 * 
	 * Convierte de HistoricoEmpleadoClienteModel a HistoricoEmpleadoEmpresa
	 * 
	 * @param historicoEmpleadoClienteModel
	 * @return historicoEmpleadoEmpresa
	 */
	public HistoricoEmpleadoEmpresa converterHistoricoEmpleadoEmpresaModelAHistoricoEmpleadoEmpresa(HistoricoEmpleadoEmpresaModel historicoEmpleadoEmpresaModel) {
		
		HistoricoEmpleadoEmpresa historicoEmpleadoEmpresa = new HistoricoEmpleadoEmpresa();
		
		historicoEmpleadoEmpresa.setId(historicoEmpleadoEmpresaModel.getId());
		historicoEmpleadoEmpresa.setIdEmpresa(historicoEmpleadoEmpresaModel.getIdEmpresa());
		historicoEmpleadoEmpresa.setIdEmpleado(historicoEmpleadoEmpresaModel.getIdEmpleado());
		historicoEmpleadoEmpresa.setIdCategoria(historicoEmpleadoEmpresaModel.getIdCategoria());
		historicoEmpleadoEmpresa.setFechaAlta(historicoEmpleadoEmpresaModel.getFechaAlta());
		historicoEmpleadoEmpresa.setFechaBaja(historicoEmpleadoEmpresaModel.getFechaBaja());
		historicoEmpleadoEmpresa.setContrato(historicoEmpleadoEmpresaModel.getContrato());
		historicoEmpleadoEmpresa.setFechaContrato(historicoEmpleadoEmpresaModel.getFechaContrato());
		historicoEmpleadoEmpresa.setFechaCategoria(historicoEmpleadoEmpresaModel.getFechaCategoria());
		historicoEmpleadoEmpresa.setSalario(historicoEmpleadoEmpresaModel.getSalario());
		historicoEmpleadoEmpresa.setFechaSalario(historicoEmpleadoEmpresaModel.getFechaSalario());
		historicoEmpleadoEmpresa.setCorreoEmpresa(historicoEmpleadoEmpresaModel.getCorreoEmpresa());
		historicoEmpleadoEmpresa.setTelefonoEmpresa(historicoEmpleadoEmpresaModel.getTelefonoEmpresa());
		
		return historicoEmpleadoEmpresa;
	}
	
	/**
	 * 
	 * Convierte de HistoricoEmpleadoEmpresa a HistoricoEmpleadoEmpresaModel
	 * 
	 * @param historicoEmpleadoEmpresa
	 * @return historicoEmpleadoEmpresaModel
	 */
	public HistoricoEmpleadoEmpresaModel converterHistoricoEmpleadoEmpresaAHistoricoEmpleadoEmpresaModel(HistoricoEmpleadoEmpresa historicoEmpleadoEmpresa ){
		
		HistoricoEmpleadoEmpresaModel historicoEmpleadoEmpresaModel =  new HistoricoEmpleadoEmpresaModel();
		
		historicoEmpleadoEmpresaModel.setId(historicoEmpleadoEmpresa.getId());
		historicoEmpleadoEmpresaModel.setIdEmpresa(historicoEmpleadoEmpresa.getIdEmpresa());
		historicoEmpleadoEmpresaModel.setIdEmpleado(historicoEmpleadoEmpresa.getIdEmpleado());
		historicoEmpleadoEmpresaModel.setIdCategoria(historicoEmpleadoEmpresa.getIdCategoria());
		historicoEmpleadoEmpresaModel.setFechaAlta(historicoEmpleadoEmpresa.getFechaAlta());
		historicoEmpleadoEmpresaModel.setFechaBaja(historicoEmpleadoEmpresa.getFechaBaja());
		historicoEmpleadoEmpresaModel.setContrato(historicoEmpleadoEmpresa.getContrato());
		historicoEmpleadoEmpresaModel.setFechaContrato(historicoEmpleadoEmpresa.getFechaContrato());
		historicoEmpleadoEmpresaModel.setFechaCategoria(historicoEmpleadoEmpresa.getFechaCategoria());
		historicoEmpleadoEmpresaModel.setSalario(historicoEmpleadoEmpresa.getSalario());
		historicoEmpleadoEmpresaModel.setFechaSalario(historicoEmpleadoEmpresa.getFechaSalario());
		historicoEmpleadoEmpresaModel.setCorreoEmpresa(historicoEmpleadoEmpresa.getCorreoEmpresa());
		historicoEmpleadoEmpresaModel.setTelefonoEmpresa(historicoEmpleadoEmpresa.getTelefonoEmpresa());
		
		return historicoEmpleadoEmpresaModel;
		
	}
	
}
