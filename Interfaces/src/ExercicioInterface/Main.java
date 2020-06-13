package ExercicioInterface;

public class Main {

	public static void main(String[] args) throws ClienteInexistenteException, PedidoInexistenteException {
		
		Refeicao r1 = new Refeicao(Proteina.PICANHA, Carboidrato.FEIJAO);
		Refeicao r2 = new Refeicao(Proteina.MAMINHA, Carboidrato.ARROZ);
		Refeicao r3 = new Refeicao(Proteina.FRANGO, Carboidrato.PURE);
		Bebida b1 = new Bebida(Tamanho.PEQUENO, SaborBebida.CAFE);
		Cardapio c = new Cardapio();

		
		Cliente joseRoberto = new Cliente(4);
		joseRoberto.adicionarPedido(r1);
		joseRoberto.adicionarPedido(r3);
		joseRoberto.adicionarPedido(r2);

		
		joseRoberto.removerPedido(r3);
		

		
		System.out.println(joseRoberto.getPedidos());
		Sistemarestaurante s = new Sistemarestaurante();
		s.adicionarCliente(joseRoberto);


		s.removerPedido(joseRoberto, r1);
		
		System.out.println(joseRoberto.getPedidos());
		

		
	}

}
