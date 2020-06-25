package br.com.casadocodigo.livraria;

public class Autor {
	String nomeDoAutor;
	String emailDoAutor;
	String cpfDoAutor;
	
    public String getNomeDoAutor() {
		return nomeDoAutor;
	}

	public void setNomeDoAutor(String nomeDoAutor) {
		this.nomeDoAutor = nomeDoAutor;
	}

	public String getEmailDoAutor() {
		return emailDoAutor;
	}

	public void setEmailDoAutor(String emailDoAutor) {
		this.emailDoAutor = emailDoAutor;
	}

	public String getCpfDoAutor() {
		return cpfDoAutor;
	}

	public void setCpfDoAutor(String cpfDoAutor) {
		this.cpfDoAutor = cpfDoAutor;
	}

	public void mostraDetalhes() {
	System.out.println("Mostrando detalhes do autor");
	System.out.println("Nome do autor: " + nomeDoAutor);
	System.out.println("Email do autor: " + emailDoAutor);
	System.out.println("CPF do autor: " + cpfDoAutor);

    }
}
