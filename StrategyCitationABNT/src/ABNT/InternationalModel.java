package ABNT;

public class InternationalModel implements CitationStrategy{
	
	@Override
	public String getCitation(Article article) {
		
		String citation = "";
		citation += article.getAuthor().getLastName().toUpperCase() + ", ";
		citation += article.getAuthor().getMiddleName().substring(0, 1).toUpperCase() + ". ";
		citation += article.getAuthor().getFirstName().toUpperCase()+", ";
		citation += article.getYear() + ", ";
		citation += article.getTitle() + ".";
		
		return citation;
	}

}

