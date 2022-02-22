package br.com.service.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cidade;
	private String descricao;
	private String uf;
	private String codigo_ibge;
	private String ddd;
	

	public Cidade() {
	}

	public Cidade(long id_cidade, String descricao, String uf, String codigo_ibge, String ddd) {
		this.id_cidade = id_cidade;
		this.descricao = descricao;
		this.uf = uf;
		this.codigo_ibge = codigo_ibge;
		this.ddd = ddd;
	}

	public long getId_cidade() {
		return id_cidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getUf() {
		return uf;
	}

	public String getCodigo_ibge() {
		return codigo_ibge;
	}

	public String getDdd() {
		return ddd;
	}

	public void setId_cidade(long id_cidade) {
		this.id_cidade = id_cidade;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setCodigo_ibge(String codigo_ibge) {
		this.codigo_ibge = codigo_ibge;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

}
