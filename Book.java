package SecondExercise;

class Author{
	public String name;
	public String email;
	public char gender;
	
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}

public class Book{
	String name;
	double price;
	int qty=0;
	Author author;
	public Author getAuthor() {
		return author;
	}
	public Book(String name,Author author,double price){
		super();
		this.name=name;
		this.price=price;
	}
	public Book(String name,Author author,double price,int qty){
		super();
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a=new Author("Juu","juu@gmail.com",'F');
		Book b=new Book("A Mataya",a,5000,1);
		System.out.println("Author is \'"+a.name+"\'\t,"+a.email+"\t,"+a.gender);
		System.out.println();
		System.out.println("Book is \'"+b.name+"\'\t,"+b.price+"\t,"+b.qty);
	}
}

