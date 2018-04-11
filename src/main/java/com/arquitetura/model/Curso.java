package com.arquitetura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso implements BaseEntity<Long> {
	
	private static final long serialVersionUID = 1666568517189884833L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "codigo_curso")
	private String codigoCurso;
	
	@Column(name = "nome_curso")
	private String nomeCurso;
	
	@Column(name = "instituicao_ensino")
	private String instituicaoEnsino;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}

	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}
	
	

}
