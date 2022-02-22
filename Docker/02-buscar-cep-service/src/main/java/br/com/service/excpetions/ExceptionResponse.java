package br.com.service.excpetions;

import java.util.Date;

public class ExceptionResponse {
	
	private Date data;
	private String resposta;
	private String detalhes;
	
	public ExceptionResponse() {
	}
	public ExceptionResponse(Date data, String resposta, String detalhes) {
		this.data = data;
		this.resposta = resposta;
		this.detalhes = detalhes;
	}
	public Date getData() {
		return data;
	}
	public String getResposta() {
		return resposta;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	
	
	
	

}
