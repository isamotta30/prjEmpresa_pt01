package com.PrjEmpresa.PrjEmpresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PrjEmpresa.PrjEmpresa.entities.Funcionario;
import com.PrjEmpresa.PrjEmpresa.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;
	
	
	@Autowired
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	public Funcionario saveFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	public Funcionario getFuncionarioByfuncodigo(Long funcodigo) {
		return funcionarioRepository.deleteByFuncodigo(funcodigo).orElse(null);
	}
	public List<Funcionario> getAllFuncionario(){
		return funcionarioRepository.findAll();
	}
	public void deleteFuncionario(Long funcodigo) {
		funcionarioRepository.deleteByFuncodigo(funcodigo);
	}
	

	}


