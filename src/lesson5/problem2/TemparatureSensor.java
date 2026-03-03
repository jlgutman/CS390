package lesson5.problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemparatureSensor implements Sensor{
    private String location;
    private LocalDateTime lastUpdated;
    private double temperature;

    public TemparatureSensor(String location, LocalDateTime lastUpdated, double temperature) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.temperature = temperature;
    }

    @Override
    public String getSensorType() {
        return "";
    }

    @Override
    public double getReading() {
        return 0;
    }

    @Override
    public String getLocation() {
        return "";
    }

    @Override
    public LocalDateTime getLastUpdated() {
        lastUpdated = LocalDateTime.now();
        return lastUpdated;
    }

    @Override
    public String performAction() {
        String action = "";
        if (temperature > 30) {
            action = "an alert to turn on the AC";
        } else if (temperature < 18) {
            action = "an alert to turn on the Heater";
        } else {
            action = "Temperature is in normal range";
        }
        return action;
    }

    @Override
    public String toString(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm a");
        return "Sensor Type: Temparature\n" +
                "Reading: "+temperature+"\n" +
                "Location: "+location+"\n" +
                "Last Updated: "+getLastUpdated().format(fmt)+"\n" +
                "Action: "+performAction();
    }
}
