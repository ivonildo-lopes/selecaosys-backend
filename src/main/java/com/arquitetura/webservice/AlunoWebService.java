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
import com.arquitetura.model.Aluno;
import com.arquitetura.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoWebService implements Serializable {

	private static final long serialVersionUID = 5362561488293747934L;

	@Autowired
	private AlunoService service;

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
	public MessageTO save(@RequestBody Aluno objeto) {
		try {
			Aluno aluno = this.service.save(objeto);

			if (aluno != null) {
				return new MessageTO("Sucesso", true, aluno);
			}
			return new MessageTO("Erro", false, "Não foi possivel salvar o aluno");
		} catch (RuntimeException e) {
			return new MessageTO("Erro", false, "Não foi possivel salvar o aluno");
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public MessageTO update(@PathVariable("id") Long id, @RequestBody Aluno objeto) {
		try {

			Aluno aluno = null;
			if (id == objeto.getId() && objeto != null) {
				aluno = this.service.save(objeto);
			}

			if (aluno != null) {
				return new MessageTO("Sucesso", true, aluno);
			}
			return new MessageTO("Erro", false, "Não foi possivel atualizar o aluno");
		} catch (RuntimeException e) {
			return new MessageTO("Erro", false, "Não foi possivel salvar o aluno");
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public MessageTO delete(@PathVariable("id") Long id) {
		try {
			Aluno aluno = this.service.findById(id);

			if (aluno != null) {
				this.service.delete(aluno);
			}

			return new MessageTO("Sucesso", true, service.findAll());
		} catch (RuntimeException e) {
			return new MessageTO("Erro", false, "Não foi possivel Deletar o curso");
		}
	}

}
