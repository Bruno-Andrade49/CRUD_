package com.projetoCrud.projetoCrud01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.projetoCrud.projetoCrud01.model.Pessoa;

@RepositoryRestResource(collectionResourceRel = "pessoa", path = "pessoa")
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
