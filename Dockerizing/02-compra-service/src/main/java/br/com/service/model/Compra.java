package br.com.service.model;

import org.springframework.stereotype.Service;

@Service
public class Compra {
	
	private String nomeProduto;
	private String cep;
	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}

	private double frete;
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
