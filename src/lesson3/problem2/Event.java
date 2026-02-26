package lesson3.problem2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Event {
    private String name;
    private LocalDateTime dateTime;
    private ZoneId systemZone;

    public Event(String name, LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
        this.systemZone = ZoneId.systemDefault();
    }

    public DayOfWeek getDayOfWeek() {
        return dateTime.getDayOfWeek();
    }

    public boolean isLeapYear() {
        return Year.of(dateTime.getYear()).isLeap();
    }

    public long daysUntilEvent() {
        LocalDate today = LocalDate.now();
        return ChronoUnit.DAYS.between(today, dateTime.toLocalDate());
    }

    public ZonedDateTime asZoned() {
        return dateTime.atZone(systemZone);
    }

    public ZonedDateTime convertTo(ZoneId targetZone) {
        return asZoned().withZoneSameInstant(targetZone);
    }

    public String formatEventDetails(ZonedDateTime zdt) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy '@' HH:mm", Locale.ENGLISH);
        return zdt.format(fmt) + " [" + zdt.getZone().getId() + "]";
    }
}
