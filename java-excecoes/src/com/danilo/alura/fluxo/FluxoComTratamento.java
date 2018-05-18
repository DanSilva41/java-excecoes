package com.danilo.alura.fluxo;

import com.danilo.alura.criacao.MinhaExcecao;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("MAIN BEGIN");
		try {
			m1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String tipo = ex.getClass().getName();
			String msg = ex.getMessage();
			System.out.println("Excecao: " + tipo + "\t" + msg);
		}
		System.out.println("MAIN END");
	}

	public static void m1() {
		System.out.println("B BEGIN");
		m2();
		System.out.println("B END");
	}

	public static void m2() {
		System.out.println("A BEGIN");

		throw new MinhaExcecao("Deu erro grande");
		// System.out.println("A END");
	}
}
