package ua.khpi.oop.tatarenko07;

public class Book {
	
	private long ISBN;
	private String Name;
	private String[] Author;
	private String Publish;
	private String[] Genre;
	private int Date;

	public long getISBN() {return ISBN;}
	public void setISBN(long ISBN) {this.ISBN = ISBN;}
	
	public String getName() {return Name;}
	public void setName(String Name) {this.Name = Name;}
	
	public String[] getAuthor() {return Author;}
	public void setAuthor(String[] Author) {this.Author = Author;}
	
	public String getPublish() {return Publish;}
	public void setPublish(String Publish) {this.Publish = Publish;}
	
	public String[] getGenre() {return Genre;}
	public void setGenre(String[] Genre) {this.Genre = Genre;}
	
	public int getDate() {return Date;}
	public void setDate(int Date) {this.Date = Date;}
	
	public Book(long ISBN, String Name, String[] Author, String Publish, String[] Genre, int Date)
	{
		this.ISBN = ISBN;
		this.Name = Name;
		this.Author = Author;
		this.Publish = Publish;
		this.Genre = Genre;
		this.Date = Date;
	}
	
	public void Output()
	{
		System.out.println("ISBN: " + ISBN);
		System.out.println("Название: " + Name);
		System.out.print("Автор: ");
		for (int i = 0; i < Author.length; i++) {
			System.out.print(Author[i] + ", ");
		}
		System.out.println("\nИздание: " + Publish);
		System.out.print("Жанр: ");
		for (int i = 0; i < Genre.length; i++) {
			System.out.print(Genre[i] + ", ");
		}
		System.out.println("\nГод публикации: " + Date);
	}
}
