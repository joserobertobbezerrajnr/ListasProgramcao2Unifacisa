package Prova02;


public class BibliotecaFacisaPosGraduacao extends BibliotecaFacisa {
	
	@Override
	public double fazerEmprestimo(Livro livro, Data dataInicio, Data dataFim) throws LivroInexistenteException {
		double taxa = 2;
		int ano = dataFim.getAno() - dataInicio.getAno() * 12;
		int mes = dataFim.getMes() - dataInicio.getMes() * 30;
		int dia = dataFim.getDia() - dataInicio.getDia();
		
		for(Livro l: getListaDeLivros()) {
			if(l.equals(livro)) {
				if(l.isEmprestado() == true) {
					throw new LivroInexistenteException();
					} else {
						l.setEmprestado(false);
						
					}
			}
		}
		double resultado = ano+mes+dia*taxa;
		return resultado;
	}

}
