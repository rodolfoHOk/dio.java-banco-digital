package me.dio.hioktec.banco.contas;

public class ContaPoupanca extends Conta {

	private static int sequencial = 50001;

	public ContaPoupanca() {
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = sequencial++;
		super.tipo = TipoConta.POUPANCA;
	}
	
}
