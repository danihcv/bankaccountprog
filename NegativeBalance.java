public class NegativeBalance extends AccountState {
    NegativeBalance(int accountNum, double accountBal) {
        super(accountNum, accountBal);
    }

    @Override
    AccountState deposit(double amount) {
        this.accountBal += amount;
        if (this.accountBal >= 0) {
            System.out.println(">> You got rid of your debts!");
            return new PositiveBalance(this.accountNum, this.accountBal);
        } else {
            System.out.println(">> Deposit made! Remember to pay your debts entirely! Your current balance is $"+ this.accountBal);
        }
        return this;
    }

    @Override
    AccountState withdraw(double amount) {
        System.out.println(">> You cannot withdraw with a negative account! Your current balance is $"+ this.accountBal);
        return this;
    }

    @Override
    public String toString() {
        return "Negative";
    }
}
