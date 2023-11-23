package com.PrjEmpresa.PrjEmpresa.controllers;
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PrjEmpresa.PrjEmpresa.entities.Funcionario;
import com.PrjEmpresa.PrjEmpresa.services.FuncionarioService;

	@RestController
	@RequestMapping("/departamento")

	public class FuncionarioController {
		private final FuncionarioService funcionarioService;

		@Autowired
		public FuncionarioController(FuncionarioService funcionarioService) {
			this.funcionarioService = funcionarioService;
		}
		@PostMapping
		public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
			return funcionarioService.saveFuncionario(funcionario);
		}
		@GetMapping("/{funcodigo}")
		public Funcionario getFuncionario(@PathVariable Long funcodigo ) {
			return funcionarioService.getFuncionarioByfuncodigo(funcodigo);
		}
		@GetMapping
		public List<Funcionario> getAllFuncionario(){
			return funcionarioService.getAllFuncionario();
		}
		@DeleteMapping("/{}")
		public void deleteFuncionario(@PathVariable Long funcodigo ) {
			funcionarioService.deleteFuncionario(funcodigo);
		}
	}
	
