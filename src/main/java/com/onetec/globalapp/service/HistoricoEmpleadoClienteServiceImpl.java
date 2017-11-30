package com.onetec.globalapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.onetec.globalapp.converter.HistoricoEmpleadoClienteConverter;
import com.onetec.globalapp.entity.HistoricoEmpleadoCliente;
import com.onetec.globalapp.model.HistoricoEmpleadoClienteModel;
import com.onetec.globalapp.repository.HistoricoEmpleadoClienteRepository;

@Service("historicoEmpleadoClienteServiceImpl")
public class HistoricoEmpleadoClienteServiceImpl implements HistoricoEmpleadoClienteService{

	@Autowired
	@Qualifier("historicoEmpleadoClienteRepository")
	private HistoricoEmpleadoClienteRepository historicoEmpleadoClienteRepository;
	
	@Autowired
	@Qualifier("historicoEmpleadoClienteConverter")
	private HistoricoEmpleadoClienteConverter historicoEmpleadoClienteConverter;
	
	@Override
	public List<HistoricoEmpleadoClienteModel> listadoHistoricoEmpleadoCliente() {
		
		List<HistoricoEmpleadoCliente> historicosEC = historicoEmpleadoClienteRepository.findAll();
		List<HistoricoEmpleadoClienteModel> historicoEmpleadoClienteModel = new ArrayList<HistoricoEmpleadoClienteModel>();
		
		for (HistoricoEmpleadoCliente historicoEC : historicosEC) {
			historicoEmpleadoClienteModel.add(historicoEmpleadoClienteConverter.converterHistoricoEmpleadoClienteAHistoricoEmpleadoClienteModel(historicoEC));
		}
		
		return historicoEmpleadoClienteModel;
	}

	
}
