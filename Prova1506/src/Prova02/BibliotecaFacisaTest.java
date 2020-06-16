/**
 * 
 */
package Prova02;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author roobe
 *
 */
public class BibliotecaFacisaTest {

	private BibliotecaFacisa biblioteca;
	private BibliotecaFacisa blbliotecaPos;
	private Livro livro1;
	private Livro livro2;
	
	@Before
	public static void setUp() throws Exception {
		ArrayList<Livro> livros = new ArrayList<Livro>();
		livro1 = new Livro("Harry Potter", "José", new Data(12, 09, 1995));
		livro2 = new Livro("Harry potter 2", "JK Rowling", new Data(13. 01, 2001));
		
		livros.add(livro1);
		livros.add(livro2);
		
		biblioteca = new BiblioteFacisaGraduacao(livros);
		bibliotecaPos = new BibliotecaFacisaPosGraduacao(livros);
		
		


	}
