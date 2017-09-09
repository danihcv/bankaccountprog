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

    void setAccountBal(double accountBal) {
        this.accountBal = accountBal;
    }

    AccountState(int accountNum, double accountBal) {
        this.accountNum = accountNum;
        this.accountBal = accountBal;
    }

    abstract AccountState deposit(double amount);

    abstract AccountState withdraw(double amount);
}
