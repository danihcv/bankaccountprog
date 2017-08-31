

class BankAccountProg{

public static void main(String[] args){

	//Main code here 
	System.out.println("Welcome to your account");
	}
  private double balance;
   public BankAccountProg(){
   }
   public BankAccountProg ( double balance){
	   this.balance = balance;
	   

//This function will deposit money into an account
public void depositM(double amount){
   balance +=amount;
 

	}

//This function will withdraw money from the account
public void withdrawM(double amount){
      balance-=amount

	}
	
	BankAccountProg bal = new BankAccountProg ();
	bal.depositM();
	bal.withdrawM();
	
	
}


