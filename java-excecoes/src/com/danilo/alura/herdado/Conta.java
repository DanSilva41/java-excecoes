package com.danilo.alura.herdado;

import com.danilo.alura.criacao.SaldoInsuficienteException;

public class Conta {

	private double saldo;

	void deposita(double valor){
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			// problema
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
