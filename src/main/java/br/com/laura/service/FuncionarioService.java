package br.com.laura.service;

import java.util.List;

import br.com.laura.model.Funcionario;

public interface FuncionarioService {

	public List<Funcionario> obterTodos();
	
	public Funcionario obterPorCodigo(String codigo);
	
	public Funcionario criar (Funcionario funcionario);
	
	public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);

	public List<Funcionario> obterFuncionariosPorNome(String nome);

}
