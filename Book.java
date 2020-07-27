package SecondExercise;

class Author{
	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

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
		Book b=new Book("AMataya",a,5000,1);
		System.out.println("Author is \'"+a.getName()+"\'\t,"+a.getEmail()+"\t,"+a.getGender());
		System.out.println();
		System.out.println("Book is \'"+b.name+"\' of \'"+a.getName()+"\' is "+b.price+" for "+b.qty);
	}
}

