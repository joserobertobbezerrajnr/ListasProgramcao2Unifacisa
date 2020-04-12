
public class Carro{
	public String nome;
	public String marca;
	public String cor;
	public int portas;
	public boolean vidroEletrico, arCond, cambioAutomatico, direcaoEletrica;
	public double precoBase;
	

	public Carro() {
		nome = "Sem nome";
		marca = "Sem marca";
		cor = "Branco";
		portas = 2;
		vidroEletrico = false;
		arCond = false;
		cambioAutomatico = false;
		direcaoEletrica = false;
		precoBase = 0;
		
		
	}



	public Carro(String nome, String marca, double precoBase) {
		this();
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
	}



	public Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCond,
			boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCond = arCond;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
		
		
		
	}
	
	public double calcularPreco() {
		switch (cor) {
		case "Branco":
		case "Vermelho":
		case "Preto":
		case "Azul":
			
			precoBase += 0;
			break;
		default:
			precoBase += 1000;
		}
		
		
		if(vidroEletrico) {
			precoBase += 1250;
		}
		if(arCond) {
			precoBase += 1250;
		}
		if(cambioAutomatico) {
			precoBase += 1250;
		}
		if(direcaoEletrica) {
			precoBase += 1250;
		}
		
		return precoBase;
	}



	@Override
	public String toString() {
		
		String saida = "";
		saida += "Nome: " + nome;
		saida += "\nMarca: " + marca;
		saida += "\nCor: " +cor;
		saida += "\nPortas: " + portas;
		saida += "\nVidros Elétricos: " + vidroEletrico;
		saida += "\nCambio Automatico: " + cambioAutomatico;
		saida += "\nAr condicionado: " + arCond;
		saida += "\nDireçao Elétrica: " + direcaoEletrica;
		saida += "\nPreço final: " + precoBase;
		
		return saida;
	
	}
	
	
	
	
}
