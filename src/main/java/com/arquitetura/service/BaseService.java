package com.arquitetura.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.arquitetura.model.BaseEntity;

@NoRepositoryBean
public interface BaseService<E extends BaseEntity<?>> extends CrudRepository<E, Serializable>, Serializable {

    E findById(Serializable objectId);

    E findByParameters(Map<String, String> parameters);

    List<E> findAllByParameters(Map<String, String> parameters);

}
