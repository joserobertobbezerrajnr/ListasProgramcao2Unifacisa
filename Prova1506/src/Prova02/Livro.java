package Prova02;

public class Livro {
	
	private String titulo;
	private Data publicacao;
	private boolean emprestado;
	private String autor;
	
	
	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Livro(String titulo, Data publicacao, boolean emprestado) {
		this.titulo = titulo;
		this.publicacao = publicacao;
		this.emprestado = emprestado;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Data getPublicacao() {
		return publicacao;
	}


	public void setPublicacao(Data publicacao) {
		this.publicacao = publicacao;
	}


	public boolean isEmprestado() {
		return emprestado;
	}


	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}



}
