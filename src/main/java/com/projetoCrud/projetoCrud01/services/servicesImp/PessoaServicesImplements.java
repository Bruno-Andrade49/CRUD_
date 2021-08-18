package com.projetoCrud.projetoCrud01.services.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoCrud.projetoCrud01.model.Pessoa;
import com.projetoCrud.projetoCrud01.repositories.PessoaRepository;
import com.projetoCrud.projetoCrud01.services.PessoaServices;

@Service
public class PessoaServicesImplements implements PessoaServices{

	@Autowired
	PessoaRepository pessoaRepository;
	
	
	@Override
	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	@Override
	public Pessoa findById(long id) {
		return  pessoaRepository.findById(id).get();
	}

	@Override
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@Override
	public Pessoa deleteById(long id) {
		 pessoaRepository.deleteById(id);
		return null;
	}

}
