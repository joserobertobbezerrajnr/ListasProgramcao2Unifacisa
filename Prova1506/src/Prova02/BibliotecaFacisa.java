package Prova02;

import java.util.ArrayList;
import java.util.List;

public abstract class BibliotecaFacisa implements Biblioteca {
	private List <Livro> listaDeLivros;
	
	public BibliotecaFacisa() {
		
		
	}

	public List<Livro> getListaDeLivros() {
		return listaDeLivros;
	}

	public void setListaDeLivros(List<Livro> listaDeLivros) {
		this.listaDeLivros = listaDeLivros;
	}

	@Override
	public void adicionarLivro(String titulo, String autor, Data data) {
		for (int i = 0; i <listaDeLivros.size(); i++) {
			if(listaDeLivros.get(i).getAutor().equals(autor)
				&& listaDeLivros.get(i).getPublicacao().equals(titulo)
					&& listaDeLivros.get(i).getPublicacao().equals(data.getDia())
						&& listaDeLivros.get(i).getPublicacao().equals(data.getMes())
							&& listaDeLivros.get(i).getPublicacao().equals(data.getAno())) {
				listaDeLivros.add(i, null);
			}
		}
		
		
	}

	@Override
	public void removerLivro(String titulo, String autor, Data data) {
		for (int i = 0; i <listaDeLivros.size(); i++) {
			if(listaDeLivros.get(i).getAutor().equals(autor)
				&& listaDeLivros.get(i).getPublicacao().equals(titulo)
					&& listaDeLivros.get(i).getPublicacao().equals(data.getDia())
						&& listaDeLivros.get(i).getPublicacao().equals(data.getMes())
							&& listaDeLivros.get(i).getPublicacao().equals(data.getAno())) {
				listaDeLivros.remove(i);
			}
		}
			
		
	}

	@Override
	public List<Livro> listarLivrosDoAutor(String autor) {
		ArrayList<Livro> listaDeLivrosDoAutor = new ArrayList<Livro>();
		for (int i = 0; i <listaDeLivros.size(); i++) {
			if(listaDeLivros.get(i).getAutor().equals(autor)) {
				listaDeLivrosDoAutor.add(listaDeLivros.get(i));
			}
		}
		return listaDeLivros;
	}
	
	

}
