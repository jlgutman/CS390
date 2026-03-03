package lesson5.problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor{
    private String location;
    private LocalDateTime lastUpdated;
    private double soundLevel;

    public SoundSensor(String location, LocalDateTime lastUpdated, double soundLevel) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.soundLevel = soundLevel;
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
        return soundLevel > 70 ? "an alert to turn on noise cancellation" : "Sound is within normal range";
    }

    @Override
    public String toString(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm a");
        return "Sensor Type: Sound\n" +
                "Reading: "+soundLevel+"\n" +
                "Location: "+location+"\n" +
                "Last Updated: "+getLastUpdated().format(fmt)+"\n" +
                "Action: "+performAction();
    }
}
