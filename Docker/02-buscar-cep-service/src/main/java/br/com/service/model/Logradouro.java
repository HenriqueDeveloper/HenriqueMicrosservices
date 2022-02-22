package br.com.service.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Logradouro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_logradouro;
	private String cep;
	private String tipo;
	private String descricao;
	private String uf;
	private String complemento;
	private String descricao_sem_numero;
	private String descricao_cidade;
	private long codigo_cidade_ibge;
	private String descricao_bairro;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cidade")
	private Cidade cidade;

	public Logradouro() {
	}

	public Logradouro(long id_logradouro, String cep, String tipo, String descricao, String uf, String complemento,
			String descricao_sem_numero, String descricao_cidade, long codigo_cidade_ibge, String descricao_bairro, Cidade cidade) {
		this.cep = cep;
		this.tipo = tipo;
		this.descricao = descricao;
		this.uf = uf;
		this.complemento = complemento;
		this.descricao_sem_numero = descricao_sem_numero;
		this.descricao_cidade = descricao_cidade;
		this.codigo_cidade_ibge = codigo_cidade_ibge;
		this.descricao_bairro = descricao_bairro;
		this.cidade = cidade;
	}
	
	

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public long getId_logradouro() {
		return id_logradouro;
	}

	public String getCep() {
		return cep;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDescricao() {
		return descricao;
	}


	public String getUf() {
		return uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getDescricao_sem_numero() {
		return descricao_sem_numero;
	}

	public String getDescricao_cidade() {
		return descricao_cidade;
	}

	public long getCodigo_cidade_ibge() {
		return codigo_cidade_ibge;
	}

	public String getDescricao_bairro() {
		return descricao_bairro;
	}

	public void setId_logradouro(long id_logradouro) {
		this.id_logradouro = id_logradouro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setDescricao_sem_numero(String descricao_sem_numero) {
		this.descricao_sem_numero = descricao_sem_numero;
	}

	public void setDescricao_cidade(String descricao_cidade) {
		this.descricao_cidade = descricao_cidade;
	}

	public void setCodigo_cidade_ibge(long codigo_cidade_ibge) {
		this.codigo_cidade_ibge = codigo_cidade_ibge;
	}

	public void setDescricao_bairro(String descricao_bairro) {
		this.descricao_bairro = descricao_bairro;
	}

}
