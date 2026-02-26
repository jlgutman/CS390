package lesson3.problem3;

public final class CarRental {
    private final String carModel;
    private final int days;
    private final double ratePerDay;
    private final int milesPerDay;

    public CarRental(String carModel, int days, double ratePerDay, int milesPerDay) {
        if(carModel == null){
            throw new IllegalArgumentException("Invalid input");
        }

        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public double totalRentalCost(){
        return days * ratePerDay;
    }

    public double totalMilesAllowed(){
        return days * milesPerDay;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getDays() {
        return days;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    public int getMilesPerDay() {
        return milesPerDay;
    }
}
