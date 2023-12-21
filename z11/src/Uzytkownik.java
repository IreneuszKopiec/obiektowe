public class Uzytkownik {
    private final Powiadomienie powiadomienie;

    public Uzytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    public void powiadomOModernizacji(String informacja) {
        System.out.println("Modernizacja: ");
        powiadomienie.wyslij(informacja);
    }
}
