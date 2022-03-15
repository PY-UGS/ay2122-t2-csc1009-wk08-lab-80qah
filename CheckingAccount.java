public class CheckingAccount {
    private double balance;
    private int accountNumber;

    public int getNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CheckingAccount(int accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public CheckingAccount(){

    }

    public void deposit(double amount) throws Exception{
        if(amount<0){
            throw new IllegalArgumentException("Deposit amount cannot be less than 0");
        }
        else{
            balance = balance+amount;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException, Exception {
        if(amount>balance){
            throw new InsufficientFundsException(balance-amount);
        }
        else if(amount<0){
            throw new IllegalAccessException("Withdraw cannot be less than 0");
        }
        balance = balance-amount;
    }
}
