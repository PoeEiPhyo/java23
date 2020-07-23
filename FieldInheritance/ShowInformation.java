package FieldInheritance;

public class ShowInformation{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Poe", "Monywa");
		Person p2=new Person("Phyo", "Yangon");
		Student stu=new Student(p1.name,p1.address,"Foundation Level",1,100000.0);
		
		Staff stf=new Staff(p2.name,p2.address,"HH",100000.0);
		System.out.println("Student Information:");
		System.out.println("Name:"+stu.name+"\nAddress:"+stu.address+"\nProgram:"+stu.program+"\nYear:"+stu.year+"\nFee:"+stu.fee);
		System.out.println();
		System.out.println("Staff Information:");
		System.out.println("Name:"+stf.name+"\nAddress:"+stf.address+"\nSchool:"+stf.school+"\nPay:"+stf.pay);
	}

}
