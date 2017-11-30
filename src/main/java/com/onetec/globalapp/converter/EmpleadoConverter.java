package com.onetec.globalapp.converter;

import org.springframework.stereotype.Component;

import com.onetec.globalapp.entity.Empleado;
import com.onetec.globalapp.model.EmpleadoModel;

@Component("empleadoConverter")
public class EmpleadoConverter {

	/**
	 * 
	 * Clase para convertir un EmpleadoConverter a Empleado
	 * 
	 * @param empleadoModel
	 * @return empleado
	 */
	public Empleado converterEmpleadoModelAEmpleado(EmpleadoModel empleadoModel){
		
		Empleado empleado = new Empleado();
		
		empleado.setId(empleadoModel.getId());
		empleado.setNombre(empleadoModel.getNombre());
		empleado.setApellido1(empleadoModel.getApellido1());
		empleado.setApellido2(empleadoModel.getApellido2());
		empleado.setNif(empleadoModel.getNif());
		empleado.setSexo(empleadoModel.getSexo());
		empleado.setCv(empleadoModel.getCv());
		empleado.setPaisNacimiento(empleadoModel.getPaisNacimiento());
		empleado.setProvinciaNacimiento(empleadoModel.getProvinciaNacimiento());
		empleado.setFechaNacimiento(empleadoModel.getFechaNacimiento());
		empleado.setTitulacion(empleadoModel.getTitulacion());
		empleado.setCorreoPersonal(empleadoModel.getCorreoPersonal());
		empleado.setTelefonoPersonal(empleadoModel.getTelefonoPersonal());
		empleado.setDireccion(empleadoModel.getDireccion());
		empleado.setLocalidad(empleadoModel.getLocalidad());
		empleado.setCodigoPostal(empleadoModel.getCodigoPostal());
		empleado.setProvincia(empleadoModel.getProvincia());
		
		return empleado;
	}
	
	
	/**
	 * 
	 * Clase para convertir un Empleado a EmpleadoModel
	 * 
	 * @param empleado
	 * @return empleadoModel
	 */
	public EmpleadoModel converterEmpleadoAEmpleadoModel(Empleado empleado) {
		
		EmpleadoModel empleadoModel =  new EmpleadoModel();
		
		empleadoModel.setId(empleado.getId());
		empleadoModel.setNombre(empleado.getNombre());
		empleadoModel.setApellido1(empleado.getApellido1());
		empleadoModel.setApellido2(empleado.getApellido2());
		empleadoModel.setNif(empleado.getNif());
		empleadoModel.setSexo(empleado.getSexo());
		empleadoModel.setCv(empleado.getCv());
		empleadoModel.setPaisNacimiento(empleado.getPaisNacimiento());
		empleadoModel.setProvinciaNacimiento(empleado.getProvinciaNacimiento());
		empleadoModel.setFechaNacimiento(empleado.getFechaNacimiento());
		empleadoModel.setTitulacion(empleado.getTitulacion());
		empleadoModel.setCorreoPersonal(empleado.getCorreoPersonal());
		empleadoModel.setTelefonoPersonal(empleado.getTelefonoPersonal());
		empleadoModel.setDireccion(empleado.getDireccion());
		empleadoModel.setLocalidad(empleado.getLocalidad());
		empleadoModel.setCodigoPostal(empleado.getCodigoPostal());
		empleadoModel.setProvincia(empleado.getProvincia());
		
		return empleadoModel;
	}
}
