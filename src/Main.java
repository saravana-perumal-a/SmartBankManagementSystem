import model.Customer;
import model.Account;
import model.SavingsAccount;
import model.CurrentAccount;
import model.BusinessAccount;
public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("Saravana","9876543210","saravana@gmail.com");
        Account account1 = new Account("ACC1001",5000);
        System.out.println("balance:"+ account1.getBalance());
        account1.deposit(500);
        account1.withdraw(1000);
        Account savings = new SavingsAccount("SAV001",5000);
        Account current = new CurrentAccount("CUR001",10000);
        Account businessAccount = new BusinessAccount("BSA001",50000);
        savings.deposit(2000);
        current.withdraw(3000);
        businessAccount.withdraw(10000);
        System.out.println("Savings:"+savings.getBalance());
        System.out.println("current:"+current.getBalance());
        System.out.println("Business:"+businessAccount.getBalance());
        System.out.println("Savingsintrest:"+savings.calculateintrest());
        System.out.println("Currentintrest:"+ current.calculateintrest());

    }
}
