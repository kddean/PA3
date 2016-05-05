
public class Review {
	String genre;
	String date;
	String name;
	String source;
	String title;
	String text;
	
	public Review(String name, String title, String date , String source, String genre, String text) {
		this.genre = genre;
		this.date = date;
		this.name = name;
		this.source = source;
		this.title = title;
		this.text = text;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
}
