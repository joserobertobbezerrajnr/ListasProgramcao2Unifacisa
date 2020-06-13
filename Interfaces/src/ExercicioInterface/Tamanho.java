package ExercicioInterface;

public enum Tamanho {
	
	PEQUENO(0, "Pequeno"), MEDIO(2, "M�dio"), GRANDE(2.8, "Grande");
	
	private double valor;
	private String nome;
	private Tamanho (double valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getNome() {
		return nome;
	}

}
