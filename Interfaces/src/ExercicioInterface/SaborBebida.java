package ExercicioInterface;

public enum SaborBebida {
	
	COCA(2.75, "Coca-Cola"), PEPSI(1.5, "PEPSI PODE SER ?"), FANTA(2, "Fanta-Laranja"),
	SUCO(2.5, "Suco-Sabores"), CAFE(0.5, "Café"), AGUA(1.00, "Agua");
	
	private double valor;
	private String nome;
	
	private SaborBebida(double valor, String nome) {
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
