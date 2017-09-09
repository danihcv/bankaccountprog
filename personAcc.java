public class personAcc {
    private AccountState account = null;

    private	String name;

    personAcc(String name){
        this.name = name;
    }

    //We need to check for same account numbers
    public int setAccount(int accountNum){
        if (this.account == null) {
            this.account = new PositiveBalance(accountNum, 0);
        } else {
            this.account.setAccountNum(accountNum);
        }
        return accountNum;
    }

    public double setBalance(double accountBal) {
        if (this.account == null) {
            return 0;
        }  else {
            this.account.setAccountBal(accountBal);
        }
        return accountBal;
    }

    public void viewBalance(){
        System.out.println("Your balance is: $" + this.account.getAccountBal());
    }

    public void deposit(double amount){
        this.account = this.account.deposit(amount);
    }

    public void withdraw(double amount){
        this.account = this.account.withdraw(amount);
    }

    public void viewInfo(){
        String info = "Welcome to your Account. \n" +
                "Name: " + name + "\n" +
                "Account Number: " + this.account.getAccountNum() + "\n" +
                "Account Balance: $" + this.account.getAccountBal() + "\n" +
                "Account Status: " + this.account + "\n";
        System.out.println(info);
    }

    public String viewName(){
        return name;
    }

    public double getBalance(){
        return this.account.getAccountBal();
    }
}

