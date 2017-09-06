
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

class BankAccountProg{

	public static void main(String[] args) {

        	ArrayList<personAcc> personList = new ArrayList<personAcc>();
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
    	}	
}


