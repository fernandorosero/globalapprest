package com.onetec.globalapp.converter;

import org.springframework.stereotype.Component;

import com.onetec.globalapp.entity.Empresa;
import com.onetec.globalapp.model.EmpresaModel;

@Component("empresaConverter")
public class EmpresaConverter {

	/**
	 * 
	 * Convierte de EmpresaModel a Empresa
	 * 
	 * @param empresaModel
	 * @return empresa
	 */
	public Empresa converterEmpresaModelAEmpresa(EmpresaModel empresaModel) {
		
		Empresa empresa = new Empresa();
		
		empresa.setId(empresaModel.getId());
		empresa.setCif(empresaModel.getCif());
		empresa.setNombre(empresaModel.getNombre());
		empresa.setTelefono(empresaModel.getTelefono());
		empresa.setDireccion(empresaModel.getDireccion());
		empresa.setLocalidad(empresaModel.getLocalidad());
		empresa.setCodigoPostal(empresaModel.getCodigoPostal());
		empresa.setPais(empresaModel.getPais());
		empresa.setProvincia(empresaModel.getProvincia());
		
		return empresa;
	}
	
	/**
	 * 
	 * Convierte de Empresa a EmpresaModel
	 * 
	 * @param empresa
	 * @return empresaModel
	 */
	public EmpresaModel converterEmpresaAEmpresaModel(Empresa empresa) {
		
		EmpresaModel empresaModel = new EmpresaModel();
		
		empresaModel.setId(empresa.getId());
		empresaModel.setCif(empresa.getCif());
		empresaModel.setNombre(empresa.getNombre());
		empresaModel.setTelefono(empresa.getTelefono());
		empresaModel.setDireccion(empresa.getDireccion());
		empresaModel.setLocalidad(empresa.getLocalidad());
		empresaModel.setCodigoPostal(empresa.getCodigoPostal());
		empresaModel.setPais(empresa.getPais());
		empresaModel.setProvincia(empresa.getProvincia());
		
		return empresaModel;
	}
	
}
