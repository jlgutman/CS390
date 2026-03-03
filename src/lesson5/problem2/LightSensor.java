package lesson5.problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor{
    private String location;
    private LocalDateTime lastUpdated;
    private double lightLevel;

    public LightSensor(String location, LocalDateTime lastUpdated, double lightLevel) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.lightLevel = lightLevel;
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
        return lightLevel < 100 ? "an alert to turn on the light" : "Light is sufficient";
    }

    @Override
    public String toString(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm a");
        return "Sensor Type: Light\n" +
                "Reading: "+lightLevel+"\n" +
                "Location: "+location+"\n" +
                "Last Updated: "+getLastUpdated().format(fmt)+"\n" +
                "Action: "+performAction();
    }
}
