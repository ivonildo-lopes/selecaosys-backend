package com.arquitetura.dao;

import org.springframework.data.repository.NoRepositoryBean;

import com.arquitetura.model.Aluno;

@NoRepositoryBean
public interface AlunoDao extends BaseDao<Aluno> {

}
