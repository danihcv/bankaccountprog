
import java.util.ArrayList;
import java.text.Format;

class BankAccountProg{

public static void main(String[] args){

	//Main code here 
	System.out.println("Welcome to your account");
<<<<<<< HEAD
	ArrayList<personsAcc> personList = new ArrayList<personsAcc>();
	personList.add(new personsAcc("John"));
	personList.add(new personsAcc("Smith"));
	personList.add(new personsAcc("James"));
	personList.add(new personsAcc("Robert"));

	for(int i = 0; i < personList.size(); i++){
		personList.get(i).setAccount(i+1);	//sets an account number for each person added by 1 everytime
		personList.get(i).setBalance(Math.random() * 300 + 1);
		personList.get(i).viewInfo();
		}
=======
	personsAcc person1 = new personsAcc("John");
	person1.setAccount(0001);
	person1.setBalance(0.0);
	person1.deposit(20);
	person1.viewBalance();
	person1.deposit(5);
	person1.withdraw(15);
	//person1.viewBalance();
	person1.viewInfo();
>>>>>>> 3d1fda0dc641a36af54e5a8bf2ddb2fbf94c3e0c
	} 	
}

class personsAcc{

	private	String name;
	private int accountNum;
	private double accountBal = 0;

	personsAcc(String name){	
		this.name = name;
	}

	//We need to check for same account numbers
	public int setAccount(int accountNum){
		this.accountNum = accountNum;
		return accountNum;	
	}

	public double setBalance(double accountBal){
		this.accountBal += accountBal;
		return accountBal;	
	}

	public void viewBalance(){
		System.out.println("Your balance is: " + accountBal);
	}

	public void deposit(double accountBal){
		this.accountBal += accountBal;
	}

	public void withdraw(double accountBal){
		this.accountBal -= accountBal;
	}

	public void viewInfo(){
		String info = new String("Name: " + name + "\nAccount Number: " + accountNum + "\nAccount Balance: " + accountBal);
		System.out.println(info);
	}
}

