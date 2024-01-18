package z8;

public record BankAccount(String numerKonta, int saldo) {

    public BankAccount(String numerKonta) {
        this(numerKonta, 0);
    }
}
