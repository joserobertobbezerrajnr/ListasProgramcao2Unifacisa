package ExceptionQ3;

public class DataInvalidaException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataInvalidaException(int dia, int mes, int ano) {
		super("Os parâmetros fornecidos não representam uma data válida.\n"+
				"Tentativa de criacao da seguinte data: "+dia+"/"+mes+"/"+ano);		
	}

}
