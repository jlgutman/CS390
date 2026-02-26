package lesson3.problem3;

public record HotelBooking(String hotelName, int nights, double pricePerNight) {
    public HotelBooking{
        if(hotelName == null){
            throw new IllegalArgumentException("Invalid input");
        }
    }

    public double totalCost(){
        return nights * pricePerNight;
    }
}
