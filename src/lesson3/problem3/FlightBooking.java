package lesson3.problem3;

public record FlightBooking(String origin, String destination, int distanceKm) {
    public FlightBooking{
        if(origin == null || destination == null){
            throw new IllegalArgumentException("Invalid input");
        }
    }

    public double computeFlightTime(double avgSpeed){
        return distanceKm / avgSpeed;
    }
}
