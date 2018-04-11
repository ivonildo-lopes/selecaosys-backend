package com.arquitetura.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arquitetura.dao.BaseDao;
import com.arquitetura.dao.CursoDao;
import com.arquitetura.model.Curso;
import com.arquitetura.service.CursoService;

@Service("cursoService")
public class CursoServiceImpl extends BaseServiceImpl<Curso> implements CursoService {

	private static final long serialVersionUID = 4953695863085122376L;

	@Autowired
	private CursoDao dao;
	
	@Override
	public BaseDao<Curso> getDao() {
		return dao;
	}

}
