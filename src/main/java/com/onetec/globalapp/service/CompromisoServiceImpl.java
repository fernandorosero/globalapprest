package com.onetec.globalapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.onetec.globalapp.converter.CompromisoConverter;
import com.onetec.globalapp.entity.Compromiso;
import com.onetec.globalapp.model.CompromisoModel;
import com.onetec.globalapp.repository.CompromisoRepository;

@Service("compromisoServiceImpl")
public class CompromisoServiceImpl implements CompromisoService{

	@Autowired
	@Qualifier("compromisoRepository")
	private CompromisoRepository compromisoRepository;
	
	@Autowired
	@Qualifier("compromisoConverter")
	private CompromisoConverter compromisoConverter;
	
	@Override
	public List<CompromisoModel> listadoCompromiso() {
		
		List<Compromiso> compromisos = compromisoRepository.findAll();
		List<CompromisoModel> compromisoModel = new ArrayList<CompromisoModel>();
		
		for (Compromiso compromiso : compromisos) {
			compromisoModel.add(compromisoConverter.converterCompromisoACompromisoModel(compromiso));
		}
		return compromisoModel;
	}

	
}
