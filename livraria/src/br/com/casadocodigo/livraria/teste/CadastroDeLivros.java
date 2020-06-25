package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Autor a1 = new Autor();
		a1.setNomeDoAutor("Rodrigo Turini");
		a1.setEmailDoAutor("rodrigo.turini@caelum.com.br");
		a1.setCpfDoAutor("123.456.789.10");

		Livro l1 = new LivroFisico(a1);
		l1.setNome("Java 8 Pratico");
		l1.setDescricao("Novos recursos da linguagem");
		l1.setValor(59.90);
		l1.setIsbn("978-85-66250-46-6");

		//l1.mostraDetalhes();

		Autor a2 = new Autor();
		a2.setNomeDoAutor("Roberto das letras");
		a2.setEmailDoAutor("Robertinho@gmail.com");
		a2.setCpfDoAutor("111.111.111.00");

		Livro l2 = new LivroFisico(a2);
		l2.setNome("Logica da Programacao");
		l2.setDescricao("Crie seus primeiros programas");
		l2.setValor(39.90);
		l2.setIsbn("987-85-66250-22-0");

		//l2.mostraDetalhes();
		
		//System.out.println(l2.getValor());

		Autor a3 = new Autor();
		Ebook ebook = new Ebook(a3);
		ebook.setNome("Java 8 Prático");
		ebook.setValor(59.90);
		
		ebook.aplicaDescontoDe(0.01);
		System.out.println(ebook.getValor());
		
	}
}
