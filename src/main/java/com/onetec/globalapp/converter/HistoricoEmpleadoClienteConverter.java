package com.onetec.globalapp.converter;

import org.springframework.stereotype.Component;

import com.onetec.globalapp.entity.HistoricoEmpleadoCliente;
import com.onetec.globalapp.model.HistoricoEmpleadoClienteModel;

@Component("historicoEmpleadoClienteConverter")
public class HistoricoEmpleadoClienteConverter {

	/**
	 * 
	 * Convertir de HistoricoEmpleadoClienteModel a HistoricoEmpleadoCliente
	 * 
	 * @param historicoEmpleadoClienteModel
	 * @return historicoEmpleadoCliente
	 */
	public HistoricoEmpleadoCliente converterHistoricoEmpleadoClienteModelAHistoricoEmpleadoCliente(HistoricoEmpleadoClienteModel historicoEmpleadoClienteModel) {
		
		HistoricoEmpleadoCliente historicoEmpleadoCliente = new HistoricoEmpleadoCliente();
		
		historicoEmpleadoCliente.setId(historicoEmpleadoClienteModel.getId());
		historicoEmpleadoCliente.setIdEmpleado(historicoEmpleadoClienteModel.getIdEmpleado());
		historicoEmpleadoCliente.setIdCliente(historicoEmpleadoClienteModel.getIdCliente());
		historicoEmpleadoCliente.setFechaAlta(historicoEmpleadoClienteModel.getFechaAlta());
		historicoEmpleadoCliente.setFechaBaja(historicoEmpleadoClienteModel.getFechaBaja());
		historicoEmpleadoCliente.setResponsable(historicoEmpleadoClienteModel.getResponsable());
		historicoEmpleadoCliente.setProyecto(historicoEmpleadoClienteModel.getProyecto());
		historicoEmpleadoCliente.setCorreoEmpleadoCliente(historicoEmpleadoClienteModel.getCorreoEmpleadoCliente());
		historicoEmpleadoCliente.setTelefonoEmpleadoCliente(historicoEmpleadoClienteModel.getTelefonoEmpleadoCliente());
		historicoEmpleadoCliente.setDireccion(historicoEmpleadoClienteModel.getDireccion());
		historicoEmpleadoCliente.setLocalidad(historicoEmpleadoClienteModel.getLocalidad());
		historicoEmpleadoCliente.setCodigoPostal(historicoEmpleadoClienteModel.getCodigoPostal());
		historicoEmpleadoCliente.setProvincia(historicoEmpleadoClienteModel.getProvincia());
		
		return historicoEmpleadoCliente;
	}
	
	
	/**
	 * 
	 * Convertir HistoricoEmpleadoCliente a HistoricoEmpleadoClienteModel
	 * 
	 * @param historicoEmpleadoCliente
	 * @return historicoEmpleadoClienteModel
	 */
	public HistoricoEmpleadoClienteModel converterHistoricoEmpleadoClienteAHistoricoEmpleadoClienteModel(HistoricoEmpleadoCliente historicoEmpleadoCliente) {
		
		HistoricoEmpleadoClienteModel historicoEmpleadoClienteModel = new HistoricoEmpleadoClienteModel();
		
		historicoEmpleadoClienteModel.setId(historicoEmpleadoCliente.getId());
		historicoEmpleadoClienteModel.setIdEmpleado(historicoEmpleadoCliente.getIdEmpleado());
		historicoEmpleadoClienteModel.setIdCliente(historicoEmpleadoCliente.getIdCliente());
		historicoEmpleadoClienteModel.setFechaAlta(historicoEmpleadoCliente.getFechaAlta());
		historicoEmpleadoClienteModel.setFechaBaja(historicoEmpleadoCliente.getFechaBaja());
		historicoEmpleadoClienteModel.setResponsable(historicoEmpleadoCliente.getResponsable());
		historicoEmpleadoClienteModel.setProyecto(historicoEmpleadoCliente.getProyecto());
		historicoEmpleadoClienteModel.setCorreoEmpleadoCliente(historicoEmpleadoCliente.getCorreoEmpleadoCliente());
		historicoEmpleadoClienteModel.setTelefonoEmpleadoCliente(historicoEmpleadoCliente.getTelefonoEmpleadoCliente());
		historicoEmpleadoClienteModel.setDireccion(historicoEmpleadoCliente.getDireccion());
		historicoEmpleadoClienteModel.setLocalidad(historicoEmpleadoCliente.getLocalidad());
		historicoEmpleadoClienteModel.setCodigoPostal(historicoEmpleadoCliente.getCodigoPostal());
		historicoEmpleadoClienteModel.setProvincia(historicoEmpleadoCliente.getProvincia());
		
		return historicoEmpleadoClienteModel;
		
	}
}
