package view;

import controller.QuantidadeDigitos;

public class Principal {

	public static void main(String[] args) {
		
		int n = 1547892;
		
		System.out.println("O número " + n + " possui " + QuantidadeDigitos.contarDigitosNumero(n) + " dígitos.");

	}
}
