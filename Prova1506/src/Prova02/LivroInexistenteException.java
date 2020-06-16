package Prova02;

public class LivroInexistenteException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LivroInexistenteException() {
		super("Não temos esse livro");
	}
	

}
