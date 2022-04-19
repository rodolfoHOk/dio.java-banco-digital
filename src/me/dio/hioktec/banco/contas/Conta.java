package me.dio.hioktec.banco.contas;

import java.math.BigDecimal;

import me.dio.hioktec.banco.Banco;
import me.dio.hioktec.banco.clientes.Cliente;
import me.dio.hioktec.banco.exceptions.RegraNegocioException;

public abstract class Conta implements IConta {
	
	protected enum TipoConta {
		CORRENTE, POUPANCA
	}
	
	protected static final int AGENCIA_PADRAO = 1001;
	
	protected int agencia;
	protected int numero;
	protected TipoConta tipo;
	protected Cliente cliente;
	private BigDecimal saldo;
	
	public Conta(Cliente cliente, Banco banco) {
		this.saldo = BigDecimal.ZERO;
		this.cliente = cliente;
		banco.adicionarConta(this);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public TipoConta getTipo() {
		return tipo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(BigDecimal valor) {
		verificaSaldo(valor);
		
		this.saldo = this.saldo.subtract(valor);
	}


	@Override
	public void depositar(BigDecimal valor) {
		this.saldo = this.saldo.add(valor);
	}

	@Override
	public void transferir(BigDecimal valor, Conta contaDestino) {
		verificaSaldo(valor);
		
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInformacaoesComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Tipo da Conta: %s", this.tipo));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
	}
	
	private void verificaSaldo(BigDecimal valor) {
		if (this.saldo.doubleValue() < valor.doubleValue()) {
			throw new RegraNegocioException("Saldo insuficiente para realizar a operação.");
		}
	}
	
}
