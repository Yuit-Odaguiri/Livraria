package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Promocional {
	private String nome;
	private String descricao;
	protected double valor;
	private String isbn;
	private Autor autor;

	// Construtor:
	public Livro(Autor autor) {
		if (autor == null) {
			throw new RuntimeException("O Autor do Livro não pode ser nulo");
		}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}

	public Livro() {
		this.isbn = "000.000.000-00";
	}

	// Inicio dos metodos:
	@Override
	public String toString() {
	return "Nome: " + nome
			+ "\nDescrição: " + descricao
			+ "\nValor: " + valor
			+ "\nISBN: " + isbn;
	}

	public boolean temAutor() {
		return this.autor != null;
	}

	// Inicio do SET e GET
	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
