public class PositiveBalance extends AccountState {
    PositiveBalance(int accountNum, double accountBal) {
        super(accountNum, accountBal);
    }

    @Override
    public AccountState deposit(double amount) {
        this.accountBal += amount;
        if (this.accountBal <= 0) {
            return new NonPositiveBalance(this.accountNum, this.accountBal);
        }
        return this;
    }

    @Override
    public AccountState withdraw(double amount) {
        if (this.accountBal < amount) {
            System.out.println("Not enough funds!");
            return this;
        }
        this.accountBal -= amount;
        if (this.accountBal <= 0) {
            return new NonPositiveBalance(this.accountNum, this.accountBal);
        }
        return this;
    }

    @Override
    public String toString() {
        return "Positive";
    }
}
