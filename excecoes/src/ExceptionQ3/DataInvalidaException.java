package ExceptionQ3;

public class DataInvalidaException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataInvalidaException(int dia, int mes, int ano) {
		super("Os par�metros fornecidos n�o representam uma data v�lida.\n"+
				"Tentativa de criacao da seguinte data: "+dia+"/"+mes+"/"+ano);		
	}

}
