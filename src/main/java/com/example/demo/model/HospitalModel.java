package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HospitalModel implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String endereco;
	private String cnpj;
	private String Localizacao;
	private int pontos;
	private int medico; 
	private int enfermeira;
	private int respirador;
	private int ambulancia;
	private int tomografo;
		

	public int getTomografo() {
		return tomografo;
	}
	public void setTomografo(int tomografo) {
		this.tomografo = tomografo;
	}
	public int getRespirador() {
		return respirador;
	}
	public void setRespirador(int respirador) {
		this.respirador = respirador;
	}
	public int getAmbulancia() {
		return ambulancia;
	}
	public void setAmbulancia(int ambulancia) {
		this.ambulancia = ambulancia;
	}
	public int getMedico() {
		return medico;
	}
	public void setMedico(int medico) {
		this.medico = medico;
	}
	public int getEnfermeira() {
		return enfermeira;
	}
	public void setEnfermeira(int enfermeira) {
		this.enfermeira = enfermeira;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getLocalizacao() {
		return Localizacao;
	}
	public void setLocalizacao(String localizacao) {
		Localizacao = localizacao;
	}
	
	

	
	
}
