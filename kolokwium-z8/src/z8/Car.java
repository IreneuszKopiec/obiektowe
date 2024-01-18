package z8;

public record Car(String brand, String model, double fuelConsumptionPer100KM) {
    public double fuelCost(double fuelPrice, double distance) {
        return fuelPrice*distance*fuelConsumptionPer100KM/100;
    }

}
