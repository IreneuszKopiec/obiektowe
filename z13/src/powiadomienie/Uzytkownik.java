package powiadomienie;

public class Uzytkownik {
    private Powiadomienie powiadomienie;

    public Uzytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    public void powiadomienieOModernizacji(String informacja) {
        powiadomienie.wyslij(informacja);
    }
}
