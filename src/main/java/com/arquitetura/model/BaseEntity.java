package com.arquitetura.model;


import java.io.Serializable;

public interface BaseEntity<T> extends Serializable {

    T getId();

}
