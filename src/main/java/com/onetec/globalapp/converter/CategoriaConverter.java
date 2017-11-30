package com.onetec.globalapp.converter;

import org.springframework.stereotype.Component;

import com.onetec.globalapp.entity.Categoria;
import com.onetec.globalapp.model.CategoriaModel;

@Component("categoriaConverter")
public class CategoriaConverter {

	/**
	 * 
	 * Convierte de CategoriaModel a Categoria
	 * 
	 * @param categoriaModel
	 * @return categoria
	 */
	public Categoria converterCategoriaModelACategoria(CategoriaModel categoriaModel) {
		
		Categoria categoria = new Categoria();
		
		categoria.setId(categoriaModel.getId());
		categoria.setDescripcion(categoriaModel.getDescripcion());
		
		return categoria;
		
	}
	
	/**
	 * 
	 * Convierte de Categoria a CategoriaModel
	 * 
	 * @param categoria
	 * @return categoriModel
	 */
	public CategoriaModel converterCategoriaACategoriaModel(Categoria categoria) {
		
		CategoriaModel categoriaModel = new CategoriaModel();
		
		categoriaModel.setId(categoria.getId());
		categoriaModel.setDescripcion(categoria.getDescripcion());
		
		return categoriaModel;
	}
}
