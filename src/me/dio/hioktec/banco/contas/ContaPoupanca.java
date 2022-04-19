package me.dio.hioktec.banco.contas;

import me.dio.hioktec.banco.clientes.Cliente;

public class ContaPoupanca extends Conta {

	private static int sequencial = 50001;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = sequencial++;
		super.tipo = TipoConta.POUPANCA;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato conta poupança ***");
		super.imprimirInformacaoesComuns();
		System.out.println("");
	}
	
}
