package lesson5.problem4;

public class Refrigerator implements Appliance {
    private int temperature;
    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    @Override
    public void performFunction() {
        System.out.println("Cooling items at temperature: " + temperature + "°C.");
    }
}
