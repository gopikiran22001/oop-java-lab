class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account() {
    }

    public int getAccountNumber() {
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
    public void withDraw(double amount) {
        balance-=amount;
    }
    public void display() {
        System.out.println("Account [Account Number:"+accountNumber+", Balance:"+balance+" ]");
    }
}

class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int accountNumber, double balance, double interest) {
        super(accountNumber, balance);
        this.interest = interest;
    }

    public SavingsAccount() {
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    public void display() {
        System.out.println("Savings Account [Account Number:"+getAccountNumber()+", Balance:"+getBalance()+",Interest Rate:"+interest+" ]");
    }

}

class CurrentAccount extends Account {
    private double overDraft;

    public CurrentAccount(int accountNumber, double balance, double overDraft) {
        super(accountNumber, balance);
        this.overDraft = overDraft;
    }

    public CurrentAccount() {
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    public void withDraw(double amount) {
        if(amount<=overDraft) {
            super.withDraw(amount);
        }
        else {
            System.out.println("Limit exced");
        }
    }
    public void display() {
        System.out.println("Current Account [Account Number:"+getAccountNumber()+", Balance:"+getBalance()+",Overdraft Limit:"+overDraft+" ]");
    }
}

public class Bank {
    public static void main(String[] args) {
        Account savingsAccount=new SavingsAccount(123456789,35000,5);
        Account currentAccount=new CurrentAccount(852369741,50000,25000);

        savingsAccount.display();

        currentAccount.display();

        currentAccount.withDraw(30000);

        currentAccount.withDraw(20000);

        currentAccount.display();
    }
}
