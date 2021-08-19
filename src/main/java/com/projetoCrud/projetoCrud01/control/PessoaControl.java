package com.projetoCrud.projetoCrud01.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping(value = "/salvarpessoa", method = RequestMethod.GET)
	public ModelAndView paginaCadastro() {
		ModelAndView modelAndView = new ModelAndView("pessoasCadastro");
		return modelAndView;
	}
	
	@RequestMapping(value = "/salvarpessoa", method = RequestMethod.POST)
	public String salvarPessoa(@Validated Pessoa pessoa, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "redirect:/salvarpessoa";
		} 
		pessoaServices.save(pessoa);
		return "redirect:/pessoas";
	}

}
