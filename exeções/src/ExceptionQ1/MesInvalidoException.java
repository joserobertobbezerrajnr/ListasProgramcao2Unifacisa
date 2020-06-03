package ExceptionQ1;

public class MesInvalidoException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MesInvalidoException(int mesEscolhido) {
		super("O número do mês deve estar entre 1 e 12 \n"
				+ "Mês escolhido: "+mesEscolhido);
	}

}