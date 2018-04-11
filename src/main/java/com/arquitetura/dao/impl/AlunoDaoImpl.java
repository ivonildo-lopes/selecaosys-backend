package com.arquitetura.dao.impl;

import org.springframework.stereotype.Repository;

import com.arquitetura.dao.AlunoDao;
import com.arquitetura.model.Aluno;


@Repository("alunoDao")
public class AlunoDaoImpl extends BaseDaoImpl<Aluno> implements AlunoDao{

	private static final long serialVersionUID = -6104464042772510121L;

	

}
