package lesson5.problem3;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;//percentage

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    double getPayment() {
        return grossSales * (commissionRate/100);
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                super.toString() +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                ", payment=" + getPayment() +
                "} ";
    }
}
