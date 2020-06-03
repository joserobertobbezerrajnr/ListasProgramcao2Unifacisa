package ExceptionQ6;

public class ValorMinimoParcelaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorMinimoParcelaException() {
		super("Valor de parcela invalido! Tente novamente.\n");
	}
}
