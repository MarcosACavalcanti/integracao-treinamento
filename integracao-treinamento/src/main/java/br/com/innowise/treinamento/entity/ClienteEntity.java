package br.com.innowise.treinamento.entity;

import java.io.Serializable;
import java.util.Date;

public class ClienteEntity implements Serializable {
	
	private static final long serialVersionUID = 1l;
	private long id;
	private String nome;
	private String email;
	private Date dataNascimento;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
