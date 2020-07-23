package FieldInheritance;

public class Staff extends Person{
	String school;
	double pay;
	
	public Staff(String name,String address,String school,double pay) {
		super(name, address);
		this.school=school;
		this.pay=pay;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
