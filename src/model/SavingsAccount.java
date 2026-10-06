package model;

public class SavingsAccount extends Account{
    public SavingsAccount(String accno,double balance){
        super(accno,balance);
    }

    @Override
    public double calculateintrest(){
        return getBalance()*0.04;
    }
}
