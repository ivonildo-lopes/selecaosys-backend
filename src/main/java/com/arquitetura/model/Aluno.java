package com.arquitetura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno implements BaseEntity<Long> {

	private static final long serialVersionUID = -7650781614573514989L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nome_aluno")
	private String nome;

	@OneToOne
	@JoinColumn(name = "id_curso")
	private Curso curso;

	@Column(name = "matricula_aluno")
	private Integer matricula;

	@Column(name = "semestre_aluno")
	private Integer semestre;

	@Enumerated(EnumType.STRING)
	private Status status;

	@Override
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
