package com.danilo.alura.criacao;

public class MinhaExcecao extends RuntimeException {

	public MinhaExcecao() {
	}

	public MinhaExcecao(String mensagem) {
		super(mensagem);
	}
}
