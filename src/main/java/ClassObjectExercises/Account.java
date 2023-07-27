package ClassObjectExercises;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int ID;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private Client client ;
    private ArrayList<Transaction> transactions;

    public Account(int ID, double balance, double annualInterestRate,Client client) {
        this.ID = ID;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.client = client;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();

    }

    public Boolean withdraw(double amount){
        if(this.balance-amount>=0){
            this.balance -= amount;
            transactions.add(new Transaction('W',amount,this.balance,"withdrew operation"));
            return true;
        }else return false;
    }
    public void deposit(double amount){
        if(amount>0){
            this.balance += amount;
            transactions.add(new Transaction('D',amount,this.balance,"deposit operation"));
        }



    }

    public int getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                ", transactions=" + transactions +
                '}';
    }
}
