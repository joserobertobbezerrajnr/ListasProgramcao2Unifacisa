import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		JogoDaVelha j1 = new JogoDaVelha();
		
		int jogador = 1;
		int vencedor = j1.verificarVencedor();
		j1.mostrar(); 
		while (vencedor == 0) {
			System.out.println("Jogador " + jogador);
			System.out.print("Linha: ");
			int linha = teclado.nextInt();
			System.out.print("Coluna: ");
			int coluna = teclado.nextInt();
			if (!j1.fazerJogada(jogador, coluna, linha)) {
				System.out.println("Jogada errada, jogue dnv");
			} else {
				jogador = (jogador == 1) ? 2 : 1;
			}
			j1.mostrar();
			vencedor = j1.verificarVencedor();
		}
		switch (vencedor) {
		case 1 :
			System.out.println("Vencedor jogador 1");
			break;
		case 2:
			System.out.println("Vencedor jogador 2");
			break;
		case 3:
			System.out.println("Empatou");
			break;
		}

	}

}
