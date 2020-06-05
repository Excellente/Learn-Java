package classes;

public class ChequeAccount extends Account {

    public ChequeAccount(int accNumber){
        super(accNumber);
    }
    public ChequeAccount(int accNumber, double msFee, double balance, String fname, String lname, String accType) {
        super(accNumber);
        this.balance = balance;
        this.accType = accType;
        this.monthlyServiceFee = msFee;
        this.accHolderLastName = lname;
        this.accHolderFirstName = fname;
    }

    /* ======================= getters ======================= */
    public double getBalance() {
        return this.balance;
    }

    /* ======================= setters ======================= */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    /* ======================= Member methods ======================= */
    public void withdraw(double wAmount) throws IllegalArgumentException {
        if (wAmount > this.balance) throw new IllegalArgumentException("Insufficient funds.");
        else if (wAmount < 0) throw new IllegalArgumentException("Invalid value for withdrawal.");
        this.balance -= wAmount;
    }

    public void deposit(double dAmount) throws IllegalArgumentException {
        if (!(dAmount > 0)) throw new IllegalArgumentException("Invalid value for deposit");
        double current = this.getBalance();
        this.setBalance( current + dAmount);
    }

    public double checkBalance() {
        return this.getBalance();
    }
}
