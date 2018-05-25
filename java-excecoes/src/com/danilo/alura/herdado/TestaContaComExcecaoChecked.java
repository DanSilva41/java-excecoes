package com.danilo.alura.herdado;

public class TestaContaComExcecaoChecked {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		c.deposita(); // Erro de compilação
	}
}
