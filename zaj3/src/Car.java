public class Car {
    public String brand;
    public String model;
    public int speed;

    public void accelerate(int value) {
        speed+=value;
    }
    public void decelerate(int value) {
        speed-=value;
    }

    private void blowEngine() {
        System.out.println("Boom");
    }
}
