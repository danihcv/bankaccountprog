public class NonPositiveBalance extends AccountState {
    NonPositiveBalance(int accountNum, double accountBal) {
        super(accountNum, accountBal);
    }

    @Override
    AccountState deposit(double amount) {
        this.accountBal += amount;
        if (this.accountBal > 0) {
            return new PositiveBalance(this.accountNum, this.accountBal);
        }
        return this;
    }

    @Override
    AccountState withdraw(double amount) {
        System.out.println("Not enough funds!");
        return this;
    }

    @Override
    public String toString() {
        return "Non positive";
    }
}
