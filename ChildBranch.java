package SecondExercise;

class Bank{
	public double totalAmount;
	
	public Bank(double totalAmount) {
		this.totalAmount=totalAmount;
	}
}

interface BankFunction{
	public double increment(double amt);
	public double decreasement(double amt);
}

public class ChildBranch extends Bank implements BankFunction {
	double totAmt=0.0;
	
	public ChildBranch(double totalAmount) {
		super(totalAmount);
		this.totAmt=totalAmount;
		// TODO Auto-generated constructor stub
	}
	
	public double increment(double amt) {
		totAmt+=amt;
		return totAmt;
	}
		
	public double decreasement(double amt) {
		totAmt-=amt;
		return totAmt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildBranch b=new ChildBranch(100000.0);
		System.out.println("The total Amount is "+b.totAmt);
		b.increment(20000.0);
		System.out.println("The total Amount after increment is "+b.totAmt);
		b.decreasement(10000.0);
		System.out.println("The total Amount after decrement is "+b.totAmt);
				
	}

}

