package com.onetec.globalapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.onetec.globalapp.converter.CategoriaConverter;
import com.onetec.globalapp.entity.Categoria;
import com.onetec.globalapp.model.CategoriaModel;
import com.onetec.globalapp.repository.CategoriaRepository;

@Service("categoriaServiceImpl")
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	@Qualifier("categoriaRepository")
	CategoriaRepository categoriaRepository;
	
	@Autowired
	@Qualifier("categoriaConverter")
	CategoriaConverter categoriaConverter;
	
	@Override
	public List<CategoriaModel> listadoCategoria() {
		
		List<Categoria> categorias = categoriaRepository.findAll();
		List<CategoriaModel> categoriaModel = new ArrayList<CategoriaModel>();
		
		for (Categoria categoria : categorias) {
			categoriaModel.add(categoriaConverter.converterCategoriaACategoriaModel(categoria));
		}
		return categoriaModel;
	}

	
	
}
