package lesson3.problem2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter the event name: ");
        String eventName = sc.nextLine();
        IO.println("Enter the event date (YYYY-MM-DD): ");
        String date = sc.nextLine();
        IO.println("Enter the event tine (HH:mm): ");
        String time = sc.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date+" "+time, fmt);

        Event event = new Event(eventName, dateTime);
        IO.println("Event Date and Time: " + event.formatEventDetails(event.asZoned()));
        IO.println("Day of the Week: " + event.getDayOfWeek());
        IO.println("Is it a leap year: " + event.isLeapYear());
        IO.println("Days until event: " + event.daysUntilEvent());

        IO.println("Enter the target time zone (e.g., America/New_York): ");
        String newZone = sc.nextLine();
        ZonedDateTime convertedZone = event.convertTo(ZoneId.of(newZone));
        IO.println("Event time in " +newZone+ ": " + event.formatEventDetails(convertedZone));

    }
}
