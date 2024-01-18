package z11;

public class SprawdzaczFormatu {
    public void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        if(dane.length()<3) {
            throw new NiepoprawnyFormatDanychException();
        }
        else {
            System.out.println("Wszystko OK");
        }
    }

}
