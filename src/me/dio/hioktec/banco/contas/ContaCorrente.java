package me.dio.hioktec.banco.contas;

import me.dio.hioktec.banco.Banco;
import me.dio.hioktec.banco.clientes.Cliente;

public class ContaCorrente extends Conta {
	
	private static int sequencial = 10001;

	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = sequencial++;
		super.tipo = TipoConta.CORRENTE;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato conta corrente ***");
		super.imprimirInformacaoesComuns();
		System.out.println("");
	}

}
