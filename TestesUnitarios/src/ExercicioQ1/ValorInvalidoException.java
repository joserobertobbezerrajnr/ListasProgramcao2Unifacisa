package ExercicioQ1;

public class ValorInvalidoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorInvalidoException(double valor) {
		super("Valor invalido, você tentou depositar: " +valor);
	}

}
