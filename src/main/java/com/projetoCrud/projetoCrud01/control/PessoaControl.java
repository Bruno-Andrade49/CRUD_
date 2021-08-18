package com.projetoCrud.projetoCrud01.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projetoCrud.projetoCrud01.model.Pessoa;
import com.projetoCrud.projetoCrud01.services.PessoaServices;

@Controller
public class PessoaControl {
	
	@Autowired
	PessoaServices pessoaServices;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView inicial() {
		ModelAndView modelAndView = new ModelAndView("inicio");
		return modelAndView;
	}
	
	@RequestMapping(value = "/pessoas", method = RequestMethod.GET)
	public ModelAndView getPessoas() {
		ModelAndView modelAndView = new ModelAndView("paginaPessoas");
		List<Pessoa> pessoas = pessoaServices.findAll();
		modelAndView.addObject("paginaPessoas", pessoas);
		return modelAndView;
	}

}
