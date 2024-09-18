package models;

public class SavingAccount extends Account {
    public SavingAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Extrato de Conta Corrente ===");
        super.printStatement();
    }
}
