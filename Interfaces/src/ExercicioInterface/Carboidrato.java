package ExercicioInterface;

public enum Carboidrato {
	
	FEIJAO(5, "Feijăo"), ARROZ(2.5, "Arroz"), 
	PURE(2, "Pure"), BATATA(5, "Batata"), MACARRAO(2.5, "Macarrao");
	
	private double valor;
	private String nome;
	private Carboidrato (double valor, String nome) {
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
