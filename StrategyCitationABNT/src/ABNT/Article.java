package ABNT;


public class Article {
	
	private Author author;
	private int year;
	private String title;
	
	public Article (Author author, int year, String title) throws InvalidYearException, IllegalArgumentException{
		if(year > 2020) {
			throw new InvalidYearException();
		} else if(title.equals("") || title.length() > 50) {
			throw new IllegalArgumentException();
		} else {
			this.author = author;
			this.year = year;
			this.title = title;
		}
	}

	public Author getAuthor() {
		return author;
	}


	public int getYear() {
		return year;
	}


	public String getTitle() {
		return title;
	}


	
}