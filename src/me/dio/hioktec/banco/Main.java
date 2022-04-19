package me.dio.hioktec.banco;

import java.math.BigDecimal;

import me.dio.hioktec.banco.clientes.Cliente;
import me.dio.hioktec.banco.contas.Conta;
import me.dio.hioktec.banco.contas.ContaCorrente;
import me.dio.hioktec.banco.contas.ContaPoupanca;
import me.dio.hioktec.banco.exceptions.RegraNegocioException;

public class Main {
	
	public static void main(String[] args) {
		
		Banco banco = new Banco("Banco Novo");
		
		Cliente joao = new Cliente();
		joao.setNome("João Batista");
		
		Conta cc = new ContaCorrente(joao, banco);
		cc.depositar(BigDecimal.valueOf(100));
		
		Conta cp = new ContaPoupanca(joao, banco);
		
		try {
			cc.transferir(BigDecimal.valueOf(33.33), cp);
		} catch (RegraNegocioException e) {
			System.out.println(e.getMessage());
		}
		
		var pedro = new Cliente();
		pedro.setNome("Pedro Guimarães");
		
		Conta pedroCc = new ContaCorrente(pedro, banco);
		pedroCc.depositar(BigDecimal.valueOf(1550.50));
		
		
		System.out.println("Banco: " + banco.getNome());
		System.out.println("Total de contas do Banco: " + banco.totalContas());
		System.out.println("Total de clientes do Banco: " + banco.totalClientes() + "\n");
		
		cc.imprimirExtrato();
		
		cp.imprimirExtrato();
		
		pedroCc.imprimirExtrato();
		
		try {
			cc.sacar(BigDecimal.valueOf(100));
		} catch (RegraNegocioException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			cc.transferir(BigDecimal.valueOf(100), cp);
		} catch (RegraNegocioException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
