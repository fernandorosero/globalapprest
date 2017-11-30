package com.onetec.globalapp.converter;

import org.springframework.stereotype.Component;

import com.onetec.globalapp.entity.Compromiso;

import com.onetec.globalapp.model.CompromisoModel;

@Component("compromisoConverter")
public class CompromisoConverter {

	
	/**
	 * 
	 * Convertir de CompromisoModel a Compromiso
	 * 
	 * @param compromisoModel
	 * @return compromiso
	 */
	public Compromiso converterCompromisoModelACompromiso(CompromisoModel compromisoModel) {
		
		Compromiso compromiso = new Compromiso();
		
		compromiso.setId(compromisoModel.getId());
		compromiso.setIdEmpleado(compromisoModel.getIdEmpleado());
		compromiso.setNombreCompromiso(compromisoModel.getNombreCompromiso());
		compromiso.setRealizado(compromisoModel.isRealizado());
		compromiso.setObservaciones(compromisoModel.getObservaciones());
		compromiso.setFechaAlta(compromisoModel.getFechaAlta());
		compromiso.setFechaCompromiso(compromisoModel.getFechaCompromiso());
		compromiso.setFechaCumplimiento(compromisoModel.getFechaCumplimiento());
		compromiso.setResponsable(compromisoModel.getResponsable());
		
		return compromiso;
	}
	
	/**
	 * 
	 * Convertir de Compromiso a CompromisoModel
	 * 
	 * @param compromiso
	 * @return compromisoModel
	 */
	public CompromisoModel converterCompromisoACompromisoModel(Compromiso compromiso) {
		
		CompromisoModel compromisoModel = new CompromisoModel();
		
		compromisoModel.setId(compromiso.getId());
		compromisoModel.setIdEmpleado(compromiso.getIdEmpleado());
		compromisoModel.setNombreCompromiso(compromiso.getNombreCompromiso());
		compromisoModel.setRealizado(compromiso.isRealizado());
		compromisoModel.setObservaciones(compromiso.getObservaciones());
		compromisoModel.setFechaAlta(compromiso.getFechaAlta());
		compromisoModel.setFechaCompromiso(compromiso.getFechaCompromiso());
		compromisoModel.setFechaCumplimiento(compromiso.getFechaCumplimiento());
		compromisoModel.setResponsable(compromiso.getResponsable());
		
		return compromisoModel;
	}
}
