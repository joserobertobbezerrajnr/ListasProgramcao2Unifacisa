package casa;

public class Classificados {

	public static void main(String[] args) {
		Imoveis c1 = new Imoveis("Casa", "Falcão", 3, 1, 2, 120, false, true, false);
		Imoveis c2 = new Imoveis("Apartamento", "Falcão", 3, 2, 3, 82, true, false, false);
		Imoveis c3 = new Imoveis("Casa", "Altaman", 4, 2, 3, 240, true, true, true);
		Imoveis c4 = new Imoveis("Casa", "Leblon", 6, 3, 5, 540, true, true, true);
		Imoveis c5 = new Imoveis("Apartamento", "Alto Branco", 2, 1, 2, 60, false, true, true);
		
		
		
		c1.calcularPreco();
		c2.calcularPreco();
		c2.pavimentos = 15;
		c2.pavimento = 8;
		c3.calcularPreco();
		c4.calcularPreco();
		c5.pavimentos = 3;
		c5.pavimento = 2;
		c5.calcularPreco();
		
		
	
		
		System.out.println(c1.toString());
		System.out.println("\n\nEmpreendimendo 02: " + c2);
		System.out.println("\n\nEmpreendimendo 03: " + c3);
		System.out.println("\n\nEmpreendimendo 04: " + c4);
		System.out.println("\n\nEmpreendimento 05: " + c5);
		


	}

}
