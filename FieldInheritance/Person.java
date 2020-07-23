package FieldInheritance;

public class Person {
	String name,address;
	public Person(String n,String a) {
		this.name=n;
		this.address=a;
	}
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
