public class Czlowiek {
    public String imie;

    public void przedstawSie() {
        System.out.println("Cześć jestem "+this.imie);
    }

    public void powiedzCzesc(Czlowiek os) {
        System.out.println("Cześć "+os.imie);
    }

    public void zmienImie(String imie) {
        this.imie=imie;
    }

    public void zamienImionami(Czlowiek os) {
        String help=this.imie;
        this.imie=os.imie;
        os.imie=help;
    }

}
