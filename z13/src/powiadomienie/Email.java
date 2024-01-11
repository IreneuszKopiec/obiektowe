package powiadomienie;

public class Email implements Powiadomienie{
    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("Wysłano maila o treści: ");
        System.out.println(wiadomosc);
    }
}
