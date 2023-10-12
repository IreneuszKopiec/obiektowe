import java.util.Random;

public class Main {
    public static Random random = new Random();
    public static void main(String[] args) {


        System.out.println(generateRandomInt());
    }

    public static int generateRandomInt() {
        return random.nextInt(10, 15);
    }

    public static double generateRandomDouble() {
        return random.nextDouble();
    }


}