package ABNT;

public class App {

	public static void main(String[] args) throws IllegalArgumentException,
	InvalidYearException  {
		
		Author authorOne = new Author("José", "Barbosa", "Junior");
		
		try {
			Article articleOne = new Article(authorOne, 2019, "First Program");
			CitationStrategy BrCitation = new BrazilianModel();
			CitationStrategy UsCitation = new InternationalModel();
			System.out.println(BrCitation.getCitation(articleOne));
			System.out.println(UsCitation.getCitation(articleOne));
			
			System.out.println(BrCitation.getCitation(articleOne).equals("José B. Junior, 1995, Nascimento José"));
		}
		
		catch(InvalidYearException excepOne) {
			excepOne.getMessage();
		}
		catch(IllegalArgumentException excepTwo) {
			excepTwo.printStackTrace();
		}

	}

}
