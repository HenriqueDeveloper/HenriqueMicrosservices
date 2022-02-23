package br.com.service.model;

import org.springframework.stereotype.Service;

@Service
public class Compra {
	
	private String cep;
	private String nomeProduto;
	private double frete;
	private String cidade;
	private double preco;
	private double totalProduto;
	
	public Compra() {
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getTotalProduto() {
		return totalProduto;
	}


	public void setTotalProduto(double totalProduto) {
		this.totalProduto = totalProduto;
	}


	public String getCep() {
		return cep;
	}

	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}
	
	
	
	

}
