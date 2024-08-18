package controller;

public class QuantidadeDigitos {

	public QuantidadeDigitos() {
		super();
	}
	
	public static int contarDigitosNumero(int n) {
		// Condição de parada: se o número for menor que 10, significa que tem apenas 1 digito.
		if(n < 10) {
			return 1;
		} else {
			
			// Relação de chamada dos passos: A função divide o número por 10 (removendo o último dígito) e chama a si mesma com esse novo valor. 
			// Para cada chamada, 1 é adicionado ao total, representando um dígito do número original.
			return 1 + contarDigitosNumero(n / 10);
		}
	}
}
