package me.dio.hioktec.banco.contas;

import java.math.BigDecimal;

public abstract class Conta implements IConta {
	
	protected enum TipoConta {
		CORRENTE, POUPANCA
	}
	
	protected static final int AGENCIA_PADRAO = 1001;
	
	protected int agencia;
	protected int numero;
	protected TipoConta tipo;
	private BigDecimal saldo;
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(BigDecimal valor) {
		
	}

	@Override
	public void depositar(BigDecimal valor) {
		
	}

	@Override
	public void transferir(BigDecimal valor, Conta contaDestino) {
		
	}
	
}
