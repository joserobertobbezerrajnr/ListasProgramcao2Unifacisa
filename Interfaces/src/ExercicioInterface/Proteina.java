package ExercicioInterface;

public enum Proteina {
	
	PICANHA(20, "Picanha"), MAMINHA(15, "Maminha"),FRANGO(15, "Frango"),
	LINGUICA(10, "Linguica"), SOL(12,"Carne de Sol");
	
	private double valor;
	private String nome;
	
	private Proteina (double valor, String nome) {
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
