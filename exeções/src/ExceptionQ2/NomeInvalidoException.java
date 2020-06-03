package ExceptionQ2;

public class NomeInvalidoException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NomeInvalidoException(String nome) {
		super("O nome fornecido não pode ser nulo ou vazio\n"
				+ "O nome digitado foi: " +nome);
	}
}
