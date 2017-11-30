package com.onetec.globalapp.converter;

import org.springframework.stereotype.Component;

import com.onetec.globalapp.entity.Cliente;
import com.onetec.globalapp.model.ClienteModel;

@Component("clienteConverter")
public class ClienteConverter {

	/**
	 * 
	 * Convierte de ClienteModel a Cliente
	 * 
	 * @param clienteModel
	 * @return cliente
	 */
	public Cliente converterClienteModelACliente(ClienteModel clienteModel) {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(clienteModel.getId());
		cliente.setNombre(clienteModel.getNombre());
		cliente.setTelefono(clienteModel.getTelefono());
		cliente.setDireccion(clienteModel.getDireccion());
		cliente.setLocalidad(clienteModel.getLocalidad());
		cliente.setCodigoPostal(clienteModel.getCodigoPostal());
		cliente.setPais(clienteModel.getPais());
		cliente.setProvincia(clienteModel.getProvincia());
		
		return cliente;
	}
	
	/**
	 * 
	 * Convierte de Cliente a ClienteModel
	 * 
	 * @param cliente
	 * @return clienteModel
	 */
	public ClienteModel converterClienteAClienteModel(Cliente cliente) {
		
		ClienteModel clienteModel = new ClienteModel();
		
		clienteModel.setId(cliente.getId());
		clienteModel.setNombre(cliente.getNombre());
		clienteModel.setTelefono(cliente.getTelefono());
		clienteModel.setDireccion(cliente.getDireccion());
		clienteModel.setLocalidad(cliente.getLocalidad());
		clienteModel.setCodigoPostal(cliente.getCodigoPostal());
		clienteModel.setPais(cliente.getPais());
		clienteModel.setProvincia(cliente.getProvincia());
		
		return clienteModel;
	}
}
