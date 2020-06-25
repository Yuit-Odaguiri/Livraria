package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;

public class TestaObjeto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNomeDoAutor("Rodrigo Turini");
		Autor autor2 = new Autor();
		autor2.setNomeDoAutor("Rodrigo Turini");
		if (autor == autor2) {
		System.out.println("Igual");
		} else {
		System.out.println("Diferente");
		}
	}
}
