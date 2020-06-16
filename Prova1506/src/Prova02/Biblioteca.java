package Prova02;

import java.util.List;

public interface Biblioteca {
	
	public void adicionarLivro(String titulo, String autor, Data data);
	public void removerLivro(String titulo, String autor, Data data);
	public double fazerEmprestimo(Livro livro, Data dataInicio, Data dataFim) throws LivroInexistenteException;
	public List<Livro> listarLivrosDoAutor(String autor);
	

}
