package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional, Produto {

	private String waterMark;

	// Construtor:
	public Ebook(Autor autor) {
		super(autor);
	}

	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}

	// Get e set;
	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		} else {
			return true;
		}
	}

}
