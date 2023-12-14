interface VehicleManager{
    abstract String startEngine();
    abstract int getFuelLevel();
}

class Car implements VehicleManager{


    @Override
    public String startEngine() {
        return "Silnik samochodu uruchomiony";
    }

    @Override
    public int getFuelLevel() {
        return 50;
    }
}

class Motorcycle implements VehicleManager {

    @Override
    public String startEngine() {
        return "Silnik motocykla uruchomiony";
    }

    @Override
    public int getFuelLevel() {
        return 30;
    }
}

public class VehicleManagerTest {
    public static void main(String[] args) {
        Car c=new Car();
        Motorcycle m =new Motorcycle();
        System.out.println(c.startEngine());
        System.out.println(c.getFuelLevel());
        System.out.println(m.startEngine());
        System.out.println(m.getFuelLevel());


    }
}


