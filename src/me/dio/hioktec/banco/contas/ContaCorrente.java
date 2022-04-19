package me.dio.hioktec.banco.contas;

public class ContaCorrente extends Conta {
	
	private static int sequencial = 10001;

	public ContaCorrente() {
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = sequencial++;
		super.tipo = TipoConta.CORRENTE;
	}

}
