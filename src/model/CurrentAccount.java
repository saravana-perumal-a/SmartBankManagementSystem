package model;

public class CurrentAccount extends Account{
    public CurrentAccount(String accno,double balance){
        super(accno,balance);
    }

    @Override
    public double calculateintrest() {
        return getBalance()*0.02;
    }
}
