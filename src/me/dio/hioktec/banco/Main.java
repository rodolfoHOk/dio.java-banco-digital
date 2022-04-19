package me.dio.hioktec.banco;

import java.math.BigDecimal;

import me.dio.hioktec.banco.clientes.Cliente;
import me.dio.hioktec.banco.contas.Conta;
import me.dio.hioktec.banco.contas.ContaCorrente;
import me.dio.hioktec.banco.contas.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		joao.setNome("João Batista");
		
		Conta cc = new ContaCorrente(joao);
		cc.depositar(BigDecimal.valueOf(100));
		
		Conta cp = new ContaPoupanca(joao);
		
		cc.transferir(BigDecimal.valueOf(33.33), cp);
		
		cc.imprimirExtrato();
		
		cp.imprimirExtrato();
	}
	
}
