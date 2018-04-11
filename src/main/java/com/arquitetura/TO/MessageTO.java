package com.arquitetura.TO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlRootElement
public class MessageTO implements Serializable {

    private static final long serialVersionUID = -7743657152986843799L;

    private String messagem;

    private Boolean success;

    private Object conteudo;

    public MessageTO() {
        super();
    }

    public MessageTO(Boolean success) {
        super();
        this.success = success;
    }

    public MessageTO(String messagem) {
        super();
        this.messagem = messagem;
    }

    public MessageTO(String messagem, Boolean success) {
        super();
        this.messagem = messagem;
        this.success = success;
    }

    public MessageTO(String messagem, Boolean success, Object conteudo) {
        super();
        this.messagem = messagem;
        this.success = success;
        this.conteudo = conteudo;
    }

    public Object getConteudo() {
        return conteudo;
    }

    public String getMessagem() {
        return messagem;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setConteudo(Object conteudo) {
        this.conteudo = conteudo;
    }

    public void setMessagem(String messagem) {
        this.messagem = messagem;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
