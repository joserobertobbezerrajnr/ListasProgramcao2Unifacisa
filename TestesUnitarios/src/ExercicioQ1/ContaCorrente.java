package ExercicioQ1;

public class ContaCorrente {
	
	private double limite;			//default ou package private
	private double saldo;	
	private int numero;
	private String cliente;
	
	public ContaCorrente(double limite, int numero, String cliente) {
		if(limite < 0) {
			limite = 0;
		}
		this.limite = limite;
		this.setNumero(numero);
		this.setCliente(cliente);
	}
	
	public void depositar(double quantia) throws ValorInvalidoException{
		if(quantia <= 0)
			throw new ValorInvalidoException(quantia);
		
		saldo += quantia;
	}
	
	public double debitar(double quantia) {
		if(verificaRetirada(quantia)) {
			saldo -= quantia;
			return quantia;
		} else {
			return 0;
		}		
	}
	
	public boolean transferir(double quantia, ContaCorrente conta2) {
		//se eh possivel sacar dessa conta, então
		//eh possivel transferir
		double valor = debitar(quantia);
		if(valor>0) {
			try {
				conta2.depositar(valor);
			} catch (ValorInvalidoException e) {
				// TODO Auto-generated catch block
				e.getOurStackTrace();
			}
			return true;
		}
		
		return false;		
	}
	
	protected boolean verificaRetirada(double quantia) {
		if(quantia > 0 && quantia <= (saldo + limite)) 
			return true;
		else
			return false;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

}
