package br.com.casadocodigo.livraria.teste;

import java.awt.List;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNomeDoAutor("Mauricio Aniche");

		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-driven Development");
		fisico.setValor(59.90);

		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-driven Development");
		ebook.setValor(29.90);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);

		System.out.println("Total " + carrinho.getTotal());

		if (fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é " + fisico.getValor());
		}

		List<Produto> produtos = carrinho.getProdutos();
		for (Produto produto : produtos) {
		System.out.println(produto);
		}

		System.out.println("Fui executado!");
		
		System.out.println(ebook);

	}

}
