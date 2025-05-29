interface Ba {
	abstract void deposit(double amt);
	abstract void withdraw(double amt);
	abstract double chkbal();
}
class Bank implements Ba{
	private int acn;	private String acnm;	private double bal;
	public Bank(int acn,String acnm,double bal) {
		this.acn=acn;		this.acnm=acnm;				this.bal=bal;
	}
	public void deposit(double amt) {	
		bal=bal+amt;		System.out.println("Available Balance is: "+bal);
	}
	public void withdraw(double amt){
		if(bal>amt)		bal=bal-amt;
		else System.out.println("The Balance is Insufficient");
		System.out.println("Remaining Balance is: "+bal);
	}
	public double chkbal() {		return bal;			}
}

public class CW2_DataAbstraction_BankAccount {
	public static void main(String[] args) {
		Ba ob=new Bank(1234,"Arpit Kumar",15500.70);
		System.out.println("Initial Balance is: "+ob.chkbal());
		ob.deposit(1000);
		ob.withdraw(10000);
		System.out.println("Final Balance is: "+ob.chkbal());
	}
}
