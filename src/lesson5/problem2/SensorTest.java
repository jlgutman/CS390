package lesson5.problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SensorTest {
    void main() {
        LocalDateTime dateTime = LocalDateTime.of(2026, 3, 2, 15, 55);
        Sensor s1 = new TemparatureSensor("Living Room", dateTime, 23.5);
        Sensor s2 = new LightSensor("Garden", dateTime, 80.0);
        Sensor s3 = new SoundSensor("Bedroom", dateTime, 65.0);
        Sensor s4 = new TemparatureSensor("Master Bedroom", dateTime, 31.5);
        Sensor s5 = new LightSensor("Hallway", dateTime, 100.0);

        Sensor[] sensors = {s1, s2, s3, s4, s5};
        for (Sensor s : sensors){
            System.out.println(s.toString()+"\n");
        }
    }
}
