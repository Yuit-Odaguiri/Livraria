package br.com.casadocodigo.livraria.teste;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
	
		double soma = 0;
		
		for(int contador = 0;contador < 35;contador++) {
			double valorDoLivro = 59.90;
			soma +=valorDoLivro;
		}
		

		if(soma < 115) {
			System.out.println("Seu estoque esta baixo!");
		}else if(soma >=200) {
			System.out.println("Seu estoque esta muito alto!");
		}else {
			System.out.println("Seu estoque esta bom!");
		}
		
		System.out.println("O total em estoque é: " + soma);
		

	
	}
}
