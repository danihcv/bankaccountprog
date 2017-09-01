

class BankAccountProg{

public static void main(String[] args){

	//Main code here 
	System.out.println("Welcome to your account");
	personsAcc person1 = new personsAcc("John");
	person1.setAccount(0001);
	person1.setBalance(0.0);
	person1.deposit(20);
	person1.viewBalance();	
	} 	
}

class personsAcc{

	String name;
	int accountNum;
	double accountBal;

	personsAcc(String name){	
		this.name = name;
	}

	public int setAccount(int accountNum){
		this.accountNum = accountNum;
		return accountNum;	
	}

	public double setBalance(double accountBal){
		this.accountBal = accountBal;
		return accountBal;	
	}

	public void viewBalance(){
		System.out.println("Your balance is: " + accountBal);
	}

	public void deposit(double accountBal){
		this.accountBal = accountBal;
	}

	public void withdraw(double accountBal){
		this.accountBal = accountBal;
	}
}

