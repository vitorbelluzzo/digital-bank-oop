package models;

public abstract class Account implements IAccount {

    private static final int StandardAgency = 1;
    private static int sequential = 1;

    protected int agency;
    protected int account;
    protected double balance;
    protected Customer customer;

    public Account(Customer customer) {
        this.account = sequential++;
        this.agency = StandardAgency;
        this.customer = customer;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void transfer(double value, IAccount AccountReceiver) {
        this.withdraw(value);
        AccountReceiver.deposit(value);
    }

    public int getAccount() {
        return account;
    }

    public int getAgency() {
        return agency;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }


    public void printStatement() {
        System.out.printf("Cliente: %s%n", this.customer);
        System.out.printf("Agência: %d%n", this.agency);
        System.out.printf("Conta: %d%n", this.account);
        System.out.printf("Saldo: %.2f%n", this.balance);
    }


}
