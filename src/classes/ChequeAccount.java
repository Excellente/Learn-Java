package classes;

public class ChequeAccount extends Account {

    public ChequeAccount(){}
    public ChequeAccount(int accNumber, double msFee, double balance, String fname, String lname, String accType) {
        super(accNumber, msFee, balance, fname, lname, accType);
    }
}
