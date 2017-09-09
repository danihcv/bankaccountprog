
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

class BankAccountProg{

	private static ArrayList<personAcc> personList;

	public static void main(String[] args) {

        	personList = new ArrayList<>();
        	String names;
        	Random ran = new Random();
        	try{
            		BufferedReader read = new BufferedReader(new FileReader("names.txt"));
            	while((names = read.readLine()) != null){
                	personList.add(new personAcc((names)));
            		}
        	}
        	catch (Exception e){
            		System.out.println("Could not locate the file!");
        	}

        	for(int i = 0; i < personList.size(); i++){
            		personList.get(i).setAccount(i+1);	//sets an account number for each person added by 1 everytime
            		personList.get(i).setBalance(ran.nextInt(200) + 1);
            		personList.get(i).viewInfo();
        	}

		Scanner sc = new Scanner(System.in);
        	System.out.println("User Authentication\nEnter Name: ");
        	String name = sc.next();
        	authenticate(name); //calls out the method authenticate
    	}

	public static void authenticate(String name){

        for(int i = 0; i < personList.size(); i++){
            if(name.equals(personList.get(i).viewName())) {
                int option = 0;

                do {
                        System.out.println("What would like to do?\n1. Deposit\n2. Withdraw\n3. View Balance\n4. View Info\n5. Exit");
                        Scanner sc = new Scanner(System.in);
                        option = sc.nextInt();

                        switch (option) {
                            case 1:
                                System.out.println("How much do you want to deposit: ");
                                int amount = sc.nextInt();
                                personList.get(i).deposit(amount);
                                break;
                            case 2:
                                System.out.println("How much do you want to withdraw: ");
                                int amount2 = sc.nextInt();
                                personList.get(i).withdraw(amount2);
                                break;
                            case 3:
                                personList.get(i).viewBalance();
                                break;
                            case 4:
                                personList.get(i).viewInfo();
                                break;
                            case 5:
                            default:
                                System.out.println("You exited the program");
                                break;
                        }
                } while (option == 1 || option == 2 || option == 3 || option == 4);
            }
                //no else function
        }
    }	
}


