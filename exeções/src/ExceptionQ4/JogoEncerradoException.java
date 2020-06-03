package ExceptionQ4;

public class JogoEncerradoException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JogoEncerradoException() {
		super("Não é permitido tentar mais palpites, o jogo está encerrado");
	}

}
