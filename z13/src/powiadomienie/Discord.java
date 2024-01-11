package powiadomienie;

public class Discord implements Powiadomienie{
    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("Wysłano wiadomość");
        System.out.println(wiadomosc);
    }
}
