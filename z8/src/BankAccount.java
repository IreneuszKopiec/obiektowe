public record BankAccount(String numer, int saldo) {


    public BankAccount(String name) {
        this(name,0);
    }
}
