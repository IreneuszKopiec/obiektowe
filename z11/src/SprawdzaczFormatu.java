public class SprawdzaczFormatu {
    public void sprawdzFormatdanych(String dane) throws NiepoprawnyFormatDanychException {
        if(dane.length()<3) {
            throw new NiepoprawnyFormatDanychException();
        } else {
            System.out.println("Wszystko OK");
        }
    }
}
