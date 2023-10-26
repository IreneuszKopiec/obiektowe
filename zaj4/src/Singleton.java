public class Singleton {
    public static Singleton x;


    private Singleton() {

    }

    public static Singleton getInstance() {
        return new Singleton();
    }



}
