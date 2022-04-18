package me.dio.hioktec.banco;

import java.math.BigDecimal;

public abstract class Conta implements IConta {

private int agencia;
	
	private int numero;
	
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
