package com.onetec.globalapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.onetec.globalapp.converter.ClienteConverter;
import com.onetec.globalapp.entity.Cliente;
import com.onetec.globalapp.model.ClienteModel;
import com.onetec.globalapp.repository.ClienteRepository;

@Service("clienteServiceImpl")
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	@Qualifier("clienteRepository")
	private ClienteRepository clienteRepository;
	
	@Autowired
	@Qualifier("clienteConverter")
	ClienteConverter clienteConverter;
	
	@Override
	public List<ClienteModel> listClientes() {
		
		List<Cliente> clientes = clienteRepository.findAll();
		List<ClienteModel> clientesModel = new ArrayList<ClienteModel>();
		
		for (Cliente cliente : clientes) {
			clientesModel.add(clienteConverter.converterClienteAClienteModel(cliente));
		}
		
		return clientesModel;
	}

	
}
