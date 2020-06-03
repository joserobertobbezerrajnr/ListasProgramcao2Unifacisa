package ExceptionQ6;

import java.util.Scanner;


public class PagamentoCompraApp {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor total da venda: ");

		double totalVenda = teclado.nextDouble();
		Venda venda = new Venda(totalVenda);
		boolean qtdParcelasOk = false;

		while (!qtdParcelasOk) {
			System.out.println("Digite a quantidade de parcelas: ");
			int qtdParcelas = teclado.nextInt();
			venda.setQtdParcelas(qtdParcelas);
			if(totalVenda / qtdParcelas >= Venda.getVALOR_MINIMO_PARCELA()) {
				qtdParcelasOk = true;
				} 
			}
		System.out.println("Valor da parcela: " + venda.getValorParcela());
		teclado.close();
	}
}
