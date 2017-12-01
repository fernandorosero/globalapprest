package com.onetec.globalapp.service;

import java.util.List;

import com.onetec.globalapp.entity.Empleado;
import com.onetec.globalapp.model.CategoriaModel;
import com.onetec.globalapp.model.ClienteModel;
import com.onetec.globalapp.model.CompromisoModel;
import com.onetec.globalapp.model.EmpleadoModel;
import com.onetec.globalapp.model.EmpresaModel;

public interface EmpleadoService {

	public abstract EmpleadoModel agregarEmpleado(EmpleadoModel empleadoModel, EmpresaModel empresaModel, 
			CategoriaModel categoriaModel, CompromisoModel compromisoModel, ClienteModel clienteModel);
	
	//public abstract EmpleadoModel buscarEmpleadoPorId(int id);
	
	public abstract Empleado buscarEmpleadoPorId(int id);
	
	public abstract EmpleadoModel buscarEmpleadoPorIdPorModel(int id);
	
	public abstract EmpleadoModel actualizarEmpleadoPorId(int id);
	
	public abstract EmpleadoModel actualizarEmpleadoPorModel(EmpleadoModel empleadoModel);
	
	public abstract void darBajaEmpleado(int id);
	
	public abstract void darBajaEmpleadoPorModel(EmpleadoModel empleadoModel); 
	
	public abstract List<EmpleadoModel> listTodosEmpleados();
}
