package ABNT;

public class App {

	public static void main(String[] args) throws IllegalArgumentException,
	InvalidYearException  {
		
		Author authorOne = new Author("Jos�", "Barbosa", "Junior");
		
		try {
			Article articleOne = new Article(authorOne, 2019, "First Program");
			CitationStrategy BrCitation = new BrazilianModel();
			CitationStrategy UsCitation = new InternationalModel();
			System.out.println(BrCitation.getCitation(articleOne));
			System.out.println(UsCitation.getCitation(articleOne));
			
			System.out.println(BrCitation.getCitation(articleOne).equals("Jos� B. Junior, 1995, Nascimento Jos�"));
		}
		
		catch(InvalidYearException excepOne) {
			excepOne.getMessage();
		}
		catch(IllegalArgumentException excepTwo) {
			excepTwo.printStackTrace();
		}

	}

}
