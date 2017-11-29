package com.onetec.globalapp.service;

import java.util.List;

import com.onetec.globalapp.model.EmpleadoModel;

public interface EmpleadoService {

	public abstract EmpleadoModel agregarEmpleado(EmpleadoModel empleadoModel);
	
	public abstract EmpleadoModel buscarEmpleadoPorId(int id);
	
	public abstract EmpleadoModel actualizarEmpleadoPorId(int id);
	
	public abstract EmpleadoModel actualizarEmpleadoPorModel(EmpleadoModel empleadoModel);
	
	public abstract void darBajaEmpleado(int id);
	
	public abstract void darBajaEmpleadoPorModel(EmpleadoModel empleadoModel); 
	
	public abstract List<EmpleadoModel> listTodosEmpleados();
}
