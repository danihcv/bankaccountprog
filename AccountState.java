abstract class AccountState {
    int accountNum;
    double accountBal = 0;

    int getAccountNum() {
        return accountNum;
    }

    void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    double getAccountBal() {
        return accountBal;
    }

    AccountState setAccountBal(double accountBal) {
        this.accountBal = accountBal;

        if (this.accountBal > 0) {
            return new PositiveBalance(this.accountNum, this.accountBal);
        } else if (this.accountBal == 0) {
            return new NonPositiveBalance(this.accountNum, this.accountBal);
        }
        return this;
    }

    AccountState(int accountNum, double accountBal) {
        this.accountNum = accountNum;
        this.accountBal = accountBal;
    }

    abstract AccountState deposit(double amount);

    abstract AccountState withdraw(double amount);
}