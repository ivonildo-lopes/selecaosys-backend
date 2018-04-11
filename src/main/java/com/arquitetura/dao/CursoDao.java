package com.arquitetura.dao;

import org.springframework.data.repository.NoRepositoryBean;

import com.arquitetura.model.Curso;

@NoRepositoryBean
public interface CursoDao extends BaseDao<Curso> {

}
