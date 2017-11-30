package com.onetec.globalapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.onetec.globalapp.converter.EmpresaConverter;
import com.onetec.globalapp.entity.Empresa;
import com.onetec.globalapp.model.EmpresaModel;
import com.onetec.globalapp.repository.EmpresaRepository;

@Service("empresaServiceImpl")
public class EmpresaServiceImpl implements EmpresaService{

	@Autowired
	@Qualifier("empresaRepository")
	private EmpresaRepository empresaRepository;
	
	@Autowired
	@Qualifier("empresaConverter")
	private EmpresaConverter empresaConverter;
	
	@Override
	public List<EmpresaModel> listEmpresas() {
		List<Empresa> empresas = empresaRepository.findAll();
		List<EmpresaModel> empresaModel = new ArrayList<EmpresaModel>();
		for (Empresa empresa : empresas) {
			empresaModel.add(empresaConverter.converterEmpresaAEmpresaModel(empresa));
		}
		return empresaModel;
	}

	
	
}
