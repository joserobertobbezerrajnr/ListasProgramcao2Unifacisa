package ABNT.Testes;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import ABNT.Article;
import ABNT.Author;
import ABNT.BrazilianModel;
import ABNT.CitationStrategy;
import ABNT.InvalidYearException;
import org.junit.Assert;

public class TestBrazilianModel{
		Author a;
		Author b;
		Article one;
		Article two;
		CitationStrategy csOne;
		
		@Before
		public void setUp() throws IllegalArgumentException, InvalidYearException {
			
			a = new Author("Carolina", "Ramalho", "Silveira");
			b = new Author("Roberto", "Barbosa", "Bezerra");
			one = new Article(a, 2015, "Odontologia em pratica");
			two = new Article(b, 2010, "Ia, O fututro presente");
			csOne = new BrazilianModel();
		}
		@Test
		public void testGetCitation() {
			Assert.assertEquals("CAROLINA R. SILVEIRA, 2019, Odontologia em pratica",
					csOne.getCitation(one));
			
			Assert.assertEquals("ROBERTO B. BEZERRA, 2020, Ia, O futuro presente",
					csOne.getCitation(two));
			
		}
			
}
		
	


