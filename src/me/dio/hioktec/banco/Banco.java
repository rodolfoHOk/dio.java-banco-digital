package me.dio.hioktec.banco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import me.dio.hioktec.banco.clientes.Cliente;
import me.dio.hioktec.banco.contas.Conta;

public class Banco {

	private String nome;
	
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public int totalContas() {
		return this.contas.size();
	}
	
	public int totalClientes() {
		var clientes = new HashSet<Cliente>();
		this.contas.stream().forEach(conta -> clientes.add(conta.getCliente()));
		
		return clientes.size();
	}
	
}
