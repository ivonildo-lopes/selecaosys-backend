package com.arquitetura.webservice;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arquitetura.TO.MessageTO;
import com.arquitetura.model.Curso;
import com.arquitetura.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoWebService implements Serializable {

	private static final long serialVersionUID = 5362561488293747934L;

	@Autowired
	private CursoService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public MessageTO findAll() {
		try {
			return new MessageTO("Sucesso", true, service.findAll());
		} catch (RuntimeException e) {
			return new MessageTO(e.getMessage(), false, e);
		}
	}

	@GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MessageTO findById(@PathVariable("id") Long id) {
		try {
			return new MessageTO("Sucesso", true, service.findById(id));
		} catch (RuntimeException e) {
			return new MessageTO(e.getMessage(), false, e);
		}
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public MessageTO save(@RequestBody Curso objeto) {
		try {
			Curso curso = this.service.save(objeto);

			if (curso != null) {
				return new MessageTO("Sucesso", true, curso);
			}
			return new MessageTO("Erro", false, "Não foi possivel salvar o curso");
		} catch (RuntimeException e) {
			return new MessageTO("Erro", false, "Não foi possivel salvar o curso");
		}

	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public MessageTO delete(@PathVariable("id") Long id) {
		try {
			Curso curso = this.service.findById(id);
			
			if(curso != null) {
				this.service.delete(curso);
			}
			
			return new MessageTO("Sucesso", true, service.findAll());
		} catch (RuntimeException e) {
			return new MessageTO("Erro", false, "Não foi possivel Deletar o curso");
		}
	}

}
