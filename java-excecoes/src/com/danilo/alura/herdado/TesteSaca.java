package com.danilo.alura.herdado;

public class TesteSaca {
	
	public static void main(String[] args) {
		Conta conta = new Conta();

        conta.deposita(200.0);
        conta.saca(201.0);

        System.out.println(conta.getSaldo());
	}
}
