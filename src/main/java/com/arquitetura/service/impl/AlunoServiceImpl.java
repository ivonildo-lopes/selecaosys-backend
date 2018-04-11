package com.arquitetura.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arquitetura.dao.AlunoDao;
import com.arquitetura.dao.BaseDao;
import com.arquitetura.model.Aluno;
import com.arquitetura.service.AlunoService;

@Service("alunoService")
public class AlunoServiceImpl extends BaseServiceImpl<Aluno> implements AlunoService {

	private static final long serialVersionUID = -6359932964890327270L;
	
	@Autowired
	private AlunoDao dao;

	@Override
	public BaseDao<Aluno> getDao() {
		return dao;
	}

}
