package com.onetec.globalapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.onetec.globalapp.converter.EmpleadoConverter;
import com.onetec.globalapp.entity.Empleado;
import com.onetec.globalapp.model.EmpleadoModel;
import com.onetec.globalapp.repository.EmpleadoRepository;

@Service("empleadoServiceImpl")
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	@Qualifier("empleadoRepository")
	private EmpleadoRepository empleadoRepository;
	
	@Autowired
	@Qualifier("empleadoConverter")
	private EmpleadoConverter empleadoConverter;
	
	@Override
	public EmpleadoModel agregarEmpleado(EmpleadoModel empleadoModel) {
		
		Empleado empleado = empleadoRepository.save(empleadoConverter.converterEmpleadoModelAEmpleado(empleadoModel));
		
		return empleadoConverter.converterEmpleadoAEmpleadoModel(empleado);
		
	}

	@Override
	public EmpleadoModel buscarEmpleadoPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpleadoModel actualizarEmpleadoPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpleadoModel actualizarEmpleadoPorModel(EmpleadoModel empleadoModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void darBajaEmpleado(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void darBajaEmpleadoPorModel(EmpleadoModel empleadoModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EmpleadoModel> listTodosEmpleados() {
		List<Empleado> empleados = empleadoRepository.findAll();
		List<EmpleadoModel> empleadosModel = new ArrayList<EmpleadoModel>();
		for (Empleado empleado : empleados) {
			empleadosModel.add(empleadoConverter.converterEmpleadoAEmpleadoModel(empleado));
		}
		return empleadosModel;
	}

	
	
}
