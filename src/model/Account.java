package model;

public class Account {
    private String accno;
    private double balance;
    public Account(String accno,double balance){
        this.accno = accno;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance = balance+amount;
        }
    }
    public void withdraw(double amount){
        if(amount<=balance && amount>0){
            balance = balance-amount;
        }
    }
    public String getAccountnumber(){
        return accno;
    }
    public double calculateintrest(){
        return 0;
    }
}
