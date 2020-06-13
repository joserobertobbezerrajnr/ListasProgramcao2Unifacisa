package ExercicioInterface;

public class Bebida implements Item{
	
	private Tamanho tamanho;
	private SaborBebida sabor;
	
	public Bebida (Tamanho tamanho, SaborBebida sabor) {
		this.tamanho = tamanho;
		this.sabor = sabor;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return sabor.getValor() + tamanho.getValor();
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Bebida: " + sabor.getNome() + "\nTamanho: " + tamanho.getNome(); 
	}
	public Tamanho getTamanho() {
		return tamanho;
	}


	public SaborBebida getSabor() {
		return sabor;
	}
	

}
