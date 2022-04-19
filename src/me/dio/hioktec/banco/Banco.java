package me.dio.hioktec.banco;

import java.util.List;

import me.dio.hioktec.banco.contas.Conta;

public class Banco {

	private String nome;
	
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
