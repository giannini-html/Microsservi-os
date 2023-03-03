package com.github.acnaweb.study_api.service;

import java.util.ArrayList;
import java.util.List;

import com.github.acnaweb.study_api.model.Pessoa;

public class PessoaService {
	private List<Pessoa> pessoas;
	
	public PessoaService() {
		load();
	}
	
	private void load() {
		pessoas = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1L);
		pessoa.setNome("AC");
		pessoas.add(pessoa);
				
		pessoa = new Pessoa();
		pessoa.setId(2L);
		pessoa.setNome("Pelé");
		pessoas.add(pessoa);
		
		pessoa = new Pessoa();
		pessoa.setId(3L);
		pessoa.setNome("Messi");
		pessoas.add(pessoa);
		
	}
	
	public List<Pessoa> list() {
		return pessoas;
	}
}
