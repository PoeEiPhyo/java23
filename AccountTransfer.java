package SecondExercise;

public class AccountTransfer {
	String id,name;
	int balance=0;
	
	AccountTransfer(String id,String name){
		this.id=id;
		this.name=name;
	}
	AccountTransfer(String id,String name,int bal){
		this.id=id;
		this.name=name;
		this.balance=bal;
	}
	public int Credit(int amt) {
		balance+=amt;
		return balance;
	}
	public void Debit(int amt) {
		if(amt<balance) {
			balance-=amt;
		}
		else {
			System.out.println("amount not insufficent");
		}
	}
	public void TransferTo(AccountTransfer another,int amt) {
		if(amt<=balance) {
			balance-=amt;
			another.Credit(amt);
		}
		else {
			System.out.println("amount exceed");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountTransfer at1=new AccountTransfer("p1","Poe Ei",100000);
		AccountTransfer at2=new AccountTransfer("p2","Phyo",100000);
		
		System.out.println("The balance of"+at1.name+" is "+at1.balance);
		System.out.println("The balance of"+at2.name+" is "+at2.balance);
		
		at1.TransferTo(at2, 10000);
		
		System.out.println("The current balance of"+at1.name+" is "+at1.balance);
		System.out.println("The current balance of"+at2.name+" is "+at2.balance);
	}

}
