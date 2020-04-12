
public class Main {

	public static void main(String[] args) {
		Carro c1 = new Carro("Pálio", "Fiat", 35000);
		Carro c2 = new Carro("Pálio", "Fiat", 35000);
		Carro c3 = new Carro("Civic", "Honda", 110000);
		Carro c4 = new Carro("Corolla", "Toyota", 11000);
		Carro c5 = new Carro();
		Carro c6 = new Carro();
		
		
		
		c2.cor = "Prata";
		c2.calcularPreco();
		
		c3.portas = 4;
		c3.vidroEletrico = true;
		c3.arCond = true;
		c3.cambioAutomatico = true;
		c3.direcaoEletrica = true;
		c3.calcularPreco();
		
		c4.vidroEletrico = true;
		c4.direcaoEletrica = true;
		c4.arCond = true;
		c4.portas = 4;
		c4.calcularPreco();
		
		c5.nome = "Gol";
		c5.marca = "VW";
		c5.portas = 4;
		c5.arCond = true;
		c5.vidroEletrico = true;
		c5.cambioAutomatico =true;
		c5.direcaoEletrica = true;
		c5.precoBase = 55000;
		c5.calcularPreco();
		
		System.out.println(c1);
		System.out.println("\n" + c2);
		System.out.println("\n" + c3);
		System.out.println("\n" + c4);
		System.out.println("\n" + c5);
		System.out.println("\n" + c6);
		

	}

}
