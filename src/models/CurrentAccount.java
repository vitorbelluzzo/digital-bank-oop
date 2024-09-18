package models;

public class CurrentAccount extends Account {

    public CurrentAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Extrato de Conta Corrente ===");
        super.printStatement();
    }
}
