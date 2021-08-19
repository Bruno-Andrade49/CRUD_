package com.projetoCrud.projetoCrud01.services;

import java.util.List;

import com.projetoCrud.projetoCrud01.model.Pessoa;

public interface PessoaServices {
	
	List<Pessoa> findAll();
	Pessoa findById(int id);
	Pessoa save(Pessoa pessoa);
	Pessoa deleteById(int id);

}
