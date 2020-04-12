package casa;

public class Imoveis {
	public String tipo, imobiliaria;
	public int pavimentos, pavimento, quarto, suites, banheiro;
	public double metrosQuadrado;
	public boolean elevador, piscina, quadra;
	public double precoFinal;
	

	public Imoveis(String tipo, String imobiliaria, int quarto, int suites, int banheiro, double metrosQuadrado, boolean elevador,
			boolean piscina, boolean quadra) {
		
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.quarto = quarto;
		this.suites = suites;
		this.banheiro = banheiro;
		this.metrosQuadrado = metrosQuadrado;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
		
	}


	public Imoveis(String tipo, String imobiliaria, int pavimentos, int pavimento, int quarto, int suites, int banheiro,
			double metrosQuadrado, boolean elevador, boolean piscina, boolean quadra) {
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quarto = quarto;
		this.suites = suites;
		this.banheiro = banheiro;
		this.metrosQuadrado = metrosQuadrado;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;

		
		
	}
	public double calcularPreco() {

		if (tipo == "Casa") {
			precoFinal = metrosQuadrado * 5000;
		}

		else {
			precoFinal = metrosQuadrado * 5000;
			int contador = 1;
			while (contador <= pavimento) {
				if (contador >= 5) {
					precoFinal += 2000;
				}
				contador++;
			}
			
			if (elevador) {
				precoFinal += 2500;
			}

			if (piscina) {
				precoFinal += 2500;
			}

			if (quadra) {
				precoFinal += 2500;
			}
		}
		
		return precoFinal;

	}

	@Override
	public String toString() {
		
		String saida = "";
		saida += "\ntipo: " + tipo;
		saida += "\nImobiliaria: " + imobiliaria;
		saida += "\nPavimentos: " + pavimentos;
		saida += "\nAndar: " + pavimento;
		saida += "\nQuarto(s) : " +quarto;
		saida += "\nSuites: " + suites;
		saida += "\nBanheitos: " + banheiro;
		saida += "\nArea: " + metrosQuadrado + "m²";
		saida += "\nElevador: " + elevador;
		saida += "\nPiscina: " + piscina;
		saida += "\nQuadra: " + quadra;
		saida += "\nPreço Final: " + precoFinal;
 		
		return saida;
	}
	
}

