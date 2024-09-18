import models.Account;
import models.CurrentAccount;
import models.Customer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer Vitor = new Customer("Vitor");
        Customer Sophia = new Customer("Sophia");

        Account contaCorrenteVitor = new CurrentAccount(Vitor);
        Account contaCorrenteSophia = new CurrentAccount(Sophia);
        contaCorrenteVitor.deposit(100);
        contaCorrenteSophia.printStatement();
        contaCorrenteVitor.printStatement();
        contaCorrenteVitor.transfer(50, contaCorrenteSophia);
        contaCorrenteVitor.printStatement();
        contaCorrenteSophia.printStatement();


    }
}