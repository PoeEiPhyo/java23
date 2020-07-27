package SecondExercise;

import java.util.Date;

class  Customer{
	String name;
	boolean member=false;
	String memberType;
	public Customer(String name,String type) {
		this.name=name;
		this.memberType=type;
	}
//	public boolean isMember() {
//		return member;
//	}
}

class DiscountRate{ 
	
	static double serviceDiscountPlatinum=0.2;
	static double serviceDiscountGold=0.15;
	static double serviceDiscountSilver=0.1;
	static double productDiscountPlatinum=0.1;
	static double productDiscountGold=0.1;
	static double productDiscountSilver=0.1;
	static double service=0.0;
	public static double getServiceDiscountRate(String type) {
		
		if(type=="Platinum") {
			service= serviceDiscountPlatinum;
		}
		else if(type=="Gold") {
			service= serviceDiscountGold;
		}
		else if(type=="Silver"){
			service= serviceDiscountSilver;
		}
		return service;
	}
	static double product=0.0;
	public static double getProductDiscountRate(String type) {
		
		if(type=="Platinum") {
			product= productDiscountPlatinum;
		}
		else if(type=="Gold") {
			product= productDiscountGold;
		}
		else if(type=="Silver"){
			product= productDiscountSilver;
		}
		return product;
	}
}
public class Shop{
	public Date date;
	double serviceExpense=0.0;
	double productExpense=0.0;
	
	public Shop(String name,String type,Date date) {
		super(name,type);
		this.date=date;
	}
	public double getTotalExpense(double sexp,double pexp) {
		serviceExpense=sexp*sd;
		productExpense=pexp*pd;
		return ((sexp+pexp)-(serviceExpense+productExpense));
	}
	static double sd;
	static double pd;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1=new Customer("Poe Poe","Gold");
		sd=DiscountRate.getServiceDiscountRate(customer1.memberType);
		pd=DiscountRate.getProductDiscountRate(customer1.memberType);
		Shop sh=new Shop(customer1.name,customer1.memberType,new Date("1/1/2020"));
		double result1=sh.getTotalExpense(1000.0, 1000.0);
		System.out.println("ServiceExpense:"+1000.0+"\nProductExpense:"+1000.0);
		System.out.println(customer1.name+"\n"+sh.date+"\n"+customer1.memberType+"\n"+result1);
		System.out.println();
		
		Customer customer2=new Customer("Phyo Phyo","Silver");
		sd=DiscountRate.getServiceDiscountRate(customer2.memberType);
		pd=DiscountRate.getProductDiscountRate(customer2.memberType);
		sh=new Shop(customer2.name,customer2.memberType,new Date("5/10/2020"));
		double result2=sh.getTotalExpense(1000.0, 1000.0);	
		System.out.println("ServiceExpense:"+1000.0+"\nProductExpense:"+1000.0);
		System.out.println(customer2.name+"\n"+sh.date+"\n"+customer2.memberType+"\n"+result2);
		System.out.println();
		
		Customer customer3=new Customer("Nwe Nwe","Platinum");
		sd=DiscountRate.getServiceDiscountRate(customer3.memberType);
		pd=DiscountRate.getProductDiscountRate(customer3.memberType);		
		sh=new Shop(customer3.name,customer3.memberType,new Date("7/20/2020"));
		double result3=sh.getTotalExpense(1000.0, 1000.0);		
		System.out.println("ServiceExpense:"+1000.0+"\nProductExpense:"+1000.0);
		System.out.println(customer3.name+"\n"+sh.date+"\n"+customer3.memberType+"\n"+result3);
		System.out.println();
		
	}
	

}
