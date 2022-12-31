package model;

import avaliacao20222.Q1.ConversorJSON;
import avaliacao20222.Q1.ConversorXML;

public abstract class Obra {
	private String titulo;
	private Integer ano;
	private Double avaliacao;

	public Obra(String titulo, Integer ano, Double avaliacao) {
		this.titulo = titulo;
		this.ano = ano;
		this.avaliacao = avaliacao;
	}

	public Obra(ConversorXML conversorXml) {
		// TODO Auto-generated constructor stub
	}
	
	public Obra(ConversorJSON conversorJson) {
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public Double getAvaliacao() {
		return avaliacao;
	}

}
