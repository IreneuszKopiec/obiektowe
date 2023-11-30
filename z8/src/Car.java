public record Car(String brand, String model,
                  int fuelConsumptionPer100km)
{
    public void fuelCost(double fuelPrice, double distance) {
        System.out.println(fuelPrice*distance);
    }
}
