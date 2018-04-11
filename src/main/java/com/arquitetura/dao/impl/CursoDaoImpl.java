package com.arquitetura.dao.impl;

import org.springframework.stereotype.Repository;

import com.arquitetura.dao.CursoDao;
import com.arquitetura.model.Curso;


@Repository("cursoDao")
public class CursoDaoImpl extends BaseDaoImpl<Curso> implements CursoDao {

	private static final long serialVersionUID = 3453246953287637933L;

}
