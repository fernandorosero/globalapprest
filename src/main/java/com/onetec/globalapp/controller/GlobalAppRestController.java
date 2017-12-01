package com.onetec.globalapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetec.globalapp.model.CategoriaModel;
import com.onetec.globalapp.model.ClienteModel;
import com.onetec.globalapp.model.CompromisoModel;
import com.onetec.globalapp.model.EmpleadoModel;
import com.onetec.globalapp.model.EmpresaModel;
import com.onetec.globalapp.model.HistoricoEmpleadoClienteModel;
import com.onetec.globalapp.model.HistoricoEmpleadoEmpresaModel;
import com.onetec.globalapp.service.CategoriaService;
import com.onetec.globalapp.service.ClienteService;
import com.onetec.globalapp.service.CompromisoService;
import com.onetec.globalapp.service.EmpleadoService;
import com.onetec.globalapp.service.EmpresaService;
import com.onetec.globalapp.service.HistoricoEmpleadoClienteService;
import com.onetec.globalapp.service.HistoricoEmpleadoEmpresaService;

@RestController
@RequestMapping("/get")
public class GlobalAppRestController {

	@Autowired
	@Qualifier("empleadoServiceImpl")
	private EmpleadoService empleadoService;
	
	@Autowired
	@Qualifier("historicoEmpleadoEmpresaServiceImpl")
	private HistoricoEmpleadoEmpresaService historicoEmpleadoEmpresaService;
	
	@Autowired
	@Qualifier("empresaServiceImpl")
	private EmpresaService empresaService;
	
	@Autowired
	@Qualifier("clienteServiceImpl")
	private ClienteService clienteService;
	
	@Autowired
	@Qualifier("categoriaServiceImpl")
	private CategoriaService categoriaService;
	
	@Autowired
	@Qualifier("compromisoServiceImpl")
	private CompromisoService compromisoService;
	
	@Autowired
	@Qualifier("historicoEmpleadoClienteServiceImpl")
	private HistoricoEmpleadoClienteService historicoEmpleadoClienteService;
	
	@GetMapping("/listadoEmpleados")
	public ResponseEntity<List<EmpleadoModel>> listadoEmpleados() {
		
		//EmpleadoModel empleadoModel = new EmpleadoModel(1,"Fernando", "Rosero", "Pintado","11867755P", "hombre", "c:/docs/cv.txt","Ecuador","Pi",new Date(), "Ing Informatico"," fer@fer.com", "619", "LAs aguilas", "Madrid", "28044", "Madrid");
		
		List<EmpleadoModel> listadoEmpleados = empleadoService.listTodosEmpleados();
		
		return new ResponseEntity<List<EmpleadoModel>>(listadoEmpleados, HttpStatus.OK);
	}
	
	@GetMapping("/listadoHistoricoEmpleadoEmpresas")
	public ResponseEntity<List<HistoricoEmpleadoEmpresaModel>> listadoHistoricoEmpleadoEmpresas() {
		
		List<HistoricoEmpleadoEmpresaModel> listadoHistoricoEmpleadoEmpresa = historicoEmpleadoEmpresaService.listTodosHistoricoEmpleadoEmpresas();
		
		return new ResponseEntity<List<HistoricoEmpleadoEmpresaModel>>(listadoHistoricoEmpleadoEmpresa, HttpStatus.OK);
	}
	
	@GetMapping("/listadoEmpresas")
	public ResponseEntity<List<EmpresaModel>> listadoEmpresa() {
		List<EmpresaModel> listadoEmpresa = empresaService.listEmpresas();
		
		return new ResponseEntity<List<EmpresaModel>>(listadoEmpresa, HttpStatus.OK);
	}
	
	@GetMapping("/listadoClientes")
	public ResponseEntity<List<ClienteModel>> listadoClientes() {
		
		List<ClienteModel> listadoClientes = clienteService.listClientes();
		return new ResponseEntity<List<ClienteModel>>(listadoClientes, HttpStatus.OK);
	}
	
	@GetMapping("/listadoCategorias")
	public ResponseEntity<List<CategoriaModel>> listadoCategorias() {
		
		List<CategoriaModel> listadoCategorias = categoriaService.listadoCategoria();
		return new ResponseEntity<List<CategoriaModel>>(listadoCategorias, HttpStatus.OK);
	}
	
	@GetMapping("/listadoCompromisos")
	public ResponseEntity<List<CompromisoModel>> listadoCompromisos() {
		
		List<CompromisoModel> listadoCompromisos = compromisoService.listadoCompromiso();
		return new ResponseEntity<List<CompromisoModel>>(listadoCompromisos, HttpStatus.OK);
	}
	
	@GetMapping("/listadoHistoricosEmpleadoClientes")
	public ResponseEntity<List<HistoricoEmpleadoClienteModel>> listadoHistoricoEmpleadoCliente() {
		
		List<HistoricoEmpleadoClienteModel> listadoHistoricoEmpleadoCliente = historicoEmpleadoClienteService.listadoHistoricoEmpleadoCliente();
		return new ResponseEntity<List<HistoricoEmpleadoClienteModel>>(listadoHistoricoEmpleadoCliente, HttpStatus.OK);
	}
}
