package Library_data_management;
class LibraryItem {

	private int id=985;
	String title="Albert";
	int year=1999;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	}
	

class Book extends LibraryItem{
	
	String author="Einstean";
}
class Magzine extends LibraryItem{
	private int issue=99;

public int getIssue() {
	return issue;
}
   public void setIssue(int issue) {
	this.issue=issue;
}
}

public class Library{
	public static void main(String []args) {
		Book book=new Book();
		book.author="pranath";
		Magzine magzine=new Magzine();
		magzine.setIssue(120);
		book.setId(20);
		System.out.println("Id of the book "+book.getId());
		System.out.println("Title of the book "+book.title);
		System.out.println("Author of the book "+book.author);
		System.out.println("Year of thr book published "+book.year);
		System.out.println("Issue of the book "+magzine.getIssue());
	}
	
}