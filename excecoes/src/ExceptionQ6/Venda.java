package ExceptionQ6;

public class Venda {
	private static double VALOR_MINIMO_PARCELA = 50.00;
	private double valor;
	private int qtdParcelas;

	public Venda(double valor) {
		this.valor = valor;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	public double getValorParcela() {
		return valor / qtdParcelas;
	}

	public static double getVALOR_MINIMO_PARCELA() {
		return VALOR_MINIMO_PARCELA;
	}

	public static void setVALOR_MINIMO_PARCELA(double vALOR_MINIMO_PARCELA) {
		VALOR_MINIMO_PARCELA = vALOR_MINIMO_PARCELA;
	}
}
