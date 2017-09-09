public class PositiveBalance extends AccountState {
    PositiveBalance(int accountNum, double accountBal) {
        super(accountNum, accountBal);
    }

    @Override
    public AccountState deposit(double amount) {
        this.accountBal += amount;
        return this;
    }

    @Override
    public AccountState withdraw(double amount) {
        this.accountBal -= amount;
        if (this.accountBal < 0) {
            System.out.println(">> Your account is now negative! Your current balance is $"+ this.accountBal);
            return new NegativeBalance(this.accountNum, this.accountBal);
        }
        return this;
    }

    @Override
    public String toString() {
        return "Positive";
    }
}
