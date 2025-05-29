abstract class Account {
	private long acn; protected double bal;
	public Account(long a,double b)	{
		acn=a;		bal=b;
	}
    public long getacn() {
		return acn;
	}
	public double getBal() {
		return bal;
	}
    abstract public void deposit(double amt);
	abstract public void withdraw(double amt);
    public void displaydetails() {
		System.out.println("Account Number: "+getacn()+"\nBalance: "+getBal());
	}
}

class SavingsAccount extends Account {
	double interestrate;
	public SavingsAccount(long a, double b,double i) {
		super(a, b);
		interestrate=i;
	}

	public void deposit(double amt) {	
		bal=bal+amt;
        double interest= amt*(interestrate/100);
        System.out.println("Deposited Amount: "+amt+" & Interest Added is: "+interest);
	}

	public void withdraw(double amt) {
			if(bal<amt)     System.out.println("Insufficient Balance");
            else {    bal=bal-amt;
            System.out.println("Withdran Amount: "+amt);
            }
	}
}

class CurrentAccount extends Account {
	double odl;
	public CurrentAccount(long a, double b,double odl) {
		super(a, b);
		this.odl=odl;
	}
	public void deposit(double amt) {
		bal=bal+amt;
        System.out.println("Deposited Amount: "+amt);
	}
	public void withdraw(double amt) {
		if(amt <= bal+odl)	{
            bal=bal-amt;
            System.out.println("The Withdrawn Amount is: "+amt);
        }
		else	System.out.println("Withdrawl Exceeds overdraft Limit");
	}
}
public class Q8A {
	public static void main(String[] args) {
		Account as=new SavingsAccount(1234567,500000.0,7.5);
		as.deposit(4000);
		as.withdraw(60000);
		as.displaydetails();
		
		Account cs=new CurrentAccount(1234567,500000.0,80000);
		cs.deposit(4000);
		cs.withdraw(90000);
		cs.displaydetails();
		
	}
}
