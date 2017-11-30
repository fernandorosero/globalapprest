package com.onetec.globalapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.onetec.globalapp.converter.HistoricoEmpleadoEmpresaConverter;
import com.onetec.globalapp.entity.HistoricoEmpleadoEmpresa;
import com.onetec.globalapp.model.HistoricoEmpleadoEmpresaModel;
import com.onetec.globalapp.repository.HistoricoEmpleadoEmpresaRepository;

@Service("historicoEmpleadoEmpresaServiceImpl")
public class HistoricoEmpleadoEmpresaServiceImpl implements HistoricoEmpleadoEmpresaService{

	@Autowired
	@Qualifier("historicoEmpleadoEmpresaRepository")
	private HistoricoEmpleadoEmpresaRepository historicoEmpleadoEmpresaRepository;
	
	@Autowired
	@Qualifier("historicoEmpleadoEmpresaConverter")
	private HistoricoEmpleadoEmpresaConverter historicoEmpleadoEmpresaConverter;
	
	@Override
	public List<HistoricoEmpleadoEmpresaModel> listTodosHistoricoEmpleadoEmpresas() {
		
		List<HistoricoEmpleadoEmpresa> historicosEmpleadoEmpresa = historicoEmpleadoEmpresaRepository.findAll();
		List<HistoricoEmpleadoEmpresaModel> historicosEmpresaEmpleadoModel = new ArrayList<HistoricoEmpleadoEmpresaModel>();
		
		for (HistoricoEmpleadoEmpresa historicoEE : historicosEmpleadoEmpresa) {
			historicosEmpresaEmpleadoModel.add(historicoEmpleadoEmpresaConverter.converterHistoricoEmpleadoEmpresaAHistoricoEmpleadoEmpresaModel(historicoEE));
		}
		
		return historicosEmpresaEmpleadoModel;
	}
	
	

}
